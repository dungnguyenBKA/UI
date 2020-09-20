package com.example.ui.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.LayoutInflater;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewbinding.ViewBinding;

public abstract class BaseActivity extends AppCompatActivity {
    public abstract void configView();
    public abstract ViewBinding getViewBinding();
    public abstract void initViewBinding(LayoutInflater inflater);
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initViewBinding(getLayoutInflater());
        setContentView(getViewBinding().getRoot());
        configView();
    }
}
