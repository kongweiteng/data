package com.datahub.data.es;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.script.mustache.SearchTemplateRequest;
import org.springframework.stereotype.Service;

@Service
public class ElasticsearchServiceImpl implements IElasticsearchService {
    private RestHighLevelClient client;


    public ElasticsearchServiceImpl() {
        client = new RestHighLevelClient(
                RestClient.builder(
                        new HttpHost("39.96.77.2", 9200, "http")
                ));
    }

    @Override
    public JSONObject getOneData(String index, String type, String id) {
        SearchTemplateRequest request = new SearchTemplateRequest();

        return null;
    }
}
