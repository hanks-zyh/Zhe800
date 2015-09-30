package com.hanks.zhe800.ui.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.hanks.zhe800.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Hanks on 2015/9/28.
 */
public class MainActivity extends BaseActivity {

    @Bind(R.id.vp_main)
    ViewPager vp_main;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initViewPager();
    }

    private void initViewPager() {
//        vp_main.setAdapter();
    }

    public void onTagClick(View view) {
        switch (view.getId()) {
            case R.id.rb_jinri:
                break;
            case R.id.rb_category:
                break;
            case R.id.rb_brand:
                break;
            case R.id.rb_jifen:
                break;
            case R.id.rb_user:
                break;
        }
    }


}
