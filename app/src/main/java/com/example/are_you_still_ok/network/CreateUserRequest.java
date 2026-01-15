package com.example.are_you_still_ok.network;

public class CreateUserRequest {
    public String username;
    public String emergencyPhone;
    public String phone;
    public Integer goldenHours = 24;
    public Boolean remindEnabled = false;

    public CreateUserRequest(String username, String emergencyPhone) {
        this.username = username;
        this.emergencyPhone = emergencyPhone;
    }
}
