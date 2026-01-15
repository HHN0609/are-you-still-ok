package com.example.are_you_still_ok.network;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ApiService {
    @POST("/api/users")
    Call<ApiResponse<User>> createUser(@Body CreateUserRequest request);

    @POST("/api/users/{userId}/checkin")
    Call<ApiResponse<CheckinResponse>> checkIn(@Path("userId") Long userId);

    @GET("/api/users/{userId}")
    Call<ApiResponse<User>> getUser(@Path("userId") Long userId);

    @retrofit2.http.PUT("/api/users/{userId}")
    Call<ApiResponse<User>> updateUser(@Path("userId") Long userId, @Body UpdateUserRequest request);
}
