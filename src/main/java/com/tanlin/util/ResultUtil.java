package com.tanlin.util;

import com.tanlin.domain.Result;

/**
 * Created by tanlin on 2018-4-19.
 */
public class ResultUtil {
    public static Result success(Object data){
        Result result = new Result();
        result.setCode(0);
        result.setMsg("success");
        result.setData(data);
        return result;
    }

    public static Result success(){
        return success(null);
    }

    public static Result error(Integer code,String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
