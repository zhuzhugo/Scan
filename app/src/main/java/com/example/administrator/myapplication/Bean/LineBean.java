package com.example.administrator.myapplication.Bean;

import java.util.List;

/**
 * Created by zmy1 on 2017/4/7.
 */

public class LineBean {

    /**
     * data : [{"allowRule":"[{\"ruleTypeDesc\":\"发货网点\",\"ruleValueDesc\":\"--全部--\",\"ruleArriveDesc\":\"太和\",\"ruleType\":\"fromShop\",\"ruleValue\":\"\",\"ruleArriveValue\":\"48\"}]","createDate":"2017-03-04 18:03:09","delFlag":0,"distance":0,"driverId":null,"driverName":"","driverPhone":"","extendInfo":null,"fromShopId":7,"fromShopName":"合肥分拨","id":29,"licensePlate":"","name":"合肥-太和","nationalRoadSubsidy":0,"no":1,"notAllowRule":"[]","oilPrice":0,"oilWearFee":0,"remarks":"","roadConditionSubsidy":0,"ruleSql":" (from_shop_id not in (-1)) ","scheduleSendDay":1,"scheduleSendTime":"18:00","sort":1,"toRegionNames":"长丰店,包公大道,太和,新海大道,合肥家天下","toShopNames":"太和","truckId":null,"type":1,"typeDesc":"干线","updateDate":"2017-03-23 16:34:13"},{"allowRule":"","createDate":"2017-03-09 17:19:21","delFlag":0,"distance":0,"driverId":null,"driverName":"","driverPhone":"","extendInfo":null,"fromShopId":7,"fromShopName":"合肥分拨","id":31,"licensePlate":"","name":"分拨-合肥长批","nationalRoadSubsidy":0,"no":3,"notAllowRule":"","oilPrice":0,"oilWearFee":0,"remarks":"","roadConditionSubsidy":0,"ruleSql":"","scheduleSendDay":1,"scheduleSendTime":"18:00","sort":1,"toRegionNames":"","toShopNames":"合肥长批","truckId":null,"type":2,"typeDesc":"短拨","updateDate":null},{"allowRule":"","createDate":"2017-03-20 09:47:29","delFlag":0,"distance":0,"driverId":null,"driverName":"","driverPhone":"","extendInfo":null,"fromShopId":12,"fromShopName":"小庙","id":33,"licensePlate":"","name":"合肥测试","nationalRoadSubsidy":0,"no":5,"notAllowRule":"","oilPrice":0,"oilWearFee":0,"remarks":"","roadConditionSubsidy":0,"ruleSql":"","scheduleSendDay":1,"scheduleSendTime":"18:00","sort":1,"toRegionNames":"","toShopNames":"","truckId":null,"type":1,"typeDesc":"干线","updateDate":"2017-03-22 16:32:33"}]
     * message : 成功
     * statusCode : 200
     * success : true
     */

    private String message;
    private int statusCode;
    private boolean success;
    private List<DataBean> data;

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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * allowRule : [{"ruleTypeDesc":"发货网点","ruleValueDesc":"--全部--","ruleArriveDesc":"太和","ruleType":"fromShop","ruleValue":"","ruleArriveValue":"48"}]
         * createDate : 2017-03-04 18:03:09
         * delFlag : 0
         * distance : 0
         * driverId : null
         * driverName :
         * driverPhone :
         * extendInfo : null
         * fromShopId : 7
         * fromShopName : 合肥分拨
         * id : 29
         * licensePlate :
         * name : 合肥-太和
         * nationalRoadSubsidy : 0.0
         * no : 1
         * notAllowRule : []
         * oilPrice : 0.0
         * oilWearFee : 0.0
         * remarks :
         * roadConditionSubsidy : 0.0
         * ruleSql :  (from_shop_id not in (-1))
         * scheduleSendDay : 1
         * scheduleSendTime : 18:00
         * sort : 1
         * toRegionNames : 长丰店,包公大道,太和,新海大道,合肥家天下
         * toShopNames : 太和
         * truckId : null
         * type : 1
         * typeDesc : 干线
         * updateDate : 2017-03-23 16:34:13
         */

