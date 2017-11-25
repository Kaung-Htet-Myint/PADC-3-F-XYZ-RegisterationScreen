package com.padcmyanmar.hello_android_padc;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.padcmyanmar.hello_android_padc.R;

/**
 * Created by User on 10/30/2017.
 */

public class My_Activity_1 extends AppCompatActivity{

    Button btn = findViewById(R.id.button);
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_activity_1);

    }

    public void onActionClick(View view) {
        btn.setText("Get Click Action");
    }



}
