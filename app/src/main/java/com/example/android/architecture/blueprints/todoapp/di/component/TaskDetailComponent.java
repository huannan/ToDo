package com.example.android.architecture.blueprints.todoapp.di.component;

import com.example.android.architecture.blueprints.todoapp.di.ActivityScope;
import com.example.android.architecture.blueprints.todoapp.di.module.TaskDetailPresenterModule;
import com.example.android.architecture.blueprints.todoapp.taskdetail.TaskDetailActivity;
import com.example.android.architecture.blueprints.todoapp.taskdetail.TaskDetailContract;

import dagger.BindsInstance;
import dagger.Subcomponent;

/**
 * Created by johnny on 2017/6/8.
 */
@ActivityScope
@Subcomponent(modules = TaskDetailPresenterModule.class)
public interface TaskDetailComponent {

    void inject(TaskDetailActivity activity);

    @Subcomponent.Builder
    interface Builder {
        @BindsInstance
        Builder view(TaskDetailContract.View view);

        @BindsInstance
        Builder taskId(String taskId);

        TaskDetailComponent build();
    }
}
