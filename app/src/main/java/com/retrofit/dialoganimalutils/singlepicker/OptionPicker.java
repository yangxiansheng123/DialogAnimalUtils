package com.retrofit.dialoganimalutils.singlepicker;

import android.app.Activity;

/**
 * 单项文本选择器
 */
public class OptionPicker extends SinglePicker<String> {

    public OptionPicker(Activity activity, String[] items) {
        super(activity, items);
    }


    public void setOnOptionPickListener(OnOptionPickListener listener) {
        super.setOnItemPickListener(listener);
    }

    public void setOnWheelListener(OnWheelListener onWheelListener) {
        super.setOnWheelListener(onWheelListener);
    }

    public interface OnWheelListener extends SinglePicker.OnWheelListener<String> {

    }

    public static abstract class OnOptionPickListener implements OnItemPickListener<String> {

        public abstract void onOptionPicked(int index, String item);

        @Override
        public final void onItemPicked(int index, String item) {
            onOptionPicked(index, item);
        }

    }

}
