package com.example.appnaruto;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiUser {
    @FormUrlEncoded
    @POST("register")
    Call<User> REGISTER_CALL(
            @Field("name") String name,
            @Field("last_name_f") String last_name_f,
            @Field("last_name_m") String last_name_m,
            @Field("date_born") String date_born,
            @Field("email") String email,
            @Field("password") String password,
            @Field("verify_password") String verify_password
    );
    @FormUrlEncoded
    @POST("login")
    Call<User>LOGIN_CALL(
            @Field("email") String email,
            @Field("password") String password
    );

    @FormUrlEncoded
    @POST("validate_account")
    Call<User>VALIDATE_CALL(
            @Field("email") String email,
            @Field("code") String code
    );
}
