package com.example.administrator.myapplication.Bean;

import java.util.List;

/**
 * Created by zmy1 on 2017/4/6.
 */

public class LoginBean {

    /**
     * data : {"appUrl":"http://192.168.6.114:8480/T6","attributes":{"appMenuDoc":{"home":[{"list":[{"list":[],"name":"快速开票","no":"fastCreate"},{"list":[],"name":"发运车次","no":"lineTransport"},{"list":[],"name":"月结开票","no":"agreementSheet"},{"list":[],"name":"发货订单","no":"orderList"}],"name":"发货管理","no":"sendManager"},{"list":[{"list":[],"name":"到货车次","no":"dhbc"},{"list":[],"name":"提货办理","no":"pickup"},{"list":[],"name":"司机派件","no":"pickupList"},{"list":[],"name":"送货装车","no":"deliveryTask"},{"list":[],"name":"派件改费","no":"feeApply"}],"name":"到货管理","no":"receiveManger"},{"list":[{"list":[],"name":"揽货扫码","no":"goodsScan"},{"list":[],"name":"入库扫码","no":"inventory"},{"list":[],"name":"提货扫码","no":"pickupScan"},{"list":[],"name":"货款扫码","no":"codPayScan"},{"list":[],"name":"异常上报","no":"exceptionReport"},{"list":[],"name":"扫一扫","no":"scanQr"}],"name":"运营支撑","no":"operateSupport"}],"report":[{"list":[{"list":[],"name":"业务员报表","no":"salesmanReport"}],"name":"业务员报表","no":"salesmanReport"},{"list":[{"list":[],"name":"决策报表","no":"decisionReport"},{"list":[],"name":"财务报表","no":"financeReport"}],"name":"财务报表","no":"financeReport"},{"list":[{"list":[],"name":"客户排名","no":"customerRanking"},{"list":[],"name":"货品排名","no":"goodsRanking"},{"list":[],"name":"占比分析","no":"ratioAnalysis"}],"name":"客户报表","no":"customerReport"},{"list":[{"list":[],"name":"未提运单","no":"feePickup"}],"name":"运营报表","no":"operationReport"},{"list":[{"list":[],"name":"发货汇总","no":"shopFromPerformanceReport"},{"list":[],"name":"到货汇总","no":"shopToPerformanceReport"}],"name":"网点报表","no":"orgReport"}]},"appMenuList":[{"name":"决策报表","no":"decisionReport"},{"name":"财务报表","no":"financeReport"},{"name":"业务员报表","no":"salesmanReport"},{"name":"客户排名","no":"customerRanking"},{"name":"运营","no":"home"},{"name":"报表","no":"report"},{"name":"货品排名","no":"goodsRanking"},{"name":"占比分析","no":"ratioAnalysis"},{"name":"发货管理","no":"sendManager"},{"name":"到货管理","no":"receiveManger"},{"name":"运营支撑","no":"operateSupport"},{"name":"业务员报表","no":"salesmanReport"},{"name":"网点报表","no":"shopReport"},{"name":"财务报表","no":"financeReport"},{"name":"客户报表","no":"customerReport"},{"name":"运营报表","no":"operationReport"},{"name":"网点报表","no":"orgReport"},{"name":"到货车次","no":"dhbc"},{"name":"提货办理","no":"pickup"},{"name":"司机派件","no":"pickupList"},{"name":"送货装车","no":"deliveryTask"},{"name":"派件改费","no":"feeApply"},{"name":"揽货扫码","no":"goodsScan"},{"name":"入库扫码","no":"inventory"},{"name":"提货扫码","no":"pickupScan"},{"name":"货款扫码","no":"codPayScan"},{"name":"异常上报","no":"exceptionReport"},{"name":"扫一扫","no":"scanQr"},{"name":"快速开票","no":"fastCreate"},{"name":"发运车次","no":"lineTransport"},{"name":"月结开票","no":"agreementSheet"},{"name":"发货订单","no":"orderList"},{"name":"未提运单","no":"feePickup"},{"name":"发货汇总","no":"shopFromPerformanceReport"},{"name":"到货汇总","no":"shopToPerformanceReport"}],"config":{"applyType":[{"label":"申请作废","value":"2"},{"label":"货款修改","value":"3"},{"label":"免运费","value":"9"},{"label":"其他修改","value":"10"}],"customerBank":[{"label":"工商银行","value":"工商银行"},{"label":"农业银行","value":"农业银行"},{"label":"中国银行","value":"中国银行"},{"label":"建设银行","value":"建设银行"},{"label":"交通银行","value":"交通银行"},{"label":"招商银行","value":"招商银行"},{"label":"邮政储蓄","value":"邮政储蓄"},{"label":"徽商银行","value":"徽商银行"},{"label":"信用社","value":"信用社"}],"defaultCodFeeMode":2,"defaultDeliveryMode":2,"defaultPayOutFeeSettleMode":2,"defaultPremiumMode":1,"showIosUpdate":false},"customerServicePhone":"0551-64276287","email":"","id":2,"loginDate":"2017-04-06 14:26:07","loginName":"18110985921","mobile":"","name":"朱老师","no":"","orgAreaId":340102,"orgAreaName":"瑶海区","orgId":7,"orgName":"合肥分拨","orgParentId":3,"orgParentName":"合肥","orgPhone":"","orgType":3,"oss":{"accessKeyId":"T7Gd4JYZBcyYLCRb","accessKeySecret":"oYByIGs9HoKP2IzHz5c5EANFekAMkX","bucket":"t6-upload-photo","region":"oss-cn-hangzhou"},"phone":"18110985921"},"companyName":"网络快运测试","companyNo":"53","sessionKey":"f439bb2258914a4f876145817624a338","sessionSecret":"67afb5e0"}
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
         * appUrl : http://192.168.6.114:8480/T6
         * attributes : {"appMenuDoc":{"home":[{"list":[{"list":[],"name":"快速开票","no":"fastCreate"},{"list":[],"name":"发运车次","no":"lineTransport"},{"list":[],"name":"月结开票","no":"agreementSheet"},{"list":[],"name":"发货订单","no":"orderList"}],"name":"发货管理","no":"sendManager"},{"list":[{"list":[],"name":"到货车次","no":"dhbc"},{"list":[],"name":"提货办理","no":"pickup"},{"list":[],"name":"司机派件","no":"pickupList"},{"list":[],"name":"送货装车","no":"deliveryTask"},{"list":[],"name":"派件改费","no":"feeApply"}],"name":"到货管理","no":"receiveManger"},{"list":[{"list":[],"name":"揽货扫码","no":"goodsScan"},{"list":[],"name":"入库扫码","no":"inventory"},{"list":[],"name":"提货扫码","no":"pickupScan"},{"list":[],"name":"货款扫码","no":"codPayScan"},{"list":[],"name":"异常上报","no":"exceptionReport"},{"list":[],"name":"扫一扫","no":"scanQr"}],"name":"运营支撑","no":"operateSupport"}],"report":[{"list":[{"list":[],"name":"业务员报表","no":"salesmanReport"}],"name":"业务员报表","no":"salesmanReport"},{"list":[{"list":[],"name":"决策报表","no":"decisionReport"},{"list":[],"name":"财务报表","no":"financeReport"}],"name":"财务报表","no":"financeReport"},{"list":[{"list":[],"name":"客户排名","no":"customerRanking"},{"list":[],"name":"货品排名","no":"goodsRanking"},{"list":[],"name":"占比分析","no":"ratioAnalysis"}],"name":"客户报表","no":"customerReport"},{"list":[{"list":[],"name":"未提运单","no":"feePickup"}],"name":"运营报表","no":"operationReport"},{"list":[{"list":[],"name":"发货汇总","no":"shopFromPerformanceReport"},{"list":[],"name":"到货汇总","no":"shopToPerformanceReport"}],"name":"网点报表","no":"orgReport"}]},"appMenuList":[{"name":"决策报表","no":"decisionReport"},{"name":"财务报表","no":"financeReport"},{"name":"业务员报表","no":"salesmanReport"},{"name":"客户排名","no":"customerRanking"},{"name":"运营","no":"home"},{"name":"报表","no":"report"},{"name":"货品排名","no":"goodsRanking"},{"name":"占比分析","no":"ratioAnalysis"},{"name":"发货管理","no":"sendManager"},{"name":"到货管理","no":"receiveManger"},{"name":"运营支撑","no":"operateSupport"},{"name":"业务员报表","no":"salesmanReport"},{"name":"网点报表","no":"shopReport"},{"name":"财务报表","no":"financeReport"},{"name":"客户报表","no":"customerReport"},{"name":"运营报表","no":"operationReport"},{"name":"网点报表","no":"orgReport"},{"name":"到货车次","no":"dhbc"},{"name":"提货办理","no":"pickup"},{"name":"司机派件","no":"pickupList"},{"name":"送货装车","no":"deliveryTask"},{"name":"派件改费","no":"feeApply"},{"name":"揽货扫码","no":"goodsScan"},{"name":"入库扫码","no":"inventory"},{"name":"提货扫码","no":"pickupScan"},{"name":"货款扫码","no":"codPayScan"},{"name":"异常上报","no":"exceptionReport"},{"name":"扫一扫","no":"scanQr"},{"name":"快速开票","no":"fastCreate"},{"name":"发运车次","no":"lineTransport"},{"name":"月结开票","no":"agreementSheet"},{"name":"发货订单","no":"orderList"},{"name":"未提运单","no":"feePickup"},{"name":"发货汇总","no":"shopFromPerformanceReport"},{"name":"到货汇总","no":"shopToPerformanceReport"}],"config":{"applyType":[{"label":"申请作废","value":"2"},{"label":"货款修改","value":"3"},{"label":"免运费","value":"9"},{"label":"其他修改","value":"10"}],"customerBank":[{"label":"工商银行","value":"工商银行"},{"label":"农业银行","value":"农业银行"},{"label":"中国银行","value":"中国银行"},{"label":"建设银行","value":"建设银行"},{"label":"交通银行","value":"交通银行"},{"label":"招商银行","value":"招商银行"},{"label":"邮政储蓄","value":"邮政储蓄"},{"label":"徽商银行","value":"徽商银行"},{"label":"信用社","value":"信用社"}],"defaultCodFeeMode":2,"defaultDeliveryMode":2,"defaultPayOutFeeSettleMode":2,"defaultPremiumMode":1,"showIosUpdate":false},"customerServicePhone":"0551-64276287","email":"","id":2,"loginDate":"2017-04-06 14:26:07","loginName":"18110985921","mobile":"","name":"朱老师","no":"","orgAreaId":340102,"orgAreaName":"瑶海区","orgId":7,"orgName":"合肥分拨","orgParentId":3,"orgParentName":"合肥","orgPhone":"","orgType":3,"oss":{"accessKeyId":"T7Gd4JYZBcyYLCRb","accessKeySecret":"oYByIGs9HoKP2IzHz5c5EANFekAMkX","bucket":"t6-upload-photo","region":"oss-cn-hangzhou"},"phone":"18110985921"}
         * companyName : 网络快运测试
         * companyNo : 53
         * sessionKey : f439bb2258914a4f876145817624a338
         * sessionSecret : 67afb5e0
         */

