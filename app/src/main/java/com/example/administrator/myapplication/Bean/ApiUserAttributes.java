package com.example.administrator.myapplication.Bean;


import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * Created by hujian on 14-7-21.
 */
public class ApiUserAttributes implements Serializable {
    private static final long serialVersionUID = 1L;

    private String customerServicePhone;
    private String email;
    private int id;
    private String loginDate;
    private String loginName;
    private Object mobile;
    private String name;
    private Object no;
    private int orgId;
    private String orgName;
    private int orgParentId;
    private String orgParentName;
    private String orgPhone;
    private int orgType;
    private String phone;
    private String orgAreaName;
    private String orgAreaId;
    private List<AppMenuListBean> appMenuList;
    private List<AppMenuDocBean> appMenuDoc;
    private List<ConfigBean> config;
    private List<OssBean> oss;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getCustomerServicePhone() {
        return customerServicePhone;
    }

    public void setCustomerServicePhone(String customerServicePhone) {
        this.customerServicePhone = customerServicePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(String loginDate) {
        this.loginDate = loginDate;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public Object getMobile() {
        return mobile;
    }

    public void setMobile(Object mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getNo() {
        return no;
    }

    public void setNo(Object no) {
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

    public int getOrgParentId() {
        return orgParentId;
    }

    public void setOrgParentId(int orgParentId) {
        this.orgParentId = orgParentId;
    }

    public String getOrgParentName() {
        return orgParentName;
    }

    public void setOrgParentName(String orgParentName) {
        this.orgParentName = orgParentName;
    }

    public String getOrgPhone() {
        return orgPhone;
    }

    public void setOrgPhone(String orgPhone) {
        this.orgPhone = orgPhone;
    }

    public int getOrgType() {
        return orgType;
    }

    public void setOrgType(int orgType) {
        this.orgType = orgType;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getOrgAreaName() {
        return orgAreaName;
    }

    public void setOrgAreaName(String orgAreaName) {
        this.orgAreaName = orgAreaName;
    }

    public String getOrgAreaId() {
        return orgAreaId;
    }

    public void setOrgAreaId(String orgAreaId) {
        this.orgAreaId = orgAreaId;
    }

    public List<AppMenuListBean> getAppMenuList() {
        return appMenuList;
    }

    public void setAppMenuList(List<AppMenuListBean> appMenuList) {
        this.appMenuList = appMenuList;
    }

    public List<OssBean> getOss() {
        return oss;
    }

    public void setOss(List<OssBean> oss) {
        this.oss = oss;
    }

    public List<ConfigBean> getConfig() {
        return config;
    }

    public void setConfig(List<ConfigBean> config) {
        this.config = config;
    }

    public List<AppMenuDocBean> getAppMenuDoc() {
        return appMenuDoc;
    }

    public void setAppMenuDoc(List<AppMenuDocBean> appMenuDoc) {
        this.appMenuDoc = appMenuDoc;
    }

    public static class AppMenuListBean {
        private String name;
        private String no;

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
    }

    public static class AppMenuDocBean{
        private List<Home>home;
        private List<Report>report;

        public List<Home> getHome() {
            return home;
        }

        public void setHome(List<Home> home) {
            this.home = home;
        }

        public List<Report> getReport() {
            return report;
        }

        public void setReport(List<Report> report) {
            this.report = report;
        }

        public static class Home{
            private String list;
            private String name;
            private String no;

            public String getList() {
                return list;
            }

            public void setList(String list) {
                this.list = list;
            }

            public String getNo() {
                return no;
            }

            public void setNo(String no) {
                this.no = no;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
        public static class Report{
            private String list;
            private String name;
            private String no;

            public String getList() {
                return list;
            }

            public void setList(String list) {
                this.list = list;
            }

            public String getNo() {
                return no;
            }

            public void setNo(String no) {
                this.no = no;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

    }

    public static class ConfigBean{
        private List<ApplyTypeBean> applyType;
        private List<CustomerBankBean> customerBank;
        private String defaultCodFeeMode;
        private String defaultDeliveryMode;
        private String defaultPayOutFeeSettleMode;
        private String defaultPremiumMode;
        private boolean showIosUpdate;

        public List<ApplyTypeBean> getApplyType() {
            return applyType;
        }

        public void setApplyType(List<ApplyTypeBean> applyType) {
            this.applyType = applyType;
        }

        public boolean isShowIosUpdate() {
            return showIosUpdate;
        }

        public void setShowIosUpdate(boolean showIosUpdate) {
            this.showIosUpdate = showIosUpdate;
        }

        public String getDefaultPremiumMode() {
            return defaultPremiumMode;
        }

        public void setDefaultPremiumMode(String defaultPremiumMode) {
            this.defaultPremiumMode = defaultPremiumMode;
        }

        public String getDefaultPayOutFeeSettleMode() {
            return defaultPayOutFeeSettleMode;
        }

        public void setDefaultPayOutFeeSettleMode(String defaultPayOutFeeSettleMode) {
            this.defaultPayOutFeeSettleMode = defaultPayOutFeeSettleMode;
        }

        public String getDefaultDeliveryMode() {
            return defaultDeliveryMode;
        }

        public void setDefaultDeliveryMode(String defaultDeliveryMode) {
            this.defaultDeliveryMode = defaultDeliveryMode;
        }

        public String getDefaultCodFeeMode() {
            return defaultCodFeeMode;
        }

        public void setDefaultCodFeeMode(String defaultCodFeeMode) {
            this.defaultCodFeeMode = defaultCodFeeMode;
        }

        public List<CustomerBankBean> getCustomerBank() {
            return customerBank;
        }

        public void setCustomerBank(List<CustomerBankBean> customerBank) {
            this.customerBank = customerBank;
        }

        public static  class ApplyTypeBean{
            private String label;
            private String value;

            public String getLabel() {
                return label;
            }

            public void setLabel(String label) {
                this.label = label;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }

        public static  class CustomerBankBean{
            private String label;
            private String value;

            public String getLabel() {
                return label;
            }

            public void setLabel(String label) {
                this.label = label;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }
    }
    public static class OssBean{
        private String accessKeyId;
        private String accessKeySecret;
        private String bucket;
        private String region;

        public String getAccessKeyId() {
            return accessKeyId;
        }

        public void setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getBucket() {
            return bucket;
        }

        public void setBucket(String bucket) {
            this.bucket = bucket;
        }

        public String getAccessKeySecret() {
            return accessKeySecret;
        }

        public void setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
        }
    }
}
