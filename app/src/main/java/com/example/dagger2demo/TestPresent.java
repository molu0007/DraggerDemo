package com.example.dagger2demo;

import javax.inject.Inject;

public class TestPresent {
    IView iView;
    @Inject
    public TestPresent(IView iView) {
        this.iView = iView;
    }

    public void updateUI(){
        iView.UpdateUI("ddd");
    }

}
