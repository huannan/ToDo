package com.example.android.architecture.blueprints.todoapp.di.component;

import com.example.android.architecture.blueprints.todoapp.di.ActivityScope;
import com.example.android.architecture.blueprints.todoapp.di.module.TaskDetailPresenterModule;
import com.example.android.architecture.blueprints.todoapp.taskdetail.TaskDetailActivity;

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
        Builder taskDetailPresenterModule(TaskDetailPresenterModule module);
        TaskDetailComponent build();
    }
}
