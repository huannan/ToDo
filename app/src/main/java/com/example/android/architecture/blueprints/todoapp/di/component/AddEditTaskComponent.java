package com.example.android.architecture.blueprints.todoapp.di.component;

import com.example.android.architecture.blueprints.todoapp.addedittask.AddEditTaskActivity;
import com.example.android.architecture.blueprints.todoapp.di.ActivityScope;
import com.example.android.architecture.blueprints.todoapp.di.module.AddEditTaskPresenterModule;

import dagger.Subcomponent;

/**
 * Created by johnny on 2017/6/8.
 */
@ActivityScope
@Subcomponent(modules = AddEditTaskPresenterModule.class)
public interface AddEditTaskComponent {

    void inject(AddEditTaskActivity activity);

    @Subcomponent.Builder
    interface Builder {
        Builder addEditTaskPresenterModule(AddEditTaskPresenterModule module);
        AddEditTaskComponent build();
    }
}
