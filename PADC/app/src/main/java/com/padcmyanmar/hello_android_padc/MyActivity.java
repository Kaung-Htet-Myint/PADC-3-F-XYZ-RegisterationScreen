package com.padcmyanmar.hello_android_padc;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by User on 10/30/2017.
 */

public class MyActivity extends AppCompatActivity {

    Button b1;
    TextView t1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myactivity);
        b1 = findViewById(R.id.btnSave);
        t1 = findViewById(R.id.txtName);
    }



/*
    public void onClickSave(View v){
        b1.setText("Button is Clicked");
        t1.setText("Me also Cliked");
    }

*/



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }



}
