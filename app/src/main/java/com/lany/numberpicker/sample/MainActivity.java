package com.lany.numberpicker.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.lany.numberpicker.NumberPicker;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NumberPicker picker = findViewById(R.id.numberPicker);
        //不可编辑
        picker.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);
        List<String> values = new ArrayList<>();
        for (int i = 0; i < 99; i++) {
            values.add("测试" + i);
        }
        picker.setValues(values);
        picker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {

            @Override
            public void onValueChange(NumberPicker picker, int oldValue, int newValue) {

            }
        });
    }
}
