package com.hanks.zhe800.ui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;

import com.hanks.zhe800.R;
import com.hanks.zhe800.constant.Constant;
import com.hanks.zhe800.util.ActivityUtils;
import com.hanks.zhe800.util.SPUtils;

/**
 * Created by Hanks on 2015/9/29.
 */
public class ChooseRoleActivity extends BaseActivity {

    private ImageButton ib_girl;
    private ImageButton ib_lama;
    private ImageButton ib_boy;
    private CheckBox cb_student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_role);
        bindViews();
        bindListeners();
    }

    private void bindListeners() {
        ChooseRoleClickListener clickListener = new ChooseRoleClickListener();
        ib_boy.setOnClickListener(clickListener);
        ib_lama.setOnClickListener(clickListener);
        ib_girl.setOnClickListener(clickListener);
        ib_girl.setSelected(true);
    }

    // End Of Content View Elements

    private void bindViews() {
        ib_girl = (ImageButton) findViewById(R.id.ib_girl);
        ib_lama = (ImageButton) findViewById(R.id.ib_lama);
        ib_boy = (ImageButton) findViewById(R.id.ib_boy);
        cb_student = (CheckBox) findViewById(R.id.cb_student);
    }

    public void finishChoose(View view) {
        SPUtils.put(context, Constant.AppConfig.IS_FIRST, false);
        ActivityUtils.goOtherActivityFinish(context, MainActivity.class);
    }

    class ChooseRoleClickListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            int selectId = 0;
            switch (view.getId()) {
                case R.id.ib_girl:
                    selectId = 0;
                    break;
                case R.id.ib_lama:
                    selectId = 1;
                    break;
                case R.id.ib_boy:
                    selectId = 2;
                    break;
            }
            ib_girl.setSelected(selectId == 0);
            ib_lama.setSelected(selectId == 1);
            ib_boy.setSelected(selectId == 2);
            cb_student.setVisibility(selectId == 0 || selectId == 2 ? View.VISIBLE : View.INVISIBLE);
            if (selectId == 1) cb_student.setChecked(false);
        }
    }
}
