package com.example.android.architecture.blueprints.todoapp.di.module;

import com.example.android.architecture.blueprints.todoapp.di.component.AddEditTaskComponent;
import com.example.android.architecture.blueprints.todoapp.di.component.StatisticsComponenet;
import com.example.android.architecture.blueprints.todoapp.di.component.TaskDetailComponent;
import com.example.android.architecture.blueprints.todoapp.di.component.TasksComponent;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by johnny on 2017/6/8.
 */
@Module(subcomponents = {AddEditTaskComponent.class, StatisticsComponenet.class,
    TaskDetailComponent.class, TasksComponent.class})
public class AppModule {

    private final Context mContext;

    public AppModule(Context context) {
        mContext = context;
    }

    @Provides
    @Singleton
    Context provideContext() {
        return mContext;
    }
}
