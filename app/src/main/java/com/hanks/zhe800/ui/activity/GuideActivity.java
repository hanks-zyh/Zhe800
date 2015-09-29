package com.hanks.zhe800.ui.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.hanks.zhe800.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hanks on 2015/9/28.
 */

public class GuideActivity extends BaseActivity {

    public List<Fragment> fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        fragments = new ArrayList<>();
        fragments.add(GuideFragment.newInstance(0));
        fragments.add(GuideFragment.newInstance(1));
        fragments.add(GuideFragment.newInstance(2));
        fragments.add(GuideFragment.newInstance(3));
        fragments.add(GuideFragment.newInstance(4));
        fragments.add(GuideFragment.newInstance(5));

        ViewPager vp_guide = (ViewPager) findViewById(R.id.vp_guide);
        vp_guide.setAdapter(new GuideAdapater(getSupportFragmentManager()));
    }


    static class GuideFragment extends Fragment {

        public static Fragment newInstance(int i) {

            Bundle bundle = new Bundle(1);
            bundle.putInt("index",i);

            GuideFragment guideFragment = new GuideFragment();
            guideFragment.setArguments(bundle);
            return guideFragment;
        }
    }

    class GuideAdapater extends FragmentPagerAdapter {

        public GuideAdapater(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }
    }
}
