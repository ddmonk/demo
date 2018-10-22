package com.ddmonk.demo.exception;

import javax.persistence.criteria.CriteriaBuilder;

public class ManException extends RuntimeException {

    private Integer code;

    public ManException(Integer code, String msg) {
        super(msg);
        this.code = code;
    }
}
