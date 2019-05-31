package com.zyy.demo2.controller;

import com.zyy.demo2.model.response.QueryResponseResult;
import com.zyy.demo2.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("producer")
public class ProducerController {

    @Autowired
    private ProducerService producerService;

    @GetMapping("findAll")
    public QueryResponseResult findAll(){
        return producerService.findAll();
    }

}
