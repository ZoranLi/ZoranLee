package com.application.zoranlee.myapplication.framework;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.application.zoranlee.myapplication.R;

/**
 * description：基类
 *
 * @author：ZoranLee create time：17/3/23下午3:32
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentView());
    }

    /**
     * 布局文件
     *
     * @return
     */
    protected int getContentView() {
        return R.layout.activity_base;
    }


}
