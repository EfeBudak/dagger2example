package com.pasha.efe.dagger2example;

import com.pasha.efe.dagger2example.pojos.Repo;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by efe on 20/01/16.
 */
public interface GitHubService {

    @GET("users/{user}/{repo}")
    Call<Repo> getRepoDetail(@Path("user") String user, @Path("repo") String repo);

}
