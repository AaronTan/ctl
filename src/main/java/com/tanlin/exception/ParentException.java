package com.tanlin.exception;

import lombok.Data;

/**
 * Created by tanlin on 2018-4-19.
 */
@Data
public class ParentException extends RuntimeException{
    private Integer code;

    public ParentException(Integer code,String message){
        super(message);
        this.code = code;
    }
}
