package com.example.administrator.myapplication.Bean;

import java.util.List;

/**
 * Created by zmy1 on 2017/4/7.
 */

public class PlateBean {

    /**
     * data : [{"driverId":23,"driverName":"小小","driverPhone":"19012341234","id":8,"licensePlate":"a sd","truckCode":"","truckOwnerName":"","truckOwnerPhone":""},{"driverId":-1,"driverName":"","driverPhone":"","id":20,"licensePlate":"皖N66666","truckCode":"","truckOwnerName":"","truckOwnerPhone":""},{"driverId":-1,"driverName":"","driverPhone":"","id":9,"licensePlate":"皖AWE123","truckCode":"","truckOwnerName":"","truckOwnerPhone":""},{"driverId":-1,"driverName":"","driverPhone":"","id":21,"licensePlate":"皖A111","truckCode":"","truckOwnerName":"","truckOwnerPhone":""},{"driverId":null,"driverName":"","driverPhone":"","id":11,"licensePlate":"皖AWE124","truckCode":"","truckOwnerName":"","truckOwnerPhone":""},{"driverId":2,"driverName":"朱老师","driverPhone":"18110985921","id":12,"licensePlate":"皖AWE125","truckCode":"","truckOwnerName":"","truckOwnerPhone":""},{"driverId":8,"driverName":"猪猪","driverPhone":"13812312312","id":1,"licensePlate":"皖A123123","truckCode":"","truckOwnerName":"","truckOwnerPhone":""},{"driverId":-1,"driverName":"","driverPhone":"","id":13,"licensePlate":"皖AWE126","truckCode":"","truckOwnerName":"","truckOwnerPhone":""},{"driverId":2,"driverName":"朱老师","driverPhone":"18110985921","id":2,"licensePlate":"皖ACS110","truckCode":"123123","truckOwnerName":"测试","truckOwnerPhone":"13123123"},{"driverId":2,"driverName":"朱老师","driverPhone":"18110985921","id":14,"licensePlate":"皖AWE127","truckCode":"","truckOwnerName":"","truckOwnerPhone":""},{"driverId":12,"driverName":"胡健2","driverPhone":"18505518325","id":3,"licensePlate":"皖ACS119","truckCode":"","truckOwnerName":"陈志强","truckOwnerPhone":"123123123"},{"driverId":-1,"driverName":"","driverPhone":"","id":15,"licensePlate":"皖AWE111","truckCode":"","truckOwnerName":"","truckOwnerPhone":""},{"driverId":6,"driverName":"赵方方","driverPhone":"18256916928","id":4,"licensePlate":"皖ASB221","truckCode":"33","truckOwnerName":"赵方方","truckOwnerPhone":""},{"driverId":1,"driverName":"超管","driverPhone":"","id":16,"licensePlate":"皖AOMG11","truckCode":"","truckOwnerName":"","truckOwnerPhone":""},{"driverId":5,"driverName":"钱坤","driverPhone":"13439271340","id":5,"licensePlate":"皖A88888","truckCode":"333","truckOwnerName":"","truckOwnerPhone":""},{"driverId":12,"driverName":"胡健2","driverPhone":"18505518325","id":17,"licensePlate":"皖A663J3","truckCode":"","truckOwnerName":"","truckOwnerPhone":""},{"driverId":2,"driverName":"朱老师","driverPhone":"18110985921","id":6,"licensePlate":"皖AWE1234","truckCode":"aaa","truckOwnerName":"","truckOwnerPhone":""},{"driverId":-1,"driverName":"","driverPhone":"","id":18,"licensePlate":"皖A66666","truckCode":"","truckOwnerName":"","truckOwnerPhone":""},{"driverId":23,"driverName":"小小","driverPhone":"19012341234","id":7,"licensePlate":"123","truckCode":"","truckOwnerName":"","truckOwnerPhone":""},{"driverId":4,"driverName":"朱天龙","driverPhone":"13812345678","id":19,"licensePlate":"皖N77777","truckCode":"","truckOwnerName":"","truckOwnerPhone":""}]
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
         * driverId : 23
         * driverName : 小小
         * driverPhone : 19012341234
         * id : 8
         * licensePlate : a sd
         * truckCode :
         * truckOwnerName :
         * truckOwnerPhone :
         */

        private int driverId;
        private String driverName;
        private String driverPhone;
        private int id;
        private String licensePlate;
        private String truckCode;
        private String truckOwnerName;
        private String truckOwnerPhone;

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

        public String getTruckCode() {
            return truckCode;
        }

        public void setTruckCode(String truckCode) {
            this.truckCode = truckCode;
        }

        public String getTruckOwnerName() {
            return truckOwnerName;
        }

        public void setTruckOwnerName(String truckOwnerName) {
            this.truckOwnerName = truckOwnerName;
        }

        public String getTruckOwnerPhone() {
            return truckOwnerPhone;
        }

        public void setTruckOwnerPhone(String truckOwnerPhone) {
            this.truckOwnerPhone = truckOwnerPhone;
        }
    }
}
