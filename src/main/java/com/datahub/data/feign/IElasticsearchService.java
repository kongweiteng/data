package com.datahub.data.feign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(url = "${spring.data.elasticsearch.url}", name = "es")
public interface IElasticsearchService {


}
