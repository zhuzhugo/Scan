package com.example.administrator.myapplication.Bean;

import java.util.List;

/**
 * Created by zmy1 on 2017/4/10.
 */

public class CreateNewBean {

    /**
     * data : {"actualSendTime":null,"allowRule":"","createDate":"2017-04-10 13:51:18","creatorId":2,"creatorName":"朱老师","delFlag":0,"driverId":2,"driverName":"朱老师","driverPhone":"18110985921","extendInfo":null,"id":284,"isSend":0,"licensePlate":"皖AWE127","lineBranchId":33,"lineBranchName":"合肥测试","lineBranchNo":5,"lineBranchType":1,"loadShiftOrgShops":[],"notAllowRule":"","remarks":"","scheduleSendTime":null,"sendUserId":null,"sendUserName":"","shiftNo":"LS1704100002","shopId":12,"shopName":"小庙","toRegionNames":"","truckId":14,"updateDate":null}
     * message : 成功
     * statusCode : 200
     * success : true
     */

    private DataBean data;
    private String message;
    private int statusCode;
    private boolean success;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public static class DataBean {
        /**
         * actualSendTime : null
         * allowRule :
         * createDate : 2017-04-10 13:51:18
         * creatorId : 2
         * creatorName : 朱老师
         * delFlag : 0
         * driverId : 2
         * driverName : 朱老师
         * driverPhone : 18110985921
         * extendInfo : null
         * id : 284
         * isSend : 0
         * licensePlate : 皖AWE127
         * lineBranchId : 33
         * lineBranchName : 合肥测试
         * lineBranchNo : 5
         * lineBranchType : 1
         * loadShiftOrgShops : []
         * notAllowRule :
         * remarks :
         * scheduleSendTime : null
         * sendUserId : null
         * sendUserName :
         * shiftNo : LS1704100002
         * shopId : 12
         * shopName : 小庙
         * toRegionNames :
         * truckId : 14
         * updateDate : null
         */

        private Object actualSendTime;
        private String allowRule;
        private String createDate;
        private int creatorId;
        private String creatorName;
        private int delFlag;
        private int driverId;
        private String driverName;
        private String driverPhone;
        private Object extendInfo;
        private int id;
        private int isSend;
        private String licensePlate;
        private int lineBranchId;
        private String lineBranchName;
        private int lineBranchNo;
        private int lineBranchType;
        private String notAllowRule;
        private String remarks;
        private Object scheduleSendTime;
        private Object sendUserId;
        private String sendUserName;
        private String shiftNo;
        private int shopId;
        private String shopName;
        private String toRegionNames;
        private int truckId;
        private Object updateDate;
        private List<?> loadShiftOrgShops;

        public Object getActualSendTime() {
            return actualSendTime;
        }

        public void setActualSendTime(Object actualSendTime) {
            this.actualSendTime = actualSendTime;
        }

        public String getAllowRule() {
            return allowRule;
        }

        public void setAllowRule(String allowRule) {
            this.allowRule = allowRule;
        }

        public String getCreateDate() {
            return createDate;
        }

        public void setCreateDate(String createDate) {
            this.createDate = createDate;
        }

        public int getCreatorId() {
            return creatorId;
        }

        public void setCreatorId(int creatorId) {
            this.creatorId = creatorId;
        }

        public String getCreatorName() {
            return creatorName;
        }

        public void setCreatorName(String creatorName) {
            this.creatorName = creatorName;
        }

        public int getDelFlag() {
            return delFlag;
        }

        public void setDelFlag(int delFlag) {
            this.delFlag = delFlag;
        }

        public int getDriverId() {
            return driverId;
        }

        public void setDriverId(int driverId) {
            this.driverId = driverId;
        }

        public String getDriverName() {
            return driverName;
        }

        public void setDriverName(String driverName) {
            this.driverName = driverName;
        }

        public String getDriverPhone() {
            return driverPhone;
        }

        public void setDriverPhone(String driverPhone) {
            this.driverPhone = driverPhone;
        }

        public Object getExtendInfo() {
            return extendInfo;
        }

        public void setExtendInfo(Object extendInfo) {
            this.extendInfo = extendInfo;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getIsSend() {
            return isSend;
        }

        public void setIsSend(int isSend) {
            this.isSend = isSend;
        }

        public String getLicensePlate() {
            return licensePlate;
        }

        public void setLicensePlate(String licensePlate) {
            this.licensePlate = licensePlate;
        }

        public int getLineBranchId() {
            return lineBranchId;
        }

        public void setLineBranchId(int lineBranchId) {
            this.lineBranchId = lineBranchId;
        }

        public String getLineBranchName() {
            return lineBranchName;
        }

        public void setLineBranchName(String lineBranchName) {
            this.lineBranchName = lineBranchName;
        }

        public int getLineBranchNo() {
            return lineBranchNo;
        }

        public void setLineBranchNo(int lineBranchNo) {
            this.lineBranchNo = lineBranchNo;
        }

        public int getLineBranchType() {
            return lineBranchType;
        }

        public void setLineBranchType(int lineBranchType) {
            this.lineBranchType = lineBranchType;
        }

        public String getNotAllowRule() {
            return notAllowRule;
        }

        public void setNotAllowRule(String notAllowRule) {
            this.notAllowRule = notAllowRule;
        }

        public String getRemarks() {
            return remarks;
        }

        public void setRemarks(String remarks) {
            this.remarks = remarks;
        }

        public Object getScheduleSendTime() {
            return scheduleSendTime;
        }

        public void setScheduleSendTime(Object scheduleSendTime) {
            this.scheduleSendTime = scheduleSendTime;
        }

        public Object getSendUserId() {
            return sendUserId;
        }

        public void setSendUserId(Object sendUserId) {
            this.sendUserId = sendUserId;
        }

        public String getSendUserName() {
            return sendUserName;
        }

        public void setSendUserName(String sendUserName) {
            this.sendUserName = sendUserName;
        }

        public String getShiftNo() {
            return shiftNo;
        }

        public void setShiftNo(String shiftNo) {
            this.shiftNo = shiftNo;
        }

        public int getShopId() {
            return shopId;
        }

        public void setShopId(int shopId) {
            this.shopId = shopId;
        }

        public String getShopName() {
            return shopName;
        }

        public void setShopName(String shopName) {
            this.shopName = shopName;
        }

        public String getToRegionNames() {
            return toRegionNames;
        }

        public void setToRegionNames(String toRegionNames) {
            this.toRegionNames = toRegionNames;
        }

        public int getTruckId() {
            return truckId;
        }

        public void setTruckId(int truckId) {
            this.truckId = truckId;
        }

        public Object getUpdateDate() {
            return updateDate;
        }

        public void setUpdateDate(Object updateDate) {
            this.updateDate = updateDate;
        }

        public List<?> getLoadShiftOrgShops() {
            return loadShiftOrgShops;
        }

        public void setLoadShiftOrgShops(List<?> loadShiftOrgShops) {
            this.loadShiftOrgShops = loadShiftOrgShops;
        }
    }
}
