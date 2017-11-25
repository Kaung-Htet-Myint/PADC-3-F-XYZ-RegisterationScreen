package com.padcmyanmar.hello_android_padc;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.support.design.widget.Snackbar;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by User on 11/5/2017.
 */

public class LoginActivity extends AppCompatActivity {

    public static Intent newIntent1(Context context){

        Intent intent = new Intent(context,LoginActivity.class);
        return intent;

    }

    private static final String CORRECT_EMAIL = "abc@gmail.com";
    private static final String CORRECT_PASSWORD = "1234";


    private Button btnLogIn;
    private EditText etEmailOrPhone;
    private EditText etPassword;
    private TextView btnforgotPassword;
    private TextView btnNewSeller;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogIn = findViewById(R.id.btn_login);
        etEmailOrPhone = findViewById(R.id.et_email_or_phone);
        etPassword = findViewById(R.id.et_password );
        btnforgotPassword = findViewById(R.id.btn_forget_password);
        btnNewSeller = findViewById(R.id.btn_new_seller);

        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String emailOrPhone = etEmailOrPhone.getText().toString();
                String password = etPassword.getText().toString();

                if(TextUtils.isEmpty(emailOrPhone)){
                    etEmailOrPhone.setError("Email or Phone cannot be empty.");
                    return;
                }
                if(TextUtils.isEmpty(password)){
                    etPassword.setError("Password cannot be empty.");
                    return;
                }

                if(TextUtils.equals(emailOrPhone, CORRECT_EMAIL) && TextUtils.equals(password, CORRECT_PASSWORD)){

                    Intent intent = HelloAndroidActivity.newIntent(getApplicationContext());
                    startActivity(intent);

                    Toast.makeText(getApplicationContext(), "Login Sucess", Toast.LENGTH_LONG)
                            .show();

                }else {
                    Snackbar.make(v, "Incorrect email or password.Pleasea try again.",Snackbar.LENGTH_INDEFINITE)
                            .show();
                }

                //   Snackbar.make(v, "Login Button is Clicked", Snackbar.LENGTH_INDEFINITE)
                //           .setAction("Action", null).show();

            }
        });

        btnforgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Forgot Password is comming" ,Snackbar.LENGTH_INDEFINITE).show();
            }
        });


        btnNewSeller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Snackbar.make(v, "Registeration screen is comming." ,Snackbar.LENGTH_INDEFINITE).show();

                Intent intent = RegisterActivity.newIntent2(getApplicationContext());
                startActivity(intent);
            }
        });
    }


}
