package com.example.android.architecture.blueprints.todoapp.di;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by johnny on 2017/6/8.
 */
@Documented
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface Local {}
