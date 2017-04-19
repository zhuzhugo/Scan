package com.example.administrator.myapplication.Bean;

import java.util.List;

/**
 * Created by zmy1 on 2017/4/6.
 */

public class BanCiBean {

    /**
     * data : {"pageNo":1,"pageSize":100,"rows":[{"actualSendTime":"2017-03-31 17:26:08","allowRule":"[{\"ruleTypeDesc\":\"发货网点\",\"ruleValueDesc\":\"--全部--\",\"ruleArriveDesc\":\"太和\",\"ruleType\":\"fromShop\",\"ruleValue\":\"\",\"ruleArriveValue\":\"48\"}]","createDate":"2017-03-31 16:20:00","creatorId":2,"creatorName":"朱老师","delFlag":0,"driverId":12,"driverName":"胡健2","driverPhone":"18505518325","extendInfo":null,"id":273,"isSend":0,"licensePlate":"皖ACS119","lineBranchId":29,"lineBranchName":"合肥-太和","lineBranchNo":1,"lineBranchType":1,"loadShiftOrgShops":[{"id":48,"name":"太和"}],"notAllowRule":"[]","remarks":"","scheduleSendTime":null,"sendUserId":2,"sendUserName":"朱老师","shiftNo":"LS1703310001","shopId":7,"shopName":"合肥分拨","toRegionNames":"长丰店,包公大道,太和,新海大道,合肥家天下","truckId":3,"updateDate":"2017-03-31 17:34:21"},{"actualSendTime":null,"allowRule":"[]","createDate":"2017-03-30 21:55:51","creatorId":2,"creatorName":"朱老师","delFlag":0,"driverId":12,"driverName":"胡健2","driverPhone":"18505518325","extendInfo":null,"id":272,"isSend":0,"licensePlate":"皖ACS119","lineBranchId":34,"lineBranchName":"分拨-长丰","lineBranchNo":6,"lineBranchType":1,"loadShiftOrgShops":[{"id":18,"name":"长丰分公司"}],"notAllowRule":"[]","remarks":"","scheduleSendTime":null,"sendUserId":null,"sendUserName":"","shiftNo":"LS1703300007","shopId":7,"shopName":"合肥分拨","toRegionNames":"","truckId":3,"updateDate":null},{"actualSendTime":null,"allowRule":"[{\"ruleTypeDesc\":\"到货网点\",\"ruleValueDesc\":\"--全部--\",\"ruleArriveDesc\":\"合肥分拨\",\"ruleType\":\"toShop\",\"ruleValue\":\"\",\"ruleArriveValue\":\"7\"}]","createDate":"2017-03-30 21:09:39","creatorId":30,"creatorName":"龙哥","delFlag":0,"driverId":12,"driverName":"胡健2","driverPhone":"18505518325","extendInfo":null,"id":271,"isSend":0,"licensePlate":"皖ACS119","lineBranchId":30,"lineBranchName":"新东方-清水河-达达木图-伊宁县","lineBranchNo":2,"lineBranchType":1,"loadShiftOrgShops":[{"id":32,"name":"清水河网点"},{"id":26,"name":"达达木图"},{"id":36,"name":"伊宁县"}],"notAllowRule":"[]","remarks":"","scheduleSendTime":null,"sendUserId":null,"sendUserName":"","shiftNo":"LS1703300004","shopId":30,"shopName":"新东方","toRegionNames":"","truckId":3,"updateDate":null},{"actualSendTime":null,"allowRule":"[{\"ruleTypeDesc\":\"发货网点\",\"ruleValueDesc\":\"--全部--\",\"ruleArriveDesc\":\"太和\",\"ruleType\":\"fromShop\",\"ruleValue\":\"\",\"ruleArriveValue\":\"48\"}]","createDate":"2017-03-30 11:42:55","creatorId":2,"creatorName":"朱老师","delFlag":0,"driverId":6,"driverName":"赵方方","driverPhone":"18256916928","extendInfo":null,"id":270,"isSend":0,"licensePlate":"皖ASB221","lineBranchId":29,"lineBranchName":"合肥-太和","lineBranchNo":1,"lineBranchType":1,"loadShiftOrgShops":[{"id":48,"name":"太和"}],"notAllowRule":"[]","remarks":"","scheduleSendTime":null,"sendUserId":null,"sendUserName":"","shiftNo":"LS1703300001","shopId":7,"shopName":"合肥分拨","toRegionNames":"长丰店,包公大道,太和,新海大道,合肥家天下","truckId":4,"updateDate":null}],"total":4,"totalPages":1}
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
         * pageNo : 1
         * pageSize : 100
         * rows : [{"actualSendTime":"2017-03-31 17:26:08","allowRule":"[{\"ruleTypeDesc\":\"发货网点\",\"ruleValueDesc\":\"--全部--\",\"ruleArriveDesc\":\"太和\",\"ruleType\":\"fromShop\",\"ruleValue\":\"\",\"ruleArriveValue\":\"48\"}]","createDate":"2017-03-31 16:20:00","creatorId":2,"creatorName":"朱老师","delFlag":0,"driverId":12,"driverName":"胡健2","driverPhone":"18505518325","extendInfo":null,"id":273,"isSend":0,"licensePlate":"皖ACS119","lineBranchId":29,"lineBranchName":"合肥-太和","lineBranchNo":1,"lineBranchType":1,"loadShiftOrgShops":[{"id":48,"name":"太和"}],"notAllowRule":"[]","remarks":"","scheduleSendTime":null,"sendUserId":2,"sendUserName":"朱老师","shiftNo":"LS1703310001","shopId":7,"shopName":"合肥分拨","toRegionNames":"长丰店,包公大道,太和,新海大道,合肥家天下","truckId":3,"updateDate":"2017-03-31 17:34:21"},{"actualSendTime":null,"allowRule":"[]","createDate":"2017-03-30 21:55:51","creatorId":2,"creatorName":"朱老师","delFlag":0,"driverId":12,"driverName":"胡健2","driverPhone":"18505518325","extendInfo":null,"id":272,"isSend":0,"licensePlate":"皖ACS119","lineBranchId":34,"lineBranchName":"分拨-长丰","lineBranchNo":6,"lineBranchType":1,"loadShiftOrgShops":[{"id":18,"name":"长丰分公司"}],"notAllowRule":"[]","remarks":"","scheduleSendTime":null,"sendUserId":null,"sendUserName":"","shiftNo":"LS1703300007","shopId":7,"shopName":"合肥分拨","toRegionNames":"","truckId":3,"updateDate":null},{"actualSendTime":null,"allowRule":"[{\"ruleTypeDesc\":\"到货网点\",\"ruleValueDesc\":\"--全部--\",\"ruleArriveDesc\":\"合肥分拨\",\"ruleType\":\"toShop\",\"ruleValue\":\"\",\"ruleArriveValue\":\"7\"}]","createDate":"2017-03-30 21:09:39","creatorId":30,"creatorName":"龙哥","delFlag":0,"driverId":12,"driverName":"胡健2","driverPhone":"18505518325","extendInfo":null,"id":271,"isSend":0,"licensePlate":"皖ACS119","lineBranchId":30,"lineBranchName":"新东方-清水河-达达木图-伊宁县","lineBranchNo":2,"lineBranchType":1,"loadShiftOrgShops":[{"id":32,"name":"清水河网点"},{"id":26,"name":"达达木图"},{"id":36,"name":"伊宁县"}],"notAllowRule":"[]","remarks":"","scheduleSendTime":null,"sendUserId":null,"sendUserName":"","shiftNo":"LS1703300004","shopId":30,"shopName":"新东方","toRegionNames":"","truckId":3,"updateDate":null},{"actualSendTime":null,"allowRule":"[{\"ruleTypeDesc\":\"发货网点\",\"ruleValueDesc\":\"--全部--\",\"ruleArriveDesc\":\"太和\",\"ruleType\":\"fromShop\",\"ruleValue\":\"\",\"ruleArriveValue\":\"48\"}]","createDate":"2017-03-30 11:42:55","creatorId":2,"creatorName":"朱老师","delFlag":0,"driverId":6,"driverName":"赵方方","driverPhone":"18256916928","extendInfo":null,"id":270,"isSend":0,"licensePlate":"皖ASB221","lineBranchId":29,"lineBranchName":"合肥-太和","lineBranchNo":1,"lineBranchType":1,"loadShiftOrgShops":[{"id":48,"name":"太和"}],"notAllowRule":"[]","remarks":"","scheduleSendTime":null,"sendUserId":null,"sendUserName":"","shiftNo":"LS1703300001","shopId":7,"shopName":"合肥分拨","toRegionNames":"长丰店,包公大道,太和,新海大道,合肥家天下","truckId":4,"updateDate":null}]
         * total : 4
         * totalPages : 1
         */

