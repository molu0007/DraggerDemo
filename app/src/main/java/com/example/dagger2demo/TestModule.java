package com.example.dagger2demo;

import dagger.Module;
import dagger.Provides;

@Module
public class TestModule {
    IView view;

    public TestModule(IView view) {
        this.view = view;
    }
    @Provides
    public IView provideView(){
        return this.view;
    }
}
