package com.example.android.architecture.blueprints.todoapp;

import com.example.android.architecture.blueprints.todoapp.di.component.AppComponent;
import com.example.android.architecture.blueprints.todoapp.di.component.DaggerAppComponent;
import com.example.android.architecture.blueprints.todoapp.di.module.AppModule;
import com.example.android.architecture.blueprints.todoapp.di.module.TasksRepositoryModule;

import android.app.Application;

/**
 * Created by johnny on 2017/6/8.
 */

public class ToDoApplication extends Application {

    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mAppComponent = DaggerAppComponent.builder()
            .appModule(new AppModule(this))
            .tasksRepositoryModule(new TasksRepositoryModule())
            .build();
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}
