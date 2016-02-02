package com.pasha.efe.dagger2example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.pasha.efe.dagger2example.services.GitHubService;

import javax.inject.Inject;

import retrofit.Retrofit;

public class MainActivity extends AppCompatActivity implements
        View.OnClickListener {

    private Button buttonGetRepo;

    @Inject Retrofit retrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((DaggerApplication) getApplication()).getNetComponent().inject(this);

        buttonGetRepo = (Button) findViewById(R.id.button_get_repo);
        buttonGetRepo.setOnClickListener(this);

        GitHubService gitHubService = retrofit.create(GitHubService.class);

    }

    @Override
    public void onClick(View v) {

    }
}
