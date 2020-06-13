package com.miyu.common;

import java.io.Serializable;

/**
 * 数据传输对象，后端输出对象
 * description: Dto <br>
 * date: 2020/6/9 8:36 上午 <br>
 * author: kangpei <br>
 * version: 1.0 <br>
 */
public class Dto<T> implements Serializable {

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
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

    //判断系统是否出错做出相应的true或者false的返回，与业务无关，出现的各种异常
    private String success;

    //该错误码为自定义，一般0表示无错
    private String errorCode;

    //对应的提示信息
    private String msg;

    //具体返回数据内容(pojo、自定义VO、其他)
    private T data;
}
