package com.pasha.efe.dagger2example;

import com.pasha.efe.dagger2example.pojos.Repo;

/**
 * Created by efe on 20/01/16.
 */
public class MainPresenterImpl implements MainPresenter, OnUserRepoResponseListener {

    private MainView mainView;
    private MainInteractor mainInteractor;

    public MainPresenterImpl(MainView mainView) {
        this.mainView = mainView;
        this.mainInteractor = new MainInteractorImpl();
    }

    @Override
    public void getUserRepo() {
        mainInteractor.getUserRepo(this);
    }

    @Override
    public void onSuccess(Repo repo) {
        mainView.onSuccess(repo);
    }

    @Override
    public void onFailure() {
        mainView.onFailure();
    }
}
