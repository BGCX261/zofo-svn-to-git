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
public class GdkkxData implements Serializable {
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

    /** nullable persistent field */
    private BigDecimal psId;

    /** nullable persistent field */
    private String psName;

    /** persistent field */
    private String ddate;

    /** nullable persistent field */
    private BigDecimal eventCount;

    /** nullable persistent field */
    private BigDecimal event00Count;

    /** nullable persistent field */
    private BigDecimal event01Count;

    /** nullable persistent field */
    private BigDecimal event02Count;

    /** nullable persistent field */
    private BigDecimal event03Count;

    /** nullable persistent field */
    private BigDecimal event04Count;

    /** nullable persistent field */
    private BigDecimal event05Count;

    /** nullable persistent field */
    private BigDecimal event06Count;

    /** nullable persistent field */
    private BigDecimal event07Count;

    /** nullable persistent field */
    private BigDecimal event08Count;

    /** nullable persistent field */
    private BigDecimal event09Count;

    /** nullable persistent field */
    private BigDecimal event10Count;

    /** nullable persistent field */
    private BigDecimal event11Count;

    /** nullable persistent field */
    private BigDecimal lockCount;

    /** nullable persistent field */
    private BigDecimal powercutCount;

    /** nullable persistent field */
    private BigDecimal powercutMinutes;

    /** nullable persistent field */
    private BigDecimal totalMinutes;

    /** nullable persistent field */
    private BigDecimal powerSupplyRate;

    /** default constructor */
    public GdkkxData() {
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

    public String getDdate() {
        return ddate;
    }

    public void setDdate(String ddate) {
        this.ddate = ddate;
    }

    public BigDecimal getEventCount() {
        return eventCount;
    }

    public void setEventCount(BigDecimal eventCount) {
        this.eventCount = eventCount;
    }

    public BigDecimal getEvent00Count() {
        return event00Count;
    }

    public void setEvent00Count(BigDecimal event00Count) {
        this.event00Count = event00Count;
    }

    public BigDecimal getEvent01Count() {
        return event01Count;
    }

    public void setEvent01Count(BigDecimal event01Count) {
        this.event01Count = event01Count;
    }

    public BigDecimal getEvent02Count() {
        return event02Count;
    }

    public void setEvent02Count(BigDecimal event02Count) {
        this.event02Count = event02Count;
    }

    public BigDecimal getEvent03Count() {
        return event03Count;
    }

    public void setEvent03Count(BigDecimal event03Count) {
        this.event03Count = event03Count;
    }

    public BigDecimal getEvent04Count() {
        return event04Count;
    }

    public void setEvent04Count(BigDecimal event04Count) {
        this.event04Count = event04Count;
    }

    public BigDecimal getEvent05Count() {
        return event05Count;
    }

    public void setEvent05Count(BigDecimal event05Count) {
        this.event05Count = event05Count;
    }

    public BigDecimal getEvent06Count() {
        return event06Count;
    }

    public void setEvent06Count(BigDecimal event06Count) {
        this.event06Count = event06Count;
    }

    public BigDecimal getEvent07Count() {
        return event07Count;
    }

    public void setEvent07Count(BigDecimal event07Count) {
        this.event07Count = event07Count;
    }

    public BigDecimal getEvent08Count() {
        return event08Count;
    }

    public void setEvent08Count(BigDecimal event08Count) {
        this.event08Count = event08Count;
    }

    public BigDecimal getEvent09Count() {
        return event09Count;
    }

    public void setEvent09Count(BigDecimal event09Count) {
        this.event09Count = event09Count;
    }

    public BigDecimal getEvent10Count() {
        return event10Count;
    }

    public void setEvent10Count(BigDecimal event10Count) {
        this.event10Count = event10Count;
    }

    public BigDecimal getEvent11Count() {
        return event11Count;
    }

    public void setEvent11Count(BigDecimal event11Count) {
        this.event11Count = event11Count;
    }

    public BigDecimal getLockCount() {
        return lockCount;
    }

    public void setLockCount(BigDecimal lockCount) {
        this.lockCount = lockCount;
    }

    public BigDecimal getPowercutCount() {
        return powercutCount;
    }

    public void setPowercutCount(BigDecimal powercutCount) {
        this.powercutCount = powercutCount;
    }

    public BigDecimal getPowercutMinutes() {
        return powercutMinutes;
    }

    public void setPowercutMinutes(BigDecimal powercutMinutes) {
        this.powercutMinutes = powercutMinutes;
    }

    public BigDecimal getTotalMinutes() {
        return totalMinutes;
    }

    public void setTotalMinutes(BigDecimal totalMinutes) {
        this.totalMinutes = totalMinutes;
    }

    public BigDecimal getPowerSupplyRate() {
        return powerSupplyRate;
    }

    public void setPowerSupplyRate(BigDecimal powerSupplyRate) {
        this.powerSupplyRate = powerSupplyRate;
    }
}
