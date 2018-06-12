package com.retrofit.dialoganimalutils;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.retrofit.dialoganimalutils.singlepicker.OptionPicker;
import com.retrofit.dialoganimalutils.singlepicker.WheelView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    protected TextView actionText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);

        initView();
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.action_text) {

            OptionPicker picker = new OptionPicker(this, new String[]{"支出", "收入"});
            picker.setCanceledOnTouchOutside(false);
            picker.setDividerRatio(WheelView.DividerConfig.FILL);
            picker.setShadowColor(Color.WHITE, 40);
            picker.setSelectedIndex(0);
            picker.setCycleDisable(true);
            picker.setCancelTextSize(16);
            picker.setTopLineColor(Color.parseColor("#F4F4F4"));
            picker.setTopBackgroundColor(Color.parseColor("#fbd415"));
            picker.setCancelTextColor(Color.BLACK);
            picker.setSubmitTextSize(16);
            picker.setSubmitTextColor(Color.BLACK);
            picker.setTextColor(Color.BLACK);
            picker.setDividerColor(Color.parseColor("#F4F4F4"));
            picker.setTextSize(16);
            picker.setOffset(2);
            picker.setAnimationStyle(R.style.AnimationPicker);
            picker.setLineSpaceMultiplier(3.2f);
            picker.setUseWeight(true);
            picker.setOnOptionPickListener(new OptionPicker.OnOptionPickListener() {
                @Override
                public void onOptionPicked(int index, String item) {

                }
            });
            picker.show();
        }
    }

    private void initView() {
        actionText = (TextView) findViewById(R.id.action_text);
        actionText.setOnClickListener(MainActivity.this);
    }
}
