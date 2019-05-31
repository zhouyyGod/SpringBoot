package com.zyy.demo.client;

import com.zyy.demo.model.response.QueryResponseResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
@FeignClient("demo2")
public interface ProducerClient {

    @GetMapping("producer/findAll")
    QueryResponseResult findAll();

}
