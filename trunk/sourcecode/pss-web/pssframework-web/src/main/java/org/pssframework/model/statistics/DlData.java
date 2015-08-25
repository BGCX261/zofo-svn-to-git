package org.pssframework.model.statistics;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * 
 * @author Nick
 * 
 */
public class DlData implements Serializable {
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 2796097718178105448L;

    /** identifier field */
    private BigDecimal gpId;

    /** identifier field */
    private Date dataTime;

    /** nullable persistent field */
    private String assetNo;

    /** nullable persistent field */
    private BigDecimal orgId;

    /** nullable persistent field */
    private String orgNo;

    /** nullable persistent field */
    private String orgName;

    /** nullable persistent field */
    private String tgNo;

    /** nullable persistent field */
    private String tgName;

    /** persistent field */
    private String ddate;

    /** nullable persistent field */
    private BigDecimal totalTimes;

    /** nullable persistent field */
    private BigDecimal pactTotalLast;

    /** nullable persistent field */
    private BigDecimal pactTotal;

    /** nullable persistent field */
    private BigDecimal pactDl;

    /** default constructor */
    public DlData() {
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public BigDecimal getGpId() {
        return gpId;
    }

    public void setGpId(BigDecimal gpId) {
        this.gpId = gpId;
    }

    public Date getDataTime() {
        return dataTime;
    }

    public void setDataTime(Date dataTime) {
        this.dataTime = dataTime;
    }

    public String getAssetNo() {
        return assetNo;
    }

    public void setAssetNo(String assetNo) {
        this.assetNo = assetNo;
    }

    public BigDecimal getOrgId() {
        return orgId;
    }

    public void setOrgId(BigDecimal orgId) {
        this.orgId = orgId;
    }

    public String getOrgNo() {
        return orgNo;
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

    public String getDdate() {
        return ddate;
    }

    public void setDdate(String ddate) {
        this.ddate = ddate;
    }

    public BigDecimal getTotalTimes() {
        return totalTimes;
    }

    public void setTotalTimes(BigDecimal totalTimes) {
        this.totalTimes = totalTimes;
    }

    public BigDecimal getPactTotalLast() {
        return pactTotalLast;
    }

    public void setPactTotalLast(BigDecimal pactTotalLast) {
        this.pactTotalLast = pactTotalLast;
    }

    public BigDecimal getPactTotal() {
        return pactTotal;
    }

    public void setPactTotal(BigDecimal pactTotal) {
        this.pactTotal = pactTotal;
    }

    public BigDecimal getPactDl() {
        return pactDl;
    }

    public void setPactDl(BigDecimal pactDl) {
        this.pactDl = pactDl;
    }
}