        private int pageNo;
        private int pageSize;
        private int total;
        private int totalPages;
        private List<RowsBean> rows;

        public int getPageNo() {
            return pageNo;
        }

        public void setPageNo(int pageNo) {
            this.pageNo = pageNo;
        }

        public int getPageSize() {
            return pageSize;
        }

        public void setPageSize(int pageSize) {
            this.pageSize = pageSize;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public int getTotalPages() {
            return totalPages;
        }

        public void setTotalPages(int totalPages) {
            this.totalPages = totalPages;
        }

        public List<RowsBean> getRows() {
            return rows;
        }

        public void setRows(List<RowsBean> rows) {
            this.rows = rows;
        }

        public static class RowsBean {
            /**
             * actualSendTime : 2017-03-31 17:26:08
             * allowRule : [{"ruleTypeDesc":"发货网点","ruleValueDesc":"--全部--","ruleArriveDesc":"太和","ruleType":"fromShop","ruleValue":"","ruleArriveValue":"48"}]
             * createDate : 2017-03-31 16:20:00
             * creatorId : 2
             * creatorName : 朱老师
             * delFlag : 0
             * driverId : 12
             * driverName : 胡健2
             * driverPhone : 18505518325
             * extendInfo : null
             * id : 273
             * isSend : 0
             * licensePlate : 皖ACS119
             * lineBranchId : 29
             * lineBranchName : 合肥-太和
             * lineBranchNo : 1
             * lineBranchType : 1
             * loadShiftOrgShops : [{"id":48,"name":"太和"}]
             * notAllowRule : []
             * remarks :
             * scheduleSendTime : null
             * sendUserId : 2
             * sendUserName : 朱老师
             * shiftNo : LS1703310001
             * shopId : 7
             * shopName : 合肥分拨
             * toRegionNames : 长丰店,包公大道,太和,新海大道,合肥家天下
             * truckId : 3
             * updateDate : 2017-03-31 17:34:21
             */

            private String actualSendTime;
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
            private int sendUserId;
            private String sendUserName;
            private String shiftNo;
            private int shopId;
            private String shopName;
            private String toRegionNames;
            private int truckId;
            private String updateDate;
            private List<LoadShiftOrgShopsBean> loadShiftOrgShops;

            public String getActualSendTime() {
                return actualSendTime;
            }

            public void setActualSendTime(String actualSendTime) {
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

            public int getSendUserId() {
                return sendUserId;
            }

            public void setSendUserId(int sendUserId) {
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

            public String getUpdateDate() {
                return updateDate;
            }

            public void setUpdateDate(String updateDate) {
                this.updateDate = updateDate;
            }

            public List<LoadShiftOrgShopsBean> getLoadShiftOrgShops() {
                return loadShiftOrgShops;
            }

            public void setLoadShiftOrgShops(List<LoadShiftOrgShopsBean> loadShiftOrgShops) {
                this.loadShiftOrgShops = loadShiftOrgShops;
            }

            public static class LoadShiftOrgShopsBean {
                /**
                 * id : 48
                 * name : 太和
                 */

                private int id;
                private String name;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }
        }
    }
}
