package com.pasha.efe.dagger2example;

import android.app.Application;

import com.pasha.efe.dagger2example.di.components.NetComponent;
import com.pasha.efe.dagger2example.di.modules.AppModule;
import com.pasha.efe.dagger2example.di.modules.NetModule;

/**
 * Created by efe on 30/12/15.
 */
public class DaggerApplication extends Application {

    private NetComponent netComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        netComponent = com.pasha.efe.dagger2example.components.DaggerNetComponent.builder()
                // list of modules that are part of this component need to be created here too
                .appModule(new AppModule(this))
                .netModule(new NetModule("https://api.github.com"))
                .build();

    }

    public NetComponent getNetComponent(){
        return netComponent;
    }
}
