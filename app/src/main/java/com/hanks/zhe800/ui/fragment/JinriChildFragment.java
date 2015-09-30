package com.hanks.zhe800.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hanks.zhe800.R;

/**
 * Created by Hanks on 2015/9/30.
 */
public class JinriChildFragment extends BaseFragment {

    public static JinriChildFragment newInstance() {
        JinriChildFragment jinriChildFragment = new JinriChildFragment();
        return jinriChildFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_jinri_child, container, false);
        return view;
    }
}
