package com.lany.numberpicker.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.lany.numberpicker.NumberPicker;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private NumberPicker picker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        picker = findViewById(R.id.numberPicker);
        //不可编辑
        picker.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);
        List<String> values = new ArrayList<>();
        for (int i = 0; i < 99; i++) {
            values.add("测试" + i);
        }
        picker.setShowValues(values);
        picker.setMaxValue(values.size() - 1);
        picker.setMinValue(0);

        picker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {

            @Override
            public void onValueChange(NumberPicker picker, int oldValue, int newValue) {

            }
        });
    }
}
