package com.zyy.demo.controller;

import com.zyy.demo.client.ProducerClient;
import com.zyy.demo.model.response.QueryResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private ProducerClient producerClient;

    @GetMapping("find")
    public QueryResponseResult find(){
        return producerClient.findAll();
    }


}
