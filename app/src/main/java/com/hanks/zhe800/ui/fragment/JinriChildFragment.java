/*
 * Copyright 2015 Hanks All rights reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *      http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hanks.zhe800.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hanks.zhe800.R;
import com.hanks.zhe800.ui.adapter.JinriListAdapter;

import butterknife.Bind;

/**
 * Created by Hanks on 2015/9/30.
 */
public class JinriChildFragment extends BaseFragment {

    @Bind(R.id.rv)
    private RecyclerView rv;
    @Bind(R.id.refresh_layout)
    private SwipeRefreshLayout refresh_layout;


    private JinriListAdapter adapter;


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

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        rv.setLayoutManager(new LinearLayoutManager(view.getContext()));

        adapter = new JinriListAdapter();
        rv.setAdapter(adapter);
    }
}
