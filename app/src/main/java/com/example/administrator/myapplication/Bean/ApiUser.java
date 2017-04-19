package com.example.administrator.myapplication.Bean;

import java.io.Serializable;

/**
 * Created by hujian on 14-7-21.
 */
public class ApiUser implements Serializable {
    private static final long serialVersionUID = 1L;

    private String appUrl;                  //租户应用地址
    private String companyNo;               //公司编号
    private String companyName;             //公司名称
    private String sessionKey;              //会话标识
    private String sessionSecret;           //会话密钥
    private ApiUserAttributes attributes;   //登陆用户属性

    public String getAppUrl() {
        return appUrl;
    }

    public void setAppUrl(String appUrl) {
        this.appUrl = appUrl;
    }

    public String getCompanyNo() {
        return companyNo;
    }

    public void setCompanyNo(String companyNo) {
        this.companyNo = companyNo;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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

    public ApiUserAttributes getAttributes() {
        return attributes;
    }

    public void setAttributes(ApiUserAttributes attributes) {
        this.attributes = attributes;
    }
}
