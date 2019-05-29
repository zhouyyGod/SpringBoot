package com.zyy.demo2.service;

import com.zyy.demo2.model.response.QueryResponseResult;
import org.springframework.stereotype.Service;

/**
 * Create by ZYY on 2019/5/28 14:24
 */
@Service
public class ProducerService {

    public QueryResponseResult findAll() {
        return new QueryResponseResult("", 10000, "操作成功");
    }
}
