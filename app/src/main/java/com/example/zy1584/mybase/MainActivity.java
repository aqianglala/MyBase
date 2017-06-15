package com.example.zy1584.mybase;

import com.example.zy1584.mybase.base.BaseActivity;
import com.example.zy1584.mybase.base.BasePresenter;

public class MainActivity extends BaseActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected BasePresenter loadPresenter() {
        return null;
    }

}
