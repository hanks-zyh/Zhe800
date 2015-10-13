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

package com.hanks.zhe800.ui.adapter;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.hanks.zhe800.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import me.relex.circleindicator.CircleIndicator;

/**
 * Created by hanks on 15-10-11.
 */
public class JinriListAdapter extends RecyclerView.Adapter {

    private static final int TYPE_BANNER = 0x500;
    private static final int TYPE_GRID = 0x501;
    private static final int TYPE_JINRI = 0x502;
    private static final int TYPE_BRAND = 0x503;
    private static final int TYPE_LIST_TITLE = 0x504;
    private static final int TYPE_LIST_ITEM = 0x505;


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        switch (viewType) {
            case TYPE_BANNER:
                return new BannerViewHolder(xmlToView(parent, R.layout.layout_banner));
            case TYPE_GRID:
                return new GridViewHolder(xmlToView(parent, R.layout.layout_guide));
            case TYPE_JINRI:
                return new JinriViewHolder(xmlToView(parent, R.layout.layout_guide));
            case TYPE_BRAND:
                return new BrandViewHolder(xmlToView(parent, R.layout.layout_guide));
            case TYPE_LIST_TITLE:
                return new ListTitleViewHolder(xmlToView(parent, R.layout.layout_guide));
            case TYPE_LIST_ITEM:
                return new ListItemViewHolder(xmlToView(parent, R.layout.layout_guide));

        }
        return null;
    }

    private View xmlToView(ViewGroup parent, int layoutId) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        return layoutInflater.inflate(layoutId, parent, false);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (position == 0) {
            List<String> list = new ArrayList<>();
            list.add("");
            ((BannerViewHolder) holder).setImageList(list);
        }
    }

    @Override
    public int getItemCount() {
        return 0;
    }


    @Override
    public int getItemViewType(int position) {
        switch (position) {
            case 0:
                return TYPE_BANNER;
            case 1:
                return TYPE_GRID;
            case 3:
                return TYPE_JINRI;
            case 4:
                return TYPE_BRAND;
            case 5:
                return TYPE_LIST_TITLE;
            default:
                return TYPE_LIST_ITEM;
        }
    }

    private class BannerViewHolder extends RecyclerView.ViewHolder {

        private final ArrayList<ImageView> imageList;
        private final BannerAdapter adapter;

        public BannerViewHolder(View itemView) {
            super(itemView);
            CircleIndicator customIndicator = (CircleIndicator) itemView.findViewById(R.id.indicator);
            adapter = new BannerAdapter();
            ViewPager viewpager = (ViewPager) itemView.findViewById(R.id.vp_banner);
            viewpager.setAdapter(adapter);
            customIndicator.setViewPager(viewpager);
            imageList = new ArrayList<>();
        }

        private void setImageList(List<String> newList) {
            imageList.clear();
            for (String url : newList) {
                ImageView imageView = new ImageView(itemView.getContext());
                imageView.setTag(url);
                imageList.add(imageView);
            }
            adapter.notifyDataSetChanged();
        }

        private class BannerAdapter extends PagerAdapter {
            @Override
            public int getCount() {
                return imageList.size();
            }

            @Override
            public boolean isViewFromObject(View view, Object object) {
                return view == object;
            }

            @Override
            public Object instantiateItem(ViewGroup container, int position) {
                ImageView imageView = imageList.get(position);
                String url = (String) imageView.getTag();
                if (url != null) {
                    Picasso.with(itemView.getContext()).load(url).into(imageView);
                }
                container.addView(imageView);
                return imageView;
            }

            @Override
            public void destroyItem(ViewGroup container, int position, Object object) {
                container.removeView(imageList.get(position));
            }
        }
    }

    private class GridViewHolder extends RecyclerView.ViewHolder {
        public GridViewHolder(View view) {
            super(view);
        }
    }

    private class JinriViewHolder extends RecyclerView.ViewHolder {
        public JinriViewHolder(View view) {
            super(view);
        }
    }

    private class BrandViewHolder extends RecyclerView.ViewHolder {
        public BrandViewHolder(View view) {
            super(view);
        }
    }

    private class ListTitleViewHolder extends RecyclerView.ViewHolder {
        public ListTitleViewHolder(View view) {
            super(view);
        }
    }

    private class ListItemViewHolder extends RecyclerView.ViewHolder {
        public ListItemViewHolder(View view) {
            super(view);
        }
    }
}
