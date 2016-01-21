package com.pasha.efe.dagger2example;

import com.pasha.efe.dagger2example.pojos.Repo;

/**
 * Created by efe on 20/01/16.
 */
public interface MainView {
    void onSuccess(Repo repo);
    void onFailure();
}
