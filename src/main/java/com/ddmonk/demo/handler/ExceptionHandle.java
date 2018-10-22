package com.ddmonk.demo.handler;

import com.ddmonk.demo.demain.Result;
import com.ddmonk.demo.util.ResultUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandle {

    private final static Logger LOG = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e){

        LOG.error("system error {}",e);
        return ResultUtils.error(100,e.getMessage());
    }

}
