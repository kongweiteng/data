package com.datahub.data.rest;

import com.alibaba.fastjson.JSONObject;
import com.datahub.data.service.ZiRoomDataService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/ziroom")
@Api(tags = {"自如数据"})
public class ZiRoomDataController {
    @Resource
    ZiRoomDataService ziRoomDataService;

    @GetMapping(value = "/getOneData")
    @ApiOperation("根据id获取精确某条数据")
    public JSONObject getOneData(@RequestParam("index") String index, @RequestParam("type") String type, @RequestParam("id") String id) {
        JSONObject oneData = ziRoomDataService.getOneData(index, type, id);
        return oneData;

    }


}
