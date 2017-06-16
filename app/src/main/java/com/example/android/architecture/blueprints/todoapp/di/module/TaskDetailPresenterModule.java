package com.example.android.architecture.blueprints.todoapp.di.module;

import com.example.android.architecture.blueprints.todoapp.data.source.TasksRepository;
import com.example.android.architecture.blueprints.todoapp.di.ActivityScope;
import com.example.android.architecture.blueprints.todoapp.taskdetail.TaskDetailContract;
import com.example.android.architecture.blueprints.todoapp.taskdetail.TaskDetailPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by johnny on 2017/6/8.
 */
@Module
public class TaskDetailPresenterModule {

    @Provides
    @ActivityScope
    TaskDetailPresenter provideTaskDetailPresenter(TasksRepository tasksRepository, TaskDetailContract.View view, String taskId) {
        return new TaskDetailPresenter(taskId, tasksRepository, view);
    }

}
