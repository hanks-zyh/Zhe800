package com.hanks.zhe800.ui.fragment;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hanks.zhe800.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Hanks on 2015/9/30.
 */
public class JinriFragment extends BaseFragment {

    @Bind(R.id.vp_jinri)
    ViewPager vp_jinri;

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
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
