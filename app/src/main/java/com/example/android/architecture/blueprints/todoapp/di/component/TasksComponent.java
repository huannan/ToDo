package com.example.android.architecture.blueprints.todoapp.di.component;

import com.example.android.architecture.blueprints.todoapp.di.ActivityScope;
import com.example.android.architecture.blueprints.todoapp.di.module.TasksPresenterModule;
import com.example.android.architecture.blueprints.todoapp.tasks.TasksActivity;
import com.example.android.architecture.blueprints.todoapp.tasks.TasksContract;

import dagger.BindsInstance;
import dagger.Subcomponent;

/**
 * Created by johnny on 2017/6/8.
 */
@ActivityScope
@Subcomponent(modules = TasksPresenterModule.class)
public interface TasksComponent {

    void inject(TasksActivity activity);

    @Subcomponent.Builder
    interface Builder  {
        @BindsInstance
        Builder view(TasksContract.View view);

        TasksComponent build();
    }
}
