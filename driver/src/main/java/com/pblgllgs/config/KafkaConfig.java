package com.pblgllgs.config;

import com.pblgllgs.constant.Constant;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/*
 *
 * @author pblgl
 * Created on 16-11-2023
 *
 */
@Configuration
public class KafkaConfig {


    @Bean
    public NewTopic topic() {
        return TopicBuilder
                .name(Constant.LOCATION)
                .partitions(5)
                .build();
    }
}
