package com.padcmyanmar.hello_android_padc;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by User on 11/13/2017.
 */

public class RegisterActivity extends AppCompatActivity{

    public static Intent newIntent2 (Context context){
        Intent intent = new Intent(context,RegisterActivity.class);
        return intent;
    }

    private static final String CORRECT_EMAIL = "abcd@gmail.com";
    private static final String CORRECT_PASSWORD = "1234";

    private TextView btnToLogin;
    private EditText etName;
    private EditText etPhoneNo;
    private EditText etAddress;
    private CheckBox cbAtHome;
    private EditText etEmail;
    private EditText etPassword;
    private EditText etConfirmPassword;
    private TextView tvGender;
    private RadioGroup rgGender;
    private RadioButton rbMale;
    private RadioButton rbFemale;
    private Button btnRegister;
    private RelativeLayout rl;

    String name;
    String phoneNo;
    String address;
    String email;
    String password;
    String confirmPassword;
    Context ctx;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btnToLogin = findViewById(R.id.btn_to_login);
        etName = findViewById(R.id.et_name);
        etPhoneNo = findViewById(R.id.et_phone_no);
        etAddress = findViewById(R.id.et_address);
        cbAtHome = findViewById(R.id.cb_at_home);
        etEmail = findViewById(R.id.et_email);
        etPassword = findViewById(R.id.et_password);
        etConfirmPassword = findViewById(R.id.et_confirm_password);
        tvGender = findViewById(R.id.tv_gender);
        rgGender = findViewById(R.id.rg_gender);
        rbMale = findViewById(R.id.rb_gender_male);
        rbFemale = findViewById(R.id.rb_gender_female);
        btnRegister = findViewById(R.id.btn_register);
        rl = findViewById(R.id.rl_main);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 name = etName.getText().toString();
                 phoneNo = etPhoneNo.getText().toString();
                 address = etAddress.getText().toString();
                 email = etEmail.getText().toString();
                 password = etPassword.getText().toString();
                 confirmPassword = etConfirmPassword.getText().toString();

                if(TextUtils.isEmpty(name)){
                    etName.setError("Name cannot be empty.");
                    return;
                }

                if(TextUtils.isEmpty(phoneNo)){
                    etPhoneNo.setError("Phone number cannot be empty.");
                    return;
                }

                if(TextUtils.isEmpty(address)){
                    etAddress.setError("Address cannot be empty.");
                    return;
                }

                if(TextUtils.isEmpty(email)){
                    etEmail.setError("Email cannot be empty.");
                    return;
                }

                if(TextUtils.isEmpty(password)){
                    etPassword.setError("Password cannot be empty.");
                    return;
                }

                if(TextUtils.isEmpty(confirmPassword)){
                    etConfirmPassword.setError("Confirm password cannot be empty.");
                    return;
                }

            /*    if(TextUtils.equals(email,CORRECT_EMAIL) && TextUtils.equals(password,
                                        CORRECT_PASSWORD) && TextUtils.equals(confirmPassword, password)){



                    Toast.makeText(getApplicationContext(), "Registeration Sucess" ,
                                        Toast.LENGTH_LONG).show();
                }

                else{
                    Snackbar.make(v,"Incorrect Email or Password",
                                            Snackbar.LENGTH_INDEFINITE).show();
                }       */
                Intent intent = LoginActivity.newIntent1(getApplicationContext());
                startActivity(intent);
            }
        });

        btnToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = LoginActivity.newIntent1(getApplicationContext());
                startActivity(intent);
            }
        });
    }

}

