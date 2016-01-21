package com.pasha.efe.dagger2example;

import android.app.IntentService;
import android.content.Intent;

import com.pasha.efe.dagger2example.pojos.Repo;

import javax.inject.Inject;

import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * Created by efe on 20/01/16.
 */
public class GetRepoDetailIntentService extends IntentService implements Callback<Repo> {

    @Inject
    Retrofit retrofit;

    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */
    public GetRepoDetailIntentService(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        ((DaggerApplication) getApplication()).getNetComponent().inject(this);

        GitHubService gitHubService = retrofit.create(GitHubService.class);
        Call<Repo> repoCall;

        repoCall = gitHubService.getRepoDetail("efebudak", "dagger2example");
        repoCall.enqueue(this);

    }

    @Override
    public void onResponse(Response<Repo> response, Retrofit retrofit) {
        response.body().getFullName();
    }

    @Override
    public void onFailure(Throwable t) {

    }
}
