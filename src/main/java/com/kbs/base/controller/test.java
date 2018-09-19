package com.kbs.base.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fugang
 * @create 2018-08-15 11:07
 **/
@RestController
@RequestMapping("/api/basicData")
public class test {
    private static final Logger logger = LoggerFactory.getLogger(test.class);

    @GetMapping(value = "/querySickBeds")
    public void querySickBedByHospitalCode() {
        logger.info("2222222222222222222");
        return;
    }
}
