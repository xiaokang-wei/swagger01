package com.swagger.config;

import com.google.common.base.Predicates;
import com.sun.org.apache.bcel.internal.generic.NEW;
import com.swagger.annocation.SwaggerAnnocation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author wxk
 * @date 2020/12/5 19:54
 */
@Configuration
public class SwaggerConfig {

    @Bean
    public Docket getDocket(){
        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
        apiInfoBuilder.title("我是标题").description("我是描述").version("我是版本号=1.0").contact(new Contact("公司名","www.baidu.com","316445585@qq.com"));
        ApiInfo apiInfo = apiInfoBuilder.build();



        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo)
                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.swagger.api"))
//                .apis(RequestHandlerSelectors.withMethodAnnotation(SwaggerAnnocation.class))
//                .apis(Predicates.not(RequestHandlerSelectors.withMethodAnnotation(SwaggerAnnocation.class)))
                .paths(Predicates.or(
                        PathSelectors.regex("/user/.*")
                ))
                .build();
        return docket;
    }
}
