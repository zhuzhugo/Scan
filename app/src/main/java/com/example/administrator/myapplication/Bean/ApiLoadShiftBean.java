package com.example.administrator.myapplication.Bean;

/**
 * Created by zmy1 on 2017/4/7.
 */

public class ApiLoadShiftBean {
    private ApiLoadShift apiLoadShift;

    public ApiLoadShift getApiLoadShift() {
        return apiLoadShift;
    }

    public void setApiLoadShift(ApiLoadShift apiLoadShift) {
        this.apiLoadShift = apiLoadShift;
    }

    public class ApiLoadShift {
        //    private Long id;                //装车班次id
        private Integer lineBranchId;      //线路id
        private Integer lineBranchNo;   //线路编号
        private String lineBranchName;  //线路名称
        private Integer shopId;            //始发网点id
        private String shopName;        //始发网点名称
        private Integer truckId;           //车辆id
        private String licensePlate;    //车牌号
        private Integer driverId;          //驾驶员id
        private String driverName;      //驾驶员名称
        private String driverPhone;     //驾驶员电话
        //    private Integer isSend;         //是否发车(0-否，1-是)
//        private String allowRule;       //允许装货规则
//        private String notAllowRule;    //禁止装货规则
//    private String beginTime;
//    private String endTime;
//    private Integer pageNo;
//    private Integer pageSize;
//    private Integer privateFlag;//0-查询所有,1-查询自己
//    private Boolean force;//是否强制

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

        public Integer getLineBranchId() {
            return lineBranchId;
        }

        public void setLineBranchId(Integer lineBranchId) {
            this.lineBranchId = lineBranchId;
        }

        public String getDriverPhone() {
            return driverPhone;
        }

        public void setDriverPhone(String driverPhone) {
            this.driverPhone = driverPhone;
        }

        public String getDriverName() {
            return driverName;
        }

        public void setDriverName(String driverName) {
            this.driverName = driverName;
        }

        public Integer getDriverId() {
            return driverId;
        }

        public void setDriverId(Integer driverId) {
            this.driverId = driverId;
        }

        public String getLicensePlate() {
            return licensePlate;
        }

        public void setLicensePlate(String licensePlate) {
            this.licensePlate = licensePlate;
        }

        public Integer getTruckId() {
            return truckId;
        }

        public void setTruckId(Integer truckId) {
            this.truckId = truckId;
        }

        public String getShopName() {
            return shopName;
        }

        public void setShopName(String shopName) {
            this.shopName = shopName;
        }

        public Integer getShopId() {
            return shopId;
        }

        public void setShopId(Integer shopId) {
            this.shopId = shopId;
        }

        public String getLineBranchName() {
            return lineBranchName;
        }

        public void setLineBranchName(String lineBranchName) {
            this.lineBranchName = lineBranchName;
        }

        public Integer getLineBranchNo() {
            return lineBranchNo;
        }

        public void setLineBranchNo(Integer lineBranchNo) {
            this.lineBranchNo = lineBranchNo;
        }


//    public Integer getIsSend() {
//        return isSend;
//    }
//
//    public void setIsSend(Integer isSend) {
//        this.isSend = isSend;
//    }

//        public String getAllowRule() {
//            return allowRule;
//        }
//
//        public void setAllowRule(String allowRule) {
//            this.allowRule = allowRule;
//        }
//
//        public String getNotAllowRule() {
//            return notAllowRule;
//        }
//
//        public void setNotAllowRule(String notAllowRule) {
//            this.notAllowRule = notAllowRule;
//        }
//
//    public String getBeginTime() {
//        return beginTime;
//    }
//
//    public void setBeginTime(String beginTime) {
//        this.beginTime = beginTime;
//    }
//
//    public String getEndTime() {
//        return endTime;
//    }
//
//    public void setEndTime(String endTime) {
//        this.endTime = endTime;
//    }
//
//    public Integer getPageNo() {
//        return pageNo;
//    }
//
//    public void setPageNo(Integer pageNo) {
//        this.pageNo = pageNo;
//    }
//
//    public Integer getPageSize() {
//        return pageSize;
//    }
//
//    public void setPageSize(Integer pageSize) {
//        this.pageSize = pageSize;
//    }
//
//    public Integer getPrivateFlag() {
//        return privateFlag;
//    }
//
//    public void setPrivateFlag(Integer privateFlag) {
//        this.privateFlag = privateFlag;
//    }
//
//    public Boolean getForce() {
//        return force;
//    }
//
//    public void setForce(Boolean force) {
//        this.force = force;
//    }
    }
}
