package com.datahub.data.feign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(url = "${spring.data.elasticsearch.cluster-nodes}")
public interface ESFeignService {

}
