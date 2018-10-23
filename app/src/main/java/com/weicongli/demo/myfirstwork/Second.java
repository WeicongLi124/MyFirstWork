package com.weicongli.demo.myfirstwork;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.weicongli.demo.myfirstwork.data.Info;

/**
 * Created by 李炜聪 on 2016/11/13.
 */

public class Second extends AppCompatActivity {

    private EditText firstname_second;
    private EditText lastname_second;
    private EditText email_second;
    private EditText password_second;
    private EditText retypepassword_second;
    private Button signup_second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        init();
    }


    private void init() {
        firstname_second = (EditText) findViewById(R.id.firstname_second);
        lastname_second = (EditText) findViewById(R.id.lastname_second);
        password_second = (EditText) findViewById(R.id.password_second);
        email_second = (EditText) findViewById(R.id.email_second);
        retypepassword_second = (EditText) findViewById(R.id.retypepassword_second);
        signup_second = (Button) findViewById(R.id.signup_second);


        signup_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.signup_second:
                        Info.USERNAME = firstname_second.getText().toString();
                        Info.PASSWORD = password_second.getText().toString();
                        lastname_second.getText();
                        email_second.getText();
                        retypepassword_second.getText();
                        if (firstname_second.length() == 0 || lastname_second.length() == 0 || password_second.length() == 0 || retypepassword_second.length() == 0 || email_second.length() == 0) {
                            Toast.makeText(Second.this, "Can't have null!", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(Second.this, "Successed!", Toast.LENGTH_SHORT).show();
                            finish();
                        }
                }
            }
        });

    }
}




