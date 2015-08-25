package org.pssframework.model.statistics;

import java.io.Serializable;
import java.math.BigDecimal;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class TermEventDetail04 implements Serializable {
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 511731050366331119L;

    // ED_ID
    private BigDecimal edId;

    // TERM_ID
    private BigDecimal termId;

    // LOGICAL_ADDR
    private String logicalAddr;

    // SWITCH_ID
    private BigDecimal switchId;

    // SWITCH_NO
    private BigDecimal switchNo;

    // SWITCH_TYPE
    private String switchType;

    // SWITCH_NAME
    private String switchName;

    //
    private String alarmName;

    private BigDecimal orgId;
    private String orgNo;
    private String orgName;
    private BigDecimal tgId;
    private String tgNo;
    // TG_NAME
    private String tgName;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    public BigDecimal getEdId() {
        return edId;
    }

    public void setEdId(BigDecimal edId) {
        this.edId = edId;
    }

    public BigDecimal getTermId() {
        return termId;
    }

    public void setTermId(BigDecimal termId) {
        this.termId = termId;
    }

    public String getLogicalAddr() {
        return logicalAddr;
    }

    public void setLogicalAddr(String logicalAddr) {
        this.logicalAddr = logicalAddr;
    }

    public BigDecimal getSwitchId() {
        return switchId;
    }

    public void setSwitchId(BigDecimal switchId) {
        this.switchId = switchId;
    }

    public BigDecimal getSwitchNo() {
        return switchNo;
    }

    public void setSwitchNo(BigDecimal switchNo) {
        this.switchNo = switchNo;
    }

    public String getSwitchType() {
        return switchType;
    }

    public void setSwitchType(String switchType) {
        this.switchType = switchType;
    }

    public String getSwitchName() {
        return switchName;
    }

    public void setSwitchName(String switchName) {
        this.switchName = switchName;
    }

    public String getAlarmName() {
        return alarmName;
    }

    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
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

}
