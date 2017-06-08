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

    private final StatisticsContract.View mView;

    public StatisticsPresenterModule(StatisticsContract.View view) {
        mView = view;
    }

    @Provides
    @ActivityScope
    StatisticsPresenter provideStatisticsPresenter(TasksRepository tasksRepository) {
        return new StatisticsPresenter(tasksRepository, mView);
    }
}
