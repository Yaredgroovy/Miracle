package com.letion.miracle.mvp.model;

import android.app.Application;

import com.google.gson.Gson;
import com.letion.geetionlib.base.integration.IRepositoryManager;
import com.letion.geetionlib.di.scope.ActivityScope;
import com.letion.geetionlib.mvp.BaseModel;
import com.letion.miracle.mvp.contract.MainContract;

import javax.inject.Inject;


@ActivityScope
public class MainModel extends BaseModel implements MainContract.Model {
    private Gson mGson;
    private Application mApplication;

    @Inject
    public MainModel(IRepositoryManager repositoryManager, Gson gson, Application application) {
        super(repositoryManager);
        this.mGson = gson;
        this.mApplication = application;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mGson = null;
        this.mApplication = null;
    }

}