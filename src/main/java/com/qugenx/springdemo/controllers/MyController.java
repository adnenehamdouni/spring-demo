package com.qugenx.springdemo.controllers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    protected final Log logger = LogFactory.getLog(this.getClass());

    public void hello() {
        logger.info("hello world!");
    }
}
