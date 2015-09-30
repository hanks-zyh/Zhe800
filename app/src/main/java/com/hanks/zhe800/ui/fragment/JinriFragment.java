package com.hanks.zhe800.ui.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hanks.zhe800.R;
import com.hanks.zhe800.ui.adapter.JinriPageAdapter;
import com.hanks.zhe800.ui.view.tabs.SlidingTabLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.BindColor;
import butterknife.ButterKnife;

/**
 * Created by Hanks on 2015/9/30.
 */
public class JinriFragment extends BaseFragment {

    @Bind(R.id.vp_jinri)
    ViewPager vp_jinri;
    @Bind(R.id.tabs)
    SlidingTabLayout tabs;


    @BindColor(R.color.app_red)
    int app_red;

    private List<Fragment> fragmentList = new ArrayList<>();
    private JinriPageAdapter adapter;

    public static JinriFragment newInstance() {
        JinriFragment jinriFragment = new JinriFragment();
        return jinriFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_jinri, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        initViewPager();
    }

    private void initViewPager() {
        fragmentList.add(JinriChildFragment.newInstance());
        fragmentList.add(JinriChildFragment.newInstance());
        fragmentList.add(JinriChildFragment.newInstance());
        fragmentList.add(JinriChildFragment.newInstance());
        fragmentList.add(JinriChildFragment.newInstance());
        fragmentList.add(JinriChildFragment.newInstance());
        fragmentList.add(JinriChildFragment.newInstance());
        fragmentList.add(JinriChildFragment.newInstance());
        adapter = new JinriPageAdapter(fragmentList, getFragmentManager());
        vp_jinri.setAdapter(adapter);
        initSlidingTabLayout();
    }

    private void initSlidingTabLayout() {
        tabs = (SlidingTabLayout) getView().findViewById(R.id.tabs);
        tabs.setCustomTabView(R.layout.custom_tab, 0);        // Set custom tab layout
        // mTabs.setDistributeEvenly(true);  // Center the tabs in the layout
        tabs.setSelectedIndicatorColors(app_red);    // Customize tab color
        tabs.setViewPager(vp_jinri);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
