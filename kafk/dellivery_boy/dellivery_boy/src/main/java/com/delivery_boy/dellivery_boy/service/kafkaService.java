package com.delivery_boy.dellivery_boy.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import static com.delivery_boy.dellivery_boy.config.allconstants.TOPIC_NAME;

@Service
public class kafkaService {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;


    private Logger logger= LoggerFactory.getLogger(kafkaService.class);

    public boolean updateLocation(String location){
        this.kafkaTemplate.send(TOPIC_NAME,location);
        logger.info("location updates");
        return true;
    }
}
