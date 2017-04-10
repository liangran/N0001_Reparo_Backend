package com.hyperchain.controller.vo;

/**
 * Created by YanYufei on 2017/4/10.
 */
public class ReceivableRecordDetailVo {
    private String serialNo;
    private String receivableNo;
    private String applicantAcctId;
    private String replyerAcctId;
    private String responseType;
    private long time;
    private String operateType;
    private long dealAmount;
    private String receivableStatus;

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getReceivableNo() {
        return receivableNo;
    }

    public void setReceivableNo(String receivableNo) {
        this.receivableNo = receivableNo;
    }

    public String getApplicantAcctId() {
        return applicantAcctId;
    }

    public void setApplicantAcctId(String applicantAcctId) {
        this.applicantAcctId = applicantAcctId;
    }

    public String getReplyerAcctId() {
        return replyerAcctId;
    }

    public void setReplyerAcctId(String replyerAcctId) {
        this.replyerAcctId = replyerAcctId;
    }

    public String getResponseType() {
        return responseType;
    }

    public void setResponseType(String responseType) {
        this.responseType = responseType;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    public long getDealAmount() {
        return dealAmount;
    }

    public void setDealAmount(long dealAmount) {
        this.dealAmount = dealAmount;
    }

    public String getReceivableStatus() {
        return receivableStatus;
    }

    public void setReceivableStatus(String receivableStatus) {
        this.receivableStatus = receivableStatus;
    }
}
