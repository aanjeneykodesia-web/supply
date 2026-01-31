
package com.example.supplychain.api;

import com.example.supplychain.model.User;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {

    @POST("api/login")
    Call<User> loginUser(@Body User user);

    @POST("api/location/update")
    Call<String> updateLocation(@Body String locationJson);
}
