package org.pssframework.controller.statistics;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.jxls.exception.ParsePropertyException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.pssframework.controller.BaseSpringController;
import org.pssframework.query.statistics.StatisticsQuery;
import org.pssframework.report.Excel;
import org.pssframework.report.model.ExcelModel;
import org.pssframework.service.statistics.StatisticsManager;
import org.pssframework.service.statistics.StatisticsType;
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
 * @author Administrator 电压统计数据
 */
@Controller
@RequestMapping("/statistics/voltStatisDay")
public class VoltStatisDayController extends BaseSpringController {
    private static final String VIEW_NAME = "/statistics/voltStatisDayQuery";

    @Autowired
    private StatisticsManager statisticsManager;

    // 默认多列排序,example: username desc,createTime asc
    protected static final String DEFAULT_SORT_COLUMNS = "dataTime asc";

    /** binder用于bean属性的设置 */
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
    }

    /**
     * 
     * @param modelAndView
     * @param request
     * @param response
     * @param statisticsQuery
     * @return
     */
    @SuppressWarnings("unchecked")
    @RequestMapping
    public ModelAndView showPowerCrur(ModelAndView modelAndView, HttpServletRequest request,
            HttpServletResponse response, StatisticsQuery statisticsQuery) {
        PageRequest<Map> pageRequest = bindPageRequest(request, statisticsQuery, DEFAULT_SORT_COLUMNS);
        Page page = this.statisticsManager.findByPageRequest(pageRequest, StatisticsType.VoltStatisDay);// 获取数据模型

        page.setExportReport("/statistics/voltStatisDay/excel");
        modelAndView.setViewName(VIEW_NAME);
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
        Page page = this.statisticsManager.findByPageRequest(pageRequest, StatisticsType.VoltStatisDay);// 获取数据模型

        Map dataMap = Maps.newHashMap();
        dataMap.put("item", page.getResult());
        dataMap.put("dateFormat", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));

        Excel excel;
        ExcelModel excelModel;
        excelModel = new ExcelModel(VIEW_NAME);
        excelModel.setTitle("电压统计数据");
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
}
