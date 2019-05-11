package com.aaa.limitedittext;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputFilter;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.editText);
        /**
         *  设置金额输入的过滤器，保证只能输入金额类型 小数点后几位是自己设置的{@link CashierInputFilter.POINTER_LENGTH}
         */
        InputFilter[] filters = {new CashierInputFilter()};
        editText.setFilters(filters);
    }
}
