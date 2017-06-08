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

    private final TaskDetailContract.View mView;

    private final String mTaskId;

    public TaskDetailPresenterModule(TaskDetailContract.View view, String taskId) {
        mView = view;
        mTaskId = taskId;
    }

    @Provides
    @ActivityScope
    TaskDetailPresenter provideTaskDetailPresenter(TasksRepository tasksRepository) {
        return new TaskDetailPresenter(mTaskId, tasksRepository, mView);
    }

}
