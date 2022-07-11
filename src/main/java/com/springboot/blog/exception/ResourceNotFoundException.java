package com.springboot.blog.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class ResourceNotFoundException extends RuntimeException {
    private String fieldName;
    private long fieldValue;
    private String resourceName;

    public String getFieldName() {
        return fieldName;
    }

    public long getFieldValue() {
        return fieldValue;
    }

    public String getResourceName() {
        return resourceName;
    }

    public ResourceNotFoundException(String fieldName, long fieldValue, String resourceName) {
        super(String.format("%s not found with %s:%s", resourceName, fieldName, fieldValue));
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
        this.resourceName = resourceName;
    }
}
