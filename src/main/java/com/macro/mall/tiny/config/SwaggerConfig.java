package com.macro.mall.tiny.config;

import com.macro.mall.tiny.common.config.BaseSwaggerConfig;
import com.macro.mall.tiny.common.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger API文档相关配置
 * Created by macro on 2018/4/26.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.macro.mall.tiny.modules")
                .title("APT 系統文件")
                .description("pi-team@aptg.com.tw")
                .contactName("pi-team")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }
}
