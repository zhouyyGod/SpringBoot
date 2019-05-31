package com.zyy.demo2.service;

import com.zyy.demo2.model.response.QueryResponseResult;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    public QueryResponseResult findAll() {
        return new QueryResponseResult("", 10000, "操作成功");
    }
}
