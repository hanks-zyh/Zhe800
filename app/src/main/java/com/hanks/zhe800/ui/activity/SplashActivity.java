package com.hanks.zhe800.ui.activity;

import android.os.Bundle;
import android.os.Handler;

import com.hanks.zhe800.R;
import com.hanks.zhe800.constant.Constant;
import com.hanks.zhe800.util.ActivityUtils;
import com.hanks.zhe800.util.SPUtils;

public class SplashActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        setFullscreen();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                launchNewActivity();
            }
        }, 1500);
    }

    private void launchNewActivity() {
        boolean isFirst = (boolean) SPUtils.get(this, Constant.AppConfig.IS_FIRST, true);
        ActivityUtils.goOtherActivityFinish(context, isFirst ? GuideActivity.class : MainActivity.class);
    }


}
