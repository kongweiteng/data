package com.datahub.data;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 接口返回实体
 */
@ApiModel("com.enn.vo.energy.EtspResp")
@Data
public class RespEntity<T> implements Serializable {
    @ApiModelProperty(value = "接口返回信息", name = "msg", example = "请求成功！！！")
    private String msg;
    @ApiModelProperty(value = "接口返回码", name = "code", example = "200")
    private Integer code;

    private T data;
    @ApiModelProperty(value = "接口返回错误信息", name = "error", example = "参数错误！！！")
    private String error;

    public static <T> RespEntity<T> ok(T obj) {
        RespEntity respEntity = new RespEntity();
        respEntity.setCode(20000);
        respEntity.setMsg(StatusCode.SUCCESS.getMsg());
        respEntity.setData(obj);
        return respEntity;
    }
}
