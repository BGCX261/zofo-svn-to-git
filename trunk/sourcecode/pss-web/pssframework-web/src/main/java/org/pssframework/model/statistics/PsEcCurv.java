package org.pssframework.model.statistics;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** 
 *        数据产生：由采集平台直接写上送数据进来；业务平台负责使用及转到历史表；
 *     
*/
public class PsEcCurv implements Serializable {
    @Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 6693443019817296538L;

	/** identifier field */
	private BigDecimal gpId;

    /** identifier field */
    private BigDecimal psId;

    /** identifier field */
    private String psName;

    private BigDecimal tgId;

    private String tgNo;

    private String tgName;

	/** identifier field */
	private Date dataTime;

	/** nullable persistent field */
	private String assetNo;

	/** nullable persistent field */
	private String orgNo;

    /** nullable persistent field */
    private String orgName;

	/** persistent field */
	private String ddate;

	/** persistent field */
	private Date acceptTime;

	/** nullable persistent field */
	private BigDecimal ctTimes;

	/** nullable persistent field */
	private BigDecimal ptTimes;

	/** nullable persistent field */
    private String ecurA;

	/** nullable persistent field */
    private String ecurB;

	/** nullable persistent field */
    private String ecurC;

	/** nullable persistent field */
    private String ecurL;

	/** nullable persistent field */
    private String ecurS;

	/** nullable persistent field */
    private String voltB;

	/** nullable persistent field */
    private String voltA;

	/** nullable persistent field */
    private String voltC;

    private int opened;

    private int locked;

    private String phase;

    private String actionType;

	/** nullable persistent field */
	private String dataFlag;

	/** nullable persistent field */
	private String dataSource;

	public String getAssetNo() {
		return this.assetNo;
	}

	public void setAssetNo(String assetNo) {
		this.assetNo = assetNo;
	}

	public String getOrgNo() {
		return this.orgNo;
	}

	public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
	}

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getDdate() {
		return this.ddate;
	}

	public void setDdate(String ddate) {
		this.ddate = ddate;
	}

	public Date getAcceptTime() {
		return this.acceptTime;
	}

	public void setAcceptTime(Date acceptTime) {
		this.acceptTime = acceptTime;
	}

	public BigDecimal getCtTimes() {
		return this.ctTimes;
	}

	public void setCtTimes(BigDecimal ctTimes) {
		this.ctTimes = ctTimes;
	}

	public BigDecimal getPtTimes() {
		return this.ptTimes;
	}

	public void setPtTimes(BigDecimal ptTimes) {
		this.ptTimes = ptTimes;
	}

    public String getEcurA() {
        return ecurA;
    }

    public void setEcurA(String ecurA) {
        this.ecurA = ecurA;
    }

    public String getEcurB() {
        return ecurB;
    }

    public void setEcurB(String ecurB) {
        this.ecurB = ecurB;
    }

    public String getEcurC() {
        return ecurC;
    }

    public void setEcurC(String ecurC) {
        this.ecurC = ecurC;
    }

    public String getEcurL() {
        return ecurL;
    }

    public void setEcurL(String ecurL) {
        this.ecurL = ecurL;
    }

    public String getEcurS() {
        return ecurS;
    }

    public void setEcurS(String ecurS) {
        this.ecurS = ecurS;
    }

    public String getVoltB() {
        return voltB;
    }

    public void setVoltB(String voltB) {
        this.voltB = voltB;
    }

    public String getVoltA() {
        return voltA;
    }

    public void setVoltA(String voltA) {
        this.voltA = voltA;
    }

    public String getVoltC() {
        return voltC;
    }

    public void setVoltC(String voltC) {
        this.voltC = voltC;
    }

    public int getOpened() {
        return opened;
    }

    public void setOpened(int opened) {
        this.opened = opened;
    }

    public int getLocked() {
        return locked;
    }

    public void setLocked(int locked) {
        this.locked = locked;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getDataFlag() {
		return this.dataFlag;
	}

	public void setDataFlag(String dataFlag) {
		this.dataFlag = dataFlag;
	}

	public String getDataSource() {
		return this.dataSource;
	}

	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	/**
	 * @return the gpId
	 */
	public BigDecimal getGpId() {
		return gpId;
	}

	/**
	 * @param gpId the gpId to set
	 */
	public void setGpId(BigDecimal gpId) {
		this.gpId = gpId;
	}

    public BigDecimal getPsId() {
        return psId;
    }

    public void setPsId(BigDecimal psId) {
        this.psId = psId;
    }

    public String getPsName() {
        return psName;
    }

    public void setPsName(String psName) {
        this.psName = psName;
    }

    public BigDecimal getTgId() {
        return tgId;
    }

    public void setTgId(BigDecimal tgId) {
        this.tgId = tgId;
    }

    public String getTgNo() {
        return tgNo;
    }

    public void setTgNo(String tgNo) {
        this.tgNo = tgNo;
    }

    public String getTgName() {
        return tgName;
    }

    public void setTgName(String tgName) {
        this.tgName = tgName;
    }

    /**
     * @return the dataTime
     */
	public Date getDataTime() {
		return dataTime;
	}

	/**
	 * @param dataTime the dataTime to set
	 */
	public void setDataTime(Date dataTime) {
		this.dataTime = dataTime;
	}

}
