package com.ddmonk.demo.demain;

public class Result<T> {

    /**
     * code
     */
    private Integer code;


    /**
     * 提示信息
     */
    private String msg;

    /**
     * return value
     */
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
