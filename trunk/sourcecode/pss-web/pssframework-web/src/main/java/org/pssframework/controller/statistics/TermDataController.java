package org.pssframework.controller.statistics;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.jxls.exception.ParsePropertyException;

import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.pssframework.controller.BaseSpringController;
import org.pssframework.model.system.OrgInfo;
import org.pssframework.query.statistics.StatisticsQuery;
import org.pssframework.report.Excel;
import org.pssframework.report.model.ExcelModel;
import org.pssframework.service.statistics.StatisticsManager;
import org.pssframework.service.statistics.StatisticsType;
import org.pssframework.service.system.OrgInfoManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.PageRequest;

import com.google.common.collect.Maps;

/**
 * @author Administrator
 * termEvent
 */
@Controller
@RequestMapping("/statistics/termData")
public class TermDataController extends BaseSpringController {
    private static final String VIEW_NAME = "/statistics/termDataQuery";
    private static final String VIEW_NAME_EVENT = "/statistics/termEventQuery";
    private static final String VIEW_NAME_EVENT_DETAIL04 = "/statistics/termEventDetail04";
    private static final String SDATE = "sdate";
    private static final String EDATE = "edate";
    private static final String ORGLIST = "orglist";

    @Autowired
    private OrgInfoManager orgInfoManager;

    @Autowired
    private StatisticsManager statisticsManager;

    // 默认多列排序,example: username desc,createTime asc
    protected static final String DEFAULT_SORT_COLUMNS = "exTime desc";

    /** binder用于bean属性的设置 */
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
    }

    /**
     * 
     * @param mav
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping
    public ModelAndView index(ModelAndView mav, HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        mav.setViewName(VIEW_NAME);
        initPageParams(mav);
        return mav;
    }

    @SuppressWarnings("unchecked")
    @RequestMapping("/event")
    public ModelAndView showEvent(ModelAndView modelAndView, HttpServletRequest request, HttpServletResponse response,
            StatisticsQuery statisticsQuery) {
        PageRequest<Map> pageRequest = bindPageRequest(request, statisticsQuery, DEFAULT_SORT_COLUMNS);
        Page page = this.statisticsManager.findByPageRequest(pageRequest, StatisticsType.TermEvent);//获取数据模型

        page.setExportReport("/statistics/termData/excel");
        modelAndView.setViewName(VIEW_NAME_EVENT);
        modelAndView.addObject("page", page);
        modelAndView.addObject("pageRequest", pageRequest);
        return modelAndView;
    }

    @SuppressWarnings("unchecked")
    @RequestMapping("/eventDetail04")
    public ModelAndView showDetail04(ModelAndView modelAndView, HttpServletRequest request,
            HttpServletResponse response, StatisticsQuery statisticsQuery) {
        PageRequest<Map> pageRequest = bindPageRequest(request, statisticsQuery, "switchNo asc");
        Page page = this.statisticsManager.findByPageRequest(pageRequest, StatisticsType.TermEventDetail04);// 获取数据模型
        modelAndView.setViewName(VIEW_NAME_EVENT_DETAIL04);
        modelAndView.addObject("page", page);
        modelAndView.addObject("pageRequest", pageRequest);
        return modelAndView;
    }

    @SuppressWarnings("unchecked")
    @RequestMapping("/excel")
    public void excel(ModelAndView mav, HttpServletRequest request, HttpServletResponse response,
            StatisticsQuery statisticsQuery) {
        PageRequest<Map> pageRequest = bindPageRequest(request, statisticsQuery, DEFAULT_SORT_COLUMNS);

        pageRequest.setPageSize(Integer.MAX_VALUE);
        Page page = this.statisticsManager.findByPageRequest(pageRequest, StatisticsType.TermEvent);// 获取数据模型

        Map dataMap = Maps.newHashMap();
        dataMap.put("item", page.getResult());
        dataMap.put("dateFormat", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));

        Excel excel;
        ExcelModel excelModel;
        excelModel = new ExcelModel(VIEW_NAME_EVENT);
        excelModel.setTitle("终端事件");
        excelModel.setDataMap(dataMap);
        excel = new Excel(excelModel);

        try {
            excel.exportData(request, response);
        }
        catch(ParsePropertyException e) {
            logger.error(e.getMessage());
        }
        catch(InvalidFormatException e) {
            logger.error(e.getMessage());
        }
        catch(IOException e) {
            logger.error(e.getMessage());
        }
    }

    /**
     * 初始化页面参数
     * 
     * @param mav
     */
    @SuppressWarnings("unchecked")
    private void initPageParams(ModelAndView mav) {
        Map mapRequest = new LinkedHashMap();
        mav.addObject(ORGLIST, this.getOrgOptions(mapRequest));
        mav.addObject(SDATE, DateFormatUtils.ISO_DATE_FORMAT.format(new Date()));
        mav.addObject(EDATE, DateFormatUtils.ISO_DATE_FORMAT.format(new Date()));
    }

    private List<OrgInfo> getOrgOptions(Map<String, ?> mapRequest) {
        return this.orgInfoManager.findByPageRequest(mapRequest);
    }
}
