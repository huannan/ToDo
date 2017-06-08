package com.example.android.architecture.blueprints.todoapp.di.component;

import com.example.android.architecture.blueprints.todoapp.data.source.TasksRepository;
import com.example.android.architecture.blueprints.todoapp.di.module.AppModule;
import com.example.android.architecture.blueprints.todoapp.di.module.TasksRepositoryModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by johnny on 2017/6/8.
 */
@Singleton
@Component(modules = {AppModule.class, TasksRepositoryModule.class})
public interface AppComponent {

    TasksRepository tasksRespository();

    AddEditTaskComponent.Builder addEditTaskComponent();

    StatisticsComponenet.Builder statisticsComponenet();

    TaskDetailComponent.Builder taskDetailComponent();

    TasksComponent.Builder tasksComponent();
}
