package cn.chendahai.dingding.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(DingdingService.class)
@EnableConfigurationProperties(DingdingServiceProperties.class)
public class DingdingStarterEnableAutoConfiguration {

    private DingdingServiceProperties dingdingServiceProperties;

    @Autowired
    public DingdingStarterEnableAutoConfiguration(DingdingServiceProperties dingdingServiceProperties) {
        this.dingdingServiceProperties = dingdingServiceProperties;
    }

    @Bean
    @ConditionalOnProperty(prefix = "dingding.service", name = "enable", havingValue = "true")
    DingdingService helloService() {
        return new DingdingService(dingdingServiceProperties.getToken(), dingdingServiceProperties.getPhone());
    }


}
