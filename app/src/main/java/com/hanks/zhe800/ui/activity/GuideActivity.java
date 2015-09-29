package com.hanks.zhe800.ui.activity;

import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.hanks.zhe800.R;
import com.hanks.zhe800.util.ActivityUtils;

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

    private int mCurrentIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        setFullscreen();
        views = new ArrayList<>();
        ViewGroup rootView = (ViewGroup) getWindow().findViewById(android.R.id.content);
        for (int i = 0; i < imageId.length; i++) {
            View view = LayoutInflater.from(this).inflate(R.layout.layout_guide, rootView, false);
            ImageView iv_cover = (ImageView) view.findViewById(R.id.iv_cover);
            iv_cover.setImageResource(imageId[i]);
            iv_cover.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ImageView iv_click = (ImageView) view.findViewById(R.id.iv_click);
            iv_click.setVisibility(i == imageId.length - 1 ? View.VISIBLE : View.GONE);
            views.add(view);
        }

        final ImageView iv_indicator = (ImageView) findViewById(R.id.iv_indicator);
        ViewPager vp_guide = (ViewPager) findViewById(R.id.vp_guide);
        vp_guide.setAdapter(new GuideAdapter());
        vp_guide.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) iv_indicator.getLayoutParams();
                //4 -> 20 -> 36 -> 52 -> 68
                int viewSpace = dp2px(16);
                if (mCurrentIndex == 0 && position == 0) { // 0->1
                    layoutParams.leftMargin = (int) (dp2px(4) + positionOffset * viewSpace);
                } else if (mCurrentIndex == 1 && position == 0) { // 1 -> 0
                    layoutParams.leftMargin = (int) (dp2px(20) + (positionOffset - 1) * viewSpace);
                } else if (mCurrentIndex == 1 && position == 1) { // 0->1
                    layoutParams.leftMargin = (int) (dp2px(20) + positionOffset * viewSpace);
                } else if (mCurrentIndex == 2 && position == 1) { // 1 -> 0
                    layoutParams.leftMargin = (int) (dp2px(36) + (positionOffset - 1) * viewSpace);
                } else if (mCurrentIndex == 2 && position == 2) { // 0->1
                    layoutParams.leftMargin = (int) (dp2px(36) + positionOffset * viewSpace);
                } else if (mCurrentIndex == 3 && position == 2) { // 1 -> 0
                    layoutParams.leftMargin = (int) (dp2px(52) + (positionOffset - 1) * viewSpace);
                } else if (mCurrentIndex == 3 && position == 3) { // 0->1
                    layoutParams.leftMargin = (int) (dp2px(52) + positionOffset * viewSpace);
                } else if (mCurrentIndex == 4 && position == 3) { // 1 -> 0
                    layoutParams.leftMargin = (int) (dp2px(68) + (positionOffset - 1) * viewSpace);
                } else if (mCurrentIndex == 4 && position == 4) { // 0->1
                    layoutParams.leftMargin = (int) (dp2px(68) + positionOffset * viewSpace);
                } else if (mCurrentIndex == 5 && position == 4) { // 1 -> 0
                    layoutParams.leftMargin = (int) (dp2px(84.5f) + (positionOffset - 1) * viewSpace);
                }

                iv_indicator.setLayoutParams(layoutParams);
            }

            @Override
            public void onPageSelected(int position) {
                mCurrentIndex = position;
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    public int dp2px(float dpVaule) {
        final float scale = getResources().getDisplayMetrics().densityDpi;
        return (int) (dpVaule * (scale / 160));
    }

    public void finishGuide(View view){

        ActivityUtils.goOtherActivityFinish(context,ChooseRoleActivity.class);
    }

    class GuideAdapter extends PagerAdapter {

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
