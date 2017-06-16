package com.example.android.architecture.blueprints.todoapp.di.module;

import com.example.android.architecture.blueprints.todoapp.data.source.TasksRepository;
import com.example.android.architecture.blueprints.todoapp.di.ActivityScope;
import com.example.android.architecture.blueprints.todoapp.tasks.TasksContract;
import com.example.android.architecture.blueprints.todoapp.tasks.TasksPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by johnny on 2017/6/8.
 */
@Module
public class TasksPresenterModule {

    @Provides
    @ActivityScope
    TasksPresenter provideTasksPresenter(TasksRepository tasksRepository, TasksContract.View view) {
        return new TasksPresenter(tasksRepository, view);
    }
}
