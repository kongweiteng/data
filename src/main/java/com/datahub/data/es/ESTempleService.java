package com.datahub.data.es;

import com.alibaba.fastjson.JSONObject;

//@Service
public class ESTempleService {

//    @Resource
//    ElasticsearchTemplate elasticsearchTemplate;

    public JSONObject get() {
//        SumBuilder sb = AggregationBuilders.sum("tpPrice").field("payPrice");
//        BoolQueryBuilder bqb = QueryBuilders.boolQuery();
//        bqb.must(QueryBuilders.termQuery("state",SuperAppConstant.PAY_STATUS_SUCCESS));
//        bqb.must(QueryBuilders.termQuery("appId",appId));
//        bqb.must(QueryBuilders.boolQuery()
//                .should(QueryBuilders.matchQuery("payPlatform", SuperAppConstant.PAY_PLATFORM_TL))
//                .should(QueryBuilders.matchQuery("payPlatform", SuperAppConstant.PAY_PLATFORM_TL_WX_APP))
//                .should(QueryBuilders.matchQuery("payPlatform", SuperAppConstant.PAY_PLATFORM_TL_ALI))
//                .should(QueryBuilders.matchQuery("payPlatform", SuperAppConstant.PAY_PLATFORM_TL_WX_JS))
//                .should(QueryBuilders.matchQuery("payPlatform", SuperAppConstant.PAY_PLATFORM_TL_APP))
//                .should(QueryBuilders.matchQuery("payPlatform", SuperAppConstant.PAY_PLATFORM_TL_WX_H5))
//                .should(QueryBuilders.matchQuery("payPlatform", SuperAppConstant.PAY_PLATFORM_WX_GWORLD))
//                .should(QueryBuilders.matchQuery("payPlatform", SuperAppConstant.PAY_PLATFORM_ALI_GWORLD))
//        );
//        SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(bqb).withIndices(SuperAppConstant.ES_INDEX_NAME).withTypes(SuperAppConstant.ES_PAY_TYPE)
//                .withSearchType(SearchType.DEFAULT)
//                .addAggregation(sb).build();
        return null;
    }

}
