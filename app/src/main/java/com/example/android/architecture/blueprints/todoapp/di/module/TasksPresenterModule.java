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

    private final TasksContract.View mView;

    public TasksPresenterModule(TasksContract.View view) {
        mView = view;
    }

    @Provides
    @ActivityScope
    TasksPresenter provideTasksPresenter(TasksRepository tasksRepository) {
        return new TasksPresenter(tasksRepository, mView);
    }
}
