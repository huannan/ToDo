package com.example.android.architecture.blueprints.todoapp.di.module;

import com.example.android.architecture.blueprints.todoapp.data.source.TasksRepository;
import com.example.android.architecture.blueprints.todoapp.di.ActivityScope;
import com.example.android.architecture.blueprints.todoapp.statistics.StatisticsContract;
import com.example.android.architecture.blueprints.todoapp.statistics.StatisticsPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by johnny on 2017/6/8.
 */
@Module
public class StatisticsPresenterModule {

    @Provides
    @ActivityScope
    StatisticsPresenter provideStatisticsPresenter(TasksRepository tasksRepository, StatisticsContract.View view) {
        return new StatisticsPresenter(tasksRepository, view);
    }
}
