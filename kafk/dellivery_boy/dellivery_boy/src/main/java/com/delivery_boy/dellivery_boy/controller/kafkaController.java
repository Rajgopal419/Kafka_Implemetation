package com.delivery_boy.dellivery_boy.controller;

import com.delivery_boy.dellivery_boy.service.kafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.HTML;

@RestController
@RequestMapping("/location")
public class kafkaController {

    @Autowired
    private kafkaService kafkaService;

    @PostMapping("/update")
    public ResponseEntity<?> locationupdate(){
//        for( int i=0;i<100;i++){
            kafkaService.updateLocation("("+Math.round(Math.random()*100) + " , "+ Math.round(Math.random()*100) + ")");
//        }
        return new ResponseEntity<>("updated",HttpStatus.OK);
    }
}
