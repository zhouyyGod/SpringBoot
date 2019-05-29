package com.zyy.demo2.model.response;

/**
 * Create by ZYY on 2019/5/28 14:33
 */
public class QueryResponseResult{

    Object data;
    int code;
    String message;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public QueryResponseResult() {
    }


    public QueryResponseResult(Object data, int code, String message) {
        this.data = data;
        this.code = code;
        this.message = message;
    }

    @Override
    public String toString() {
        return "QueryResponseResult{" +
                "data=" + data +
                ", code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}
