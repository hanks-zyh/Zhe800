package com.hanks.zhe800.ui.adapter;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Hanks on 2015/9/30.
 */
public class MainPageAdapter extends FragmentPagerAdapter {

    private List<Fragment> fragmentList;

    public MainPageAdapter(List<Fragment> list, FragmentManager fm) {
        super(fm);
        fragmentList = list;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}
