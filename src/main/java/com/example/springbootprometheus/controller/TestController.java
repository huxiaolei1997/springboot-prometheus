package com.example.springbootprometheus.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用途描述
 *
 * @author 胡晓磊
 * @version $Id: TestController, v0.1
 * @company 杭州信牛网络科技有限公司
 * @date 2018年12月19日 14:05 胡晓磊 Exp $
 */
@RestController
public class TestController {
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/test/{id}")
    public ResponseEntity<String> test(@PathVariable("id") String id) {
        logger.info("id : {}", id);
        return ResponseEntity.ok(id);
    }
}
