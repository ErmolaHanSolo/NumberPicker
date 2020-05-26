[![](https://jitpack.io/v/lany192/NumberPicker.svg)](https://jitpack.io/#lany192/NumberPicker)

# NumberPicker

自定义的NumberPicker，可设置分割线的颜色、粗细，控件的大小、范围，文字的颜色、大小。
![image](https://github.com/lany192/NumberPicker/raw/master/demo.jpg)

## Step 1. Add the JitPack repository to your build file

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

## Step 2. Add the dependency

    dependencies {
            implementation 'com.github.lany192:NumberPicker:latest'
    }
    
## Step 3 XML

    <com.github.lany192.picker.NumberPicker
        android:id="@+id/numberPicker"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center_horizontal"
        app:internalMaxHeight="130dp"
        app:internalMinWidth="150dp"
        app:selectionDivider="@color/dividerColor"
        app:selectionDividerHeight="1px"
        app:selectionDividersDistance="40dp"
        app:selectionTextSize="16sp"
        app:selectionTextColor="@android:color/holo_red_light"
        app:solidColor="@android:color/transparent" />
        
## Step 4 Code

        NumberPicker picker = findViewById(R.id.numberPicker);
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
