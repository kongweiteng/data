package com.datahub.data.service;

import com.alibaba.fastjson.JSONObject;

public interface ZiRoomDataService {
    /**
     * 根据id获取精确某条数据
     */
    public JSONObject getOneData(String index, String type, String id);

}
