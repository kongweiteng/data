package com.datahub.data;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableSwagger2
@ComponentScan
public class Swagger2 {

    @Bean
    public Docket createRestApi() {
        //自定义异常信息
        ArrayList<ResponseMessage> responseMessages = new ArrayList<ResponseMessage>() {{
//            add(new ResponseMessageBuilder().code(StatusCode.ERROR.getCode()).message(StatusCode.ERROR.getMsg()).build());
//            add(new ResponseMessageBuilder().code(StatusCode.SUCCESS.getCode()).message(StatusCode.SUCCESS.getMsg()).build());
//            add(new ResponseMessageBuilder().code(StatusCode.A.getCode()).message(StatusCode.A.getMsg()).build());
//            add(new ResponseMessageBuilder().code(StatusCode.B.getCode()).message(StatusCode.B.getMsg()).build());
//            add(new ResponseMessageBuilder().code(StatusCode.C.getCode()).message(StatusCode.C.getMsg()).build());
//            add(new ResponseMessageBuilder().code(StatusCode.D.getCode()).message(StatusCode.D.getMsg()).build());
//            add(new ResponseMessageBuilder().code(StatusCode.E.getCode()).message(StatusCode.E.getMsg()).build());
//            add(new ResponseMessageBuilder().code(StatusCode.F.getCode()).message(StatusCode.F.getMsg()).build());
//            add(new ResponseMessageBuilder().code(StatusCode.G.getCode()).message(StatusCode.G.getMsg()).build());
//            add(new ResponseMessageBuilder().code(StatusCode.H.getCode()).message(StatusCode.H.getMsg()).build());
//            add(new ResponseMessageBuilder().code(StatusCode.I.getCode()).message(StatusCode.I.getMsg()).build());
//            add(new ResponseMessageBuilder().code(StatusCode.G.getCode()).message(StatusCode.J.getMsg()).build());
//            add(new ResponseMessageBuilder().code(StatusCode.K.getCode()).message(StatusCode.K.getMsg()).build());
//            add(new ResponseMessageBuilder().code(StatusCode.L.getCode()).message(StatusCode.L.getMsg()).build());
//            add(new ResponseMessageBuilder().code(StatusCode.M.getCode()).message(StatusCode.M.getMsg()).build());
//            add(new ResponseMessageBuilder().code(StatusCode.N.getCode()).message(StatusCode.N.getMsg()).build());
//            add(new ResponseMessageBuilder().code(StatusCode.O.getCode()).message(StatusCode.O.getMsg()).build());
//            add(new ResponseMessageBuilder().code(StatusCode.P.getCode()).message(StatusCode.P.getMsg()).build());
//            add(new ResponseMessageBuilder().code(StatusCode.Q.getCode()).message(StatusCode.Q.getMsg()).build());
//            add(new ResponseMessageBuilder().code(StatusCode.R.getCode()).message(StatusCode.R.getMsg()).build());
//            add(new ResponseMessageBuilder().code(StatusCode.S.getCode()).message(StatusCode.S.getMsg()).build());
//            add(new ResponseMessageBuilder().code(StatusCode.T.getCode()).message(StatusCode.T.getMsg()).build());
//            add(new ResponseMessageBuilder().code(StatusCode.U.getCode()).message(StatusCode.U.getMsg()).build());
//            add(new ResponseMessageBuilder().code(StatusCode.V.getCode()).message(StatusCode.V.getMsg()).build());
//            add(new ResponseMessageBuilder().code(StatusCode.W.getCode()).message(StatusCode.W.getMsg()).build());
//            add(new ResponseMessageBuilder().code(StatusCode.X.getCode()).message(StatusCode.X.getMsg()).build());
//
//            add(new ResponseMessageBuilder().code(StatusCode.E_A.getCode()).message(StatusCode.E_A.getMsg()).build());
//            add(new ResponseMessageBuilder().code(StatusCode.E_B.getCode()).message(StatusCode.E_B.getMsg()).build());
//            add(new ResponseMessageBuilder().code(StatusCode.E_C.getCode()).message(StatusCode.E_C.getMsg()).build());
//            add(new ResponseMessageBuilder().code(StatusCode.E_D.getCode()).message(StatusCode.E_D.getMsg()).build());
//            add(new ResponseMessageBuilder().code(StatusCode.E_E.getCode()).message(StatusCode.E_E.getMsg()).build());
//            add(new ResponseMessageBuilder().code(StatusCode.E_F.getCode()).message(StatusCode.E_F.getMsg()).build());
        }};
        ParameterBuilder tokenPar = new ParameterBuilder();
        List<Parameter> pars = new ArrayList<Parameter>();
        tokenPar.name("token").description("令牌(获取Token请联系管理员)").modelRef(new ModelRef("string")).parameterType("header").required(false).build();
        pars.add(tokenPar.build());
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.datahub.data.rest"))
                .paths(PathSelectors.any())
                .build()
                .globalOperationParameters(pars)
                .apiInfo(apiInfo())
                .useDefaultResponseMessages(false)
                .globalResponseMessage(RequestMethod.GET, responseMessages)
                .globalResponseMessage(RequestMethod.POST, responseMessages)
                .globalResponseMessage(RequestMethod.PUT, responseMessages)
                .globalResponseMessage(RequestMethod.DELETE, responseMessages);
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Elasticsearch API")
                .version("2.0")
                .contact(new Contact("孔维腾", "", "kongweiteng@enn.cn"))
                .description("Elasticsearch")
                .build();
    }

}
