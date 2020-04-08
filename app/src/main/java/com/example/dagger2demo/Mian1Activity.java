package com.example.dagger2demo;

import android.os.Bundle;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Mian1Activity extends AppCompatActivity implements IView
{
    @Inject
    TestPresent testPresent;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerTestComponent.builder().testModule(new TestModule(this)).build().inject(this);
        testPresent.updateUI();


    }


    @Override
    public void UpdateUI(String s) {
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show();
    }
}
