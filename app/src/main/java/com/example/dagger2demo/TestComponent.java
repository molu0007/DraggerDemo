package com.example.dagger2demo;

import dagger.Component;

@Component(modules = TestModule.class)
public interface TestComponent {
    void  inject(Mian1Activity mian1Activity);
}
