package com.datahub.data.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.datahub.data.es.IElasticsearchService;
import com.datahub.data.service.ZiRoomDataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ZiRoomDataServiceImpl implements ZiRoomDataService {
    @Resource
    IElasticsearchService elasticsearchService;

    @Override
    public JSONObject getOneData(String index, String type, String id) {
        JSONObject oneData = elasticsearchService.getOneData(index, type, id);
        return oneData;
    }
}
