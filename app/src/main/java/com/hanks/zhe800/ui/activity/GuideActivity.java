package com.hanks.zhe800.ui.activity;

import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.hanks.zhe800.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hanks on 2015/9/28.
 */

public class GuideActivity extends BaseActivity {

    public List<View> views;

    private int[] imageId = new int[]{
            R.drawable.bg_formguide_new_0,
            R.drawable.bg_formguide_new_1,
            R.drawable.bg_formguide_new_2,
            R.drawable.bg_formguide_new_3,
            R.drawable.bg_formguide_new_4,
            R.drawable.bg_formguide_new_5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        setFullscreen();
        views = new ArrayList<>();
        for (int i = 0; i < imageId.length; i++) {
            View view = LayoutInflater.from(this).inflate(R.layout.layout_guide, (ViewGroup) getWindow().findViewById(android.R.id.content), false);
            ImageView iv_cover = (ImageView) view.findViewById(R.id.iv_cover);
            iv_cover.setImageResource(imageId[i]);
            iv_cover.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ImageView iv_click = (ImageView) view.findViewById(R.id.iv_click);
            iv_click.setVisibility(i == imageId.length - 1 ? View.VISIBLE : View.GONE);
            views.add(view);
        }

        ViewPager vp_guide = (ViewPager) findViewById(R.id.vp_guide);
        vp_guide.setAdapter(new GuideAdapater());
    }


    class GuideAdapater extends PagerAdapter {

        @Override
        public int getCount() {
            return views.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            View view = views.get(position);
            container.addView(view);
            return view;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            View view = views.get(position);
            container.removeView(view);
        }
    }
}
