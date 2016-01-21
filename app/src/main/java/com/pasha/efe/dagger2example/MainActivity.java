package com.pasha.efe.dagger2example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.pasha.efe.dagger2example.pojos.Repo;

public class MainActivity extends AppCompatActivity implements
        View.OnClickListener,
        MainView {

    private Button buttonGetRepo;

    private MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((DaggerApplication) getApplication()).getNetComponent().inject(this);

        buttonGetRepo = (Button) findViewById(R.id.button_get_repo);
        buttonGetRepo.setOnClickListener(this);

        mainPresenter = new MainPresenterImpl(this);

    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onSuccess(Repo repo) {

    }

    @Override
    public void onFailure() {

    }
}
