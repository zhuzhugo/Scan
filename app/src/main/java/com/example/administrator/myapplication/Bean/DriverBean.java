package com.example.administrator.myapplication.Bean;

import java.util.List;

/**
 * Created by zmy1 on 2017/4/8.
 */

public class DriverBean {


    /**
     * data : [{"id":2,"loginName":"18110985921","mobile":"","name":"朱老师","no":"","orgId":7,"orgName":"合肥分拨","phone":"18110985921"}]
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
         * id : 2
         * loginName : 18110985921
         * mobile :
         * name : 朱老师
         * no :
         * orgId : 7
         * orgName : 合肥分拨
         * phone : 18110985921
         */

        private int id;
        private String loginName;
        private String mobile;
        private String name;
        private String no;
        private int orgId;
        private String orgName;
        private String phone;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getLoginName() {
            return loginName;
        }

        public void setLoginName(String loginName) {
            this.loginName = loginName;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNo() {
            return no;
        }

        public void setNo(String no) {
            this.no = no;
        }

        public int getOrgId() {
            return orgId;
        }

        public void setOrgId(int orgId) {
            this.orgId = orgId;
        }

        public String getOrgName() {
            return orgName;
        }

        public void setOrgName(String orgName) {
            this.orgName = orgName;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }
    }
}
