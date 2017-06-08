package com.example.android.architecture.blueprints.todoapp.di.module;

import com.example.android.architecture.blueprints.todoapp.addedittask.AddEditTaskContract;
import com.example.android.architecture.blueprints.todoapp.addedittask.AddEditTaskPresenter;
import com.example.android.architecture.blueprints.todoapp.data.source.TasksRepository;
import com.example.android.architecture.blueprints.todoapp.di.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by johnny on 2017/6/8.
 */
@Module
public class AddEditTaskPresenterModule {

    private String mTaskId;

    private AddEditTaskContract.View mView;

    private boolean mIsDataMissing;

    public AddEditTaskPresenterModule(String taskId,
        AddEditTaskContract.View view, boolean isDataMissing) {
        mTaskId = taskId;
        mView = view;
        mIsDataMissing = isDataMissing;
    }

    @Provides
    @ActivityScope
    AddEditTaskPresenter provideAddEditTaskPresenter(TasksRepository tasksRepository) {
        return new AddEditTaskPresenter(mTaskId, tasksRepository, mView, mIsDataMissing);
    }
}
