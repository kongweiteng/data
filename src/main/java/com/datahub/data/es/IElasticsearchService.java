package com.datahub.data.es;

import com.alibaba.fastjson.JSONObject;

public interface IElasticsearchService {
    /**
     * 根据id获取精确某条数据
     */
    public JSONObject getOneData(String index, String type, String id);


}
