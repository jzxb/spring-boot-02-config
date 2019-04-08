package org.lhx.springboot.config;

import org.lhx.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lhx
 * @date 2019/4/8 - 17:48
 */
@Configuration
public class MyAppConfig {

    //将方法的返回值添加到容器中，默认id为方法名
    @Bean
    public HelloService helloService(){
        System.out.println("@Bean给容器中添加组件");
        return new HelloService();
    }
}
