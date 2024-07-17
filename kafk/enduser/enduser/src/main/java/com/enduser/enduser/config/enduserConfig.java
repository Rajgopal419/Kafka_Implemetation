package com.enduser.enduser.config;

import org.apache.kafka.common.internals.Topic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class enduserConfig {

//    private appConstants appConstants;
    @KafkaListener(topics= appConstants.TOPIC_NAME,groupId = appConstants.GROUP_ID)
    public void updated(String value){
        System.out.println(value);
    }
}
