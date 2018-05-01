package com.tanlin.domain;

import lombok.Data;

/**
 * Created by tanlin on 2018-4-19.
 */
@Data
public class Result<T> {
    private Integer code;       //错误码
    private String msg;         //提示信息
    private T Data;             //返回对象
}
