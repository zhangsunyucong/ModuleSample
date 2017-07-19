package com.yucong.zhang.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.yucong.zhang.baselibrary.router.ActivityRouter;
import com.yucong.zhang.modulea.ASecondMainActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // AMainActivity
        ActivityRouter.startActivity(this, ASecondMainActivity.class);
    }
}
