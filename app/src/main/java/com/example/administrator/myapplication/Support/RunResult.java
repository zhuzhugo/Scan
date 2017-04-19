package com.example.administrator.myapplication.Support;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;

/**
 * Created by panwei on 14-8-25.
 */
public class RunResult<T> {
    public static final String DEFAULT_OK = "成功";
    public static final String DEFAULT_FAIL = "失败";

    private Integer statusCode;
    private String message;
    private T data;

    public static <T> RunResult wrap(String response, TypeReference<RunResult<T>> typeReference) {
        RunResult<T> runResult = JSONObject.parseObject(response, typeReference);
        return runResult;
    }

    public static RunResult ok() {
        return ok(null);
    }

    public static <T> RunResult ok(T data) {
        return ok(HttpStatus.OK, data);
    }

    public static <T> RunResult ok(HttpStatus statusCode, T data) {
        return ok(statusCode.value(), data);
    }

    public static <T> RunResult ok(Integer statusCode, T data) {
        if (HttpStatus.valueOf(statusCode).is4xxClientError() || HttpStatus.valueOf(statusCode).is5xxServerError()) {
            throw new IllegalArgumentException("successful statusCode must not be 4xx or 5xx");
        }
        RunResult<T> runResult = new RunResult<T>();
        runResult.setStatusCode(statusCode);
        runResult.setMessage(DEFAULT_OK);
        runResult.setData(data);
        return runResult;
    }

    public static RunResult networkUnEnabled(){
        return RunResult.fail(HttpStatus.NOT_ACCEPTABLE, "网络不可用，请检查网络连接是否打开或是否有网络信号");
    }

    public static RunResult fileNotFound(){
        return RunResult.fail(HttpStatus.NOT_FOUND, "本地文件没有找到，无法上传");
    }

    public static RunResult fail(Integer statusCode, String message) {
        return fail(statusCode, message, null);
    }

    public static RunResult fail(HttpStatus statusCode, String message) {
        return fail(statusCode.value(), message);
    }

    public static RunResult fail(Integer statusCode, Exception exception) {
        return fail(statusCode, exception.getMessage());
    }

    public static RunResult fail(HttpStatus statusCode, Exception exception) {
        return fail(statusCode.value(), exception.getMessage());
    }

    public static RunResult fail(Integer statusCode) {
        return fail(statusCode, DEFAULT_FAIL);
    }

    public static RunResult fail(HttpStatus statusCode) {
        return fail(statusCode.value(), DEFAULT_FAIL);
    }

    public static <T> RunResult<T> fail(HttpStatus statusCode, String message, T data) {
        return fail(statusCode.value(), message, data);
    }

    public static <T> RunResult<T> fail(Integer statusCode, String message, T data) {
        if (!(HttpStatus.valueOf(statusCode).is4xxClientError() || HttpStatus.valueOf(statusCode).is5xxServerError())) {
            throw new IllegalArgumentException("fail statusCode must be 4xx or 5xx");
        }
        RunResult runResult = new RunResult();
        runResult.setStatusCode(statusCode);
        runResult.setMessage(message);
        runResult.setData(data);
        return runResult;
    }


    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Boolean isSuccess() {
        return !(HttpStatus.valueOf(this.statusCode).is4xxClientError() || HttpStatus.valueOf(this.statusCode).is5xxServerError());
    }
}