        private String appUrl;
        private AttributesBean attributes;
        private String companyName;
        private String companyNo;
        private String sessionKey;
        private String sessionSecret;

        public String getAppUrl() {
            return appUrl;
        }

        public void setAppUrl(String appUrl) {
            this.appUrl = appUrl;
        }

        public AttributesBean getAttributes() {
            return attributes;
        }

        public void setAttributes(AttributesBean attributes) {
            this.attributes = attributes;
        }

        public String getCompanyName() {
            return companyName;
        }

        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }

        public String getCompanyNo() {
            return companyNo;
        }

        public void setCompanyNo(String companyNo) {
            this.companyNo = companyNo;
        }

        public String getSessionKey() {
            return sessionKey;
        }

        public void setSessionKey(String sessionKey) {
            this.sessionKey = sessionKey;
        }

        public String getSessionSecret() {
            return sessionSecret;
        }

        public void setSessionSecret(String sessionSecret) {
            this.sessionSecret = sessionSecret;
        }

        public static class AttributesBean {
            /**
             * appMenuDoc : {"home":[{"list":[{"list":[],"name":"快速开票","no":"fastCreate"},{"list":[],"name":"发运车次","no":"lineTransport"},{"list":[],"name":"月结开票","no":"agreementSheet"},{"list":[],"name":"发货订单","no":"orderList"}],"name":"发货管理","no":"sendManager"},{"list":[{"list":[],"name":"到货车次","no":"dhbc"},{"list":[],"name":"提货办理","no":"pickup"},{"list":[],"name":"司机派件","no":"pickupList"},{"list":[],"name":"送货装车","no":"deliveryTask"},{"list":[],"name":"派件改费","no":"feeApply"}],"name":"到货管理","no":"receiveManger"},{"list":[{"list":[],"name":"揽货扫码","no":"goodsScan"},{"list":[],"name":"入库扫码","no":"inventory"},{"list":[],"name":"提货扫码","no":"pickupScan"},{"list":[],"name":"货款扫码","no":"codPayScan"},{"list":[],"name":"异常上报","no":"exceptionReport"},{"list":[],"name":"扫一扫","no":"scanQr"}],"name":"运营支撑","no":"operateSupport"}],"report":[{"list":[{"list":[],"name":"业务员报表","no":"salesmanReport"}],"name":"业务员报表","no":"salesmanReport"},{"list":[{"list":[],"name":"决策报表","no":"decisionReport"},{"list":[],"name":"财务报表","no":"financeReport"}],"name":"财务报表","no":"financeReport"},{"list":[{"list":[],"name":"客户排名","no":"customerRanking"},{"list":[],"name":"货品排名","no":"goodsRanking"},{"list":[],"name":"占比分析","no":"ratioAnalysis"}],"name":"客户报表","no":"customerReport"},{"list":[{"list":[],"name":"未提运单","no":"feePickup"}],"name":"运营报表","no":"operationReport"},{"list":[{"list":[],"name":"发货汇总","no":"shopFromPerformanceReport"},{"list":[],"name":"到货汇总","no":"shopToPerformanceReport"}],"name":"网点报表","no":"orgReport"}]}
             * appMenuList : [{"name":"决策报表","no":"decisionReport"},{"name":"财务报表","no":"financeReport"},{"name":"业务员报表","no":"salesmanReport"},{"name":"客户排名","no":"customerRanking"},{"name":"运营","no":"home"},{"name":"报表","no":"report"},{"name":"货品排名","no":"goodsRanking"},{"name":"占比分析","no":"ratioAnalysis"},{"name":"发货管理","no":"sendManager"},{"name":"到货管理","no":"receiveManger"},{"name":"运营支撑","no":"operateSupport"},{"name":"业务员报表","no":"salesmanReport"},{"name":"网点报表","no":"shopReport"},{"name":"财务报表","no":"financeReport"},{"name":"客户报表","no":"customerReport"},{"name":"运营报表","no":"operationReport"},{"name":"网点报表","no":"orgReport"},{"name":"到货车次","no":"dhbc"},{"name":"提货办理","no":"pickup"},{"name":"司机派件","no":"pickupList"},{"name":"送货装车","no":"deliveryTask"},{"name":"派件改费","no":"feeApply"},{"name":"揽货扫码","no":"goodsScan"},{"name":"入库扫码","no":"inventory"},{"name":"提货扫码","no":"pickupScan"},{"name":"货款扫码","no":"codPayScan"},{"name":"异常上报","no":"exceptionReport"},{"name":"扫一扫","no":"scanQr"},{"name":"快速开票","no":"fastCreate"},{"name":"发运车次","no":"lineTransport"},{"name":"月结开票","no":"agreementSheet"},{"name":"发货订单","no":"orderList"},{"name":"未提运单","no":"feePickup"},{"name":"发货汇总","no":"shopFromPerformanceReport"},{"name":"到货汇总","no":"shopToPerformanceReport"}]
             * config : {"applyType":[{"label":"申请作废","value":"2"},{"label":"货款修改","value":"3"},{"label":"免运费","value":"9"},{"label":"其他修改","value":"10"}],"customerBank":[{"label":"工商银行","value":"工商银行"},{"label":"农业银行","value":"农业银行"},{"label":"中国银行","value":"中国银行"},{"label":"建设银行","value":"建设银行"},{"label":"交通银行","value":"交通银行"},{"label":"招商银行","value":"招商银行"},{"label":"邮政储蓄","value":"邮政储蓄"},{"label":"徽商银行","value":"徽商银行"},{"label":"信用社","value":"信用社"}],"defaultCodFeeMode":2,"defaultDeliveryMode":2,"defaultPayOutFeeSettleMode":2,"defaultPremiumMode":1,"showIosUpdate":false}
             * customerServicePhone : 0551-64276287
             * email :
             * id : 2
             * loginDate : 2017-04-06 14:26:07
             * loginName : 18110985921
             * mobile :
             * name : 朱老师
             * no :
             * orgAreaId : 340102
             * orgAreaName : 瑶海区
             * orgId : 7
             * orgName : 合肥分拨
             * orgParentId : 3
             * orgParentName : 合肥
             * orgPhone :
             * orgType : 3
             * oss : {"accessKeyId":"T7Gd4JYZBcyYLCRb","accessKeySecret":"oYByIGs9HoKP2IzHz5c5EANFekAMkX","bucket":"t6-upload-photo","region":"oss-cn-hangzhou"}
             * phone : 18110985921
             */

            private AppMenuDocBean appMenuDoc;
            private ConfigBean config;
            private String customerServicePhone;
            private String email;
            private int id;
            private String loginDate;
            private String loginName;
            private String mobile;
            private String name;
            private String no;
            private int orgAreaId;
            private String orgAreaName;
            private int orgId;
            private String orgName;
            private int orgParentId;
            private String orgParentName;
            private String orgPhone;
            private int orgType;
            private OssBean oss;
            private String phone;
            private List<AppMenuListBean> appMenuList;

            public AppMenuDocBean getAppMenuDoc() {
                return appMenuDoc;
            }

            public void setAppMenuDoc(AppMenuDocBean appMenuDoc) {
                this.appMenuDoc = appMenuDoc;
            }

            public ConfigBean getConfig() {
                return config;
            }

            public void setConfig(ConfigBean config) {
                this.config = config;
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

            public int getOrgAreaId() {
                return orgAreaId;
            }

            public void setOrgAreaId(int orgAreaId) {
                this.orgAreaId = orgAreaId;
            }

            public String getOrgAreaName() {
                return orgAreaName;
            }

            public void setOrgAreaName(String orgAreaName) {
                this.orgAreaName = orgAreaName;
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

            public OssBean getOss() {
                return oss;
            }

            public void setOss(OssBean oss) {
                this.oss = oss;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public List<AppMenuListBean> getAppMenuList() {
                return appMenuList;
            }

            public void setAppMenuList(List<AppMenuListBean> appMenuList) {
                this.appMenuList = appMenuList;
            }

            public static class AppMenuDocBean {
                private List<HomeBean> home;
                private List<ReportBean> report;

                public List<HomeBean> getHome() {
                    return home;
                }

                public void setHome(List<HomeBean> home) {
                    this.home = home;
                }

                public List<ReportBean> getReport() {
                    return report;
                }

                public void setReport(List<ReportBean> report) {
                    this.report = report;
                }

                public static class HomeBean {
                    /**
                     * list : [{"list":[],"name":"快速开票","no":"fastCreate"},{"list":[],"name":"发运车次","no":"lineTransport"},{"list":[],"name":"月结开票","no":"agreementSheet"},{"list":[],"name":"发货订单","no":"orderList"}]
                     * name : 发货管理
                     * no : sendManager
                     */

                    private String name;
                    private String no;
                    private List<ListBean> list;

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

                    public List<ListBean> getList() {
                        return list;
                    }

                    public void setList(List<ListBean> list) {
                        this.list = list;
                    }

                    public static class ListBean {
                        /**
                         * list : []
                         * name : 快速开票
                         * no : fastCreate
                         */

                        private String name;
                        private String no;
                        private List<?> list;

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

                        public List<?> getList() {
                            return list;
                        }

                        public void setList(List<?> list) {
                            this.list = list;
                        }
                    }
                }

                public static class ReportBean {
                    /**
                     * list : [{"list":[],"name":"业务员报表","no":"salesmanReport"}]
                     * name : 业务员报表
                     * no : salesmanReport
                     */

                    private String name;
                    private String no;
                    private List<ListBeanX> list;

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

                    public List<ListBeanX> getList() {
                        return list;
                    }

                    public void setList(List<ListBeanX> list) {
                        this.list = list;
                    }

                    public static class ListBeanX {
                        /**
                         * list : []
                         * name : 业务员报表
                         * no : salesmanReport
                         */

                        private String name;
                        private String no;
                        private List<?> list;

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

                        public List<?> getList() {
                            return list;
                        }

                        public void setList(List<?> list) {
                            this.list = list;
                        }
                    }
                }
            }

            public static class ConfigBean {
                /**
                 * applyType : [{"label":"申请作废","value":"2"},{"label":"货款修改","value":"3"},{"label":"免运费","value":"9"},{"label":"其他修改","value":"10"}]
                 * customerBank : [{"label":"工商银行","value":"工商银行"},{"label":"农业银行","value":"农业银行"},{"label":"中国银行","value":"中国银行"},{"label":"建设银行","value":"建设银行"},{"label":"交通银行","value":"交通银行"},{"label":"招商银行","value":"招商银行"},{"label":"邮政储蓄","value":"邮政储蓄"},{"label":"徽商银行","value":"徽商银行"},{"label":"信用社","value":"信用社"}]
                 * defaultCodFeeMode : 2
                 * defaultDeliveryMode : 2
                 * defaultPayOutFeeSettleMode : 2
                 * defaultPremiumMode : 1
                 * showIosUpdate : false
                 */

                private int defaultCodFeeMode;
                private int defaultDeliveryMode;
                private int defaultPayOutFeeSettleMode;
                private int defaultPremiumMode;
                private boolean showIosUpdate;
                private List<ApplyTypeBean> applyType;
                private List<CustomerBankBean> customerBank;

                public int getDefaultCodFeeMode() {
                    return defaultCodFeeMode;
                }

                public void setDefaultCodFeeMode(int defaultCodFeeMode) {
                    this.defaultCodFeeMode = defaultCodFeeMode;
                }

                public int getDefaultDeliveryMode() {
                    return defaultDeliveryMode;
                }

                public void setDefaultDeliveryMode(int defaultDeliveryMode) {
                    this.defaultDeliveryMode = defaultDeliveryMode;
                }

                public int getDefaultPayOutFeeSettleMode() {
                    return defaultPayOutFeeSettleMode;
                }

                public void setDefaultPayOutFeeSettleMode(int defaultPayOutFeeSettleMode) {
                    this.defaultPayOutFeeSettleMode = defaultPayOutFeeSettleMode;
                }

                public int getDefaultPremiumMode() {
                    return defaultPremiumMode;
                }

                public void setDefaultPremiumMode(int defaultPremiumMode) {
                    this.defaultPremiumMode = defaultPremiumMode;
                }

                public boolean isShowIosUpdate() {
                    return showIosUpdate;
                }

                public void setShowIosUpdate(boolean showIosUpdate) {
                    this.showIosUpdate = showIosUpdate;
                }

                public List<ApplyTypeBean> getApplyType() {
                    return applyType;
                }

                public void setApplyType(List<ApplyTypeBean> applyType) {
                    this.applyType = applyType;
                }

                public List<CustomerBankBean> getCustomerBank() {
                    return customerBank;
                }

                public void setCustomerBank(List<CustomerBankBean> customerBank) {
                    this.customerBank = customerBank;
                }

                public static class ApplyTypeBean {
                    /**
                     * label : 申请作废
                     * value : 2
                     */

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

                public static class CustomerBankBean {
                    /**
                     * label : 工商银行
                     * value : 工商银行
                     */

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

            public static class OssBean {
                /**
                 * accessKeyId : T7Gd4JYZBcyYLCRb
                 * accessKeySecret : oYByIGs9HoKP2IzHz5c5EANFekAMkX
                 * bucket : t6-upload-photo
                 * region : oss-cn-hangzhou
                 */

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

                public String getAccessKeySecret() {
                    return accessKeySecret;
                }

                public void setAccessKeySecret(String accessKeySecret) {
                    this.accessKeySecret = accessKeySecret;
                }

                public String getBucket() {
                    return bucket;
                }

                public void setBucket(String bucket) {
                    this.bucket = bucket;
                }

                public String getRegion() {
                    return region;
                }

                public void setRegion(String region) {
                    this.region = region;
                }
            }

            public static class AppMenuListBean {
                /**
                 * name : 决策报表
                 * no : decisionReport
                 */

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
        }
    }
}
