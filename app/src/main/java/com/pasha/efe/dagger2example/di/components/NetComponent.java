package com.pasha.efe.dagger2example.di.components;

import com.pasha.efe.dagger2example.GetRepoDetailIntentService;
import com.pasha.efe.dagger2example.MainActivity;
import com.pasha.efe.dagger2example.di.modules.AppModule;
import com.pasha.efe.dagger2example.di.modules.NetModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by efe on 30/12/15.
 */
@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface NetComponent {
    void inject(MainActivity activity);
    void inject(GetRepoDetailIntentService getRepoDetailIntentService);
    // void inject(MyFragment fragment);
    // void inject(MyService service);

}
