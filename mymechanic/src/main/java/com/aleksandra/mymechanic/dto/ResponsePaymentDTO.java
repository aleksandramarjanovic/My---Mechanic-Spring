package com.aleksandra.mymechanic.dto;

public class ResponsePaymentDTO {

    private boolean success;

    private String name;

    public ResponsePaymentDTO() {
    }

    public ResponsePaymentDTO(boolean success, String name) {
        this.success = success;
        this.name = name;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
