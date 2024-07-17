package com.delivery_boy.dellivery_boy.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
//import org.springframework.kafka.config.allconstants;
@Configuration
public class kafkaConfig {
    @Bean
    public NewTopic topic(){
       return TopicBuilder
               .name(allconstants.TOPIC_NAME)
               .partitions(2)
               .build();
    }
}
