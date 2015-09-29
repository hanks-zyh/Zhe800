package com.hanks.zhe800.util;

import android.content.Context;

/**
 * Created by Hanks on 2015/9/29.
 */
public class PixelUtils {
    public static int dp2px(Context context, float dpValue) {
        return (int) (context.getResources().getDisplayMetrics().densityDpi / 160 * dpValue + 0.5f);
    }
}
