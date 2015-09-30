package com.hanks.zhe800.ui.activity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import com.hanks.zhe800.R;
import com.hanks.zhe800.ui.fragment.JinriFragment;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Hanks on 2015/9/28.
 */
public class MainActivity extends BaseActivity {

    @Bind(R.id.fm_main)
    FrameLayout fm_main;
    private FragmentManager fragmentManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.fm_main, JinriFragment.newInstance());
        transaction.commit();

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
