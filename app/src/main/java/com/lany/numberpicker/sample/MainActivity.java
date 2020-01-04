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
        numberPicker1();
        numberPicker2();
        numberPicker3();
    }

    private void numberPicker1() {
        NumberPicker numberPicker = findViewById(R.id.numberPicker);
        //不可编辑
        numberPicker.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);
        List<String> values = new ArrayList<>();
        for (int i = 0; i < 99; i++) {
            values.add("测试" + i);
        }
        numberPicker.setValues(values);
        numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {

            @Override
            public void onValueChange(NumberPicker picker, int oldValue, int newValue) {

            }
        });
    }

    private void numberPicker2() {
        NumberPicker numberPicker = findViewById(R.id.numberPicker2);
        //不可编辑
        numberPicker.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);
        List<String> values = new ArrayList<>();
        for (int i = 0; i < 99; i++) {
            values.add("测试" + i);
        }
        numberPicker.setValues(values);
        numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {

            @Override
            public void onValueChange(NumberPicker picker, int oldValue, int newValue) {

            }
        });
    }

    private void numberPicker3() {
        NumberPicker numberPicker = findViewById(R.id.numberPicker3);
        //不可编辑
        numberPicker.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);
        List<String> values = new ArrayList<>();
        for (int i = 0; i < 99; i++) {
            values.add("测试" + i);
        }
        numberPicker.setValues(values);
        numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {

            @Override
            public void onValueChange(NumberPicker picker, int oldValue, int newValue) {

            }
        });
    }

}
