package com.example.android.architecture.blueprints.todoapp.di.component;

import com.example.android.architecture.blueprints.todoapp.di.ActivityScope;
import com.example.android.architecture.blueprints.todoapp.di.module.StatisticsPresenterModule;
import com.example.android.architecture.blueprints.todoapp.statistics.StatisticsActivity;

import dagger.Subcomponent;

/**
 * Created by johnny on 2017/6/8.
 */
@ActivityScope
@Subcomponent(modules = StatisticsPresenterModule.class)
public interface StatisticsComponenet {

    void inject(StatisticsActivity activity);

    @Subcomponent.Builder
    interface Builder {
        Builder statisticsPresenterModule(StatisticsPresenterModule module);
        StatisticsComponenet build();
    }
}