        private String allowRule;
        private String createDate;
        private int delFlag;
        private int distance;
        private Object driverId;
        private String driverName;
        private String driverPhone;
        private Object extendInfo;
        private int fromShopId;
        private String fromShopName;
        private int id;
        private String licensePlate;
        private String name;
        private double nationalRoadSubsidy;
        private int no;
        private String notAllowRule;
        private double oilPrice;
        private double oilWearFee;
        private String remarks;
        private double roadConditionSubsidy;
        private String ruleSql;
        private int scheduleSendDay;
        private String scheduleSendTime;
        private int sort;
        private String toRegionNames;
        private String toShopNames;
        private Object truckId;
        private int type;
        private String typeDesc;
        private String updateDate;

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

        public int getDelFlag() {
            return delFlag;
        }

        public void setDelFlag(int delFlag) {
            this.delFlag = delFlag;
        }

        public int getDistance() {
            return distance;
        }

        public void setDistance(int distance) {
            this.distance = distance;
        }

        public Object getDriverId() {
            return driverId;
        }

        public void setDriverId(Object driverId) {
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

        public int getFromShopId() {
            return fromShopId;
        }

        public void setFromShopId(int fromShopId) {
            this.fromShopId = fromShopId;
        }

        public String getFromShopName() {
            return fromShopName;
        }

        public void setFromShopName(String fromShopName) {
            this.fromShopName = fromShopName;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getLicensePlate() {
            return licensePlate;
        }

        public void setLicensePlate(String licensePlate) {
            this.licensePlate = licensePlate;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getNationalRoadSubsidy() {
            return nationalRoadSubsidy;
        }

        public void setNationalRoadSubsidy(double nationalRoadSubsidy) {
            this.nationalRoadSubsidy = nationalRoadSubsidy;
        }

        public int getNo() {
            return no;
        }

        public void setNo(int no) {
            this.no = no;
        }

        public String getNotAllowRule() {
            return notAllowRule;
        }

        public void setNotAllowRule(String notAllowRule) {
            this.notAllowRule = notAllowRule;
        }

        public double getOilPrice() {
            return oilPrice;
        }

        public void setOilPrice(double oilPrice) {
            this.oilPrice = oilPrice;
        }

        public double getOilWearFee() {
            return oilWearFee;
        }

        public void setOilWearFee(double oilWearFee) {
            this.oilWearFee = oilWearFee;
        }

        public String getRemarks() {
            return remarks;
        }

        public void setRemarks(String remarks) {
            this.remarks = remarks;
        }

        public double getRoadConditionSubsidy() {
            return roadConditionSubsidy;
        }

        public void setRoadConditionSubsidy(double roadConditionSubsidy) {
            this.roadConditionSubsidy = roadConditionSubsidy;
        }

        public String getRuleSql() {
            return ruleSql;
        }

        public void setRuleSql(String ruleSql) {
            this.ruleSql = ruleSql;
        }

        public int getScheduleSendDay() {
            return scheduleSendDay;
        }

        public void setScheduleSendDay(int scheduleSendDay) {
            this.scheduleSendDay = scheduleSendDay;
        }

        public String getScheduleSendTime() {
            return scheduleSendTime;
        }

        public void setScheduleSendTime(String scheduleSendTime) {
            this.scheduleSendTime = scheduleSendTime;
        }

        public int getSort() {
            return sort;
        }

        public void setSort(int sort) {
            this.sort = sort;
        }

        public String getToRegionNames() {
            return toRegionNames;
        }

        public void setToRegionNames(String toRegionNames) {
            this.toRegionNames = toRegionNames;
        }

        public String getToShopNames() {
            return toShopNames;
        }

        public void setToShopNames(String toShopNames) {
            this.toShopNames = toShopNames;
        }

        public Object getTruckId() {
            return truckId;
        }

        public void setTruckId(Object truckId) {
            this.truckId = truckId;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getTypeDesc() {
            return typeDesc;
        }

        public void setTypeDesc(String typeDesc) {
            this.typeDesc = typeDesc;
        }

        public String getUpdateDate() {
            return updateDate;
        }

        public void setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
        }
    }
}
