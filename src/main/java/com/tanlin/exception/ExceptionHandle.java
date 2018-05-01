package com.tanlin.exception;

import com.tanlin.domain.Result;
import com.tanlin.util.ResultUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by tanlin on 2018-4-19.
 */
@ControllerAdvice
public class ExceptionHandle{

    @ExceptionHandler(value=Exception.class)
    @ResponseBody
    public Result handle(Exception e){
        if(e instanceof ParentException){
            ParentException parentException = (ParentException)e;
            return ResultUtil.error(parentException.getCode(),parentException.getMessage());
        }else {
//            return ResultUtil.error(-1, e.getMessage());
            return ResultUtil.error(-1,"未知异常");
        }
    }
}
