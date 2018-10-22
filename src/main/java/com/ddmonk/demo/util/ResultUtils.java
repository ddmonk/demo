package com.ddmonk.demo.util;

import com.ddmonk.demo.demain.Result;

public class ResultUtils {

    public static Result success(Object object){
        Result result = new Result();
        result.setCode(0);
        result.setMsg("success");
        result.setData(object);
        return result;
    }

    public static Result success(){
        return success(null);
    }

    public static Result error(Integer code, String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }


}
