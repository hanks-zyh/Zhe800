package com.hanks.zhe800.ui.adapter;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Hanks on 2015/9/30.
 */
public class JinriPageAdapter extends FragmentPagerAdapter {

    private List<Fragment> fragmentList;

    public JinriPageAdapter(List<Fragment> list, FragmentManager fm) {
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
 private String tabs[] = new String[] {"全部", "数码家电", "美妆配饰", "可口美食", "中老年", "文娱运动" , "儿童天地", "文娱运动" , "儿童天地", "文娱运动" , "儿童天地"};
    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }
}
