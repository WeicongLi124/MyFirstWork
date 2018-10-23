package com.weicongli.demo.myfirstwork;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.weicongli.demo.myfirstwork.data.Info;


public class MainActivity extends AppCompatActivity {
    private EditText username;
    private EditText password;
    private Button login_btn_mainactivity;
    private Button register_btn_mainactivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }


    private void init() {       //组件模块
        login_btn_mainactivity = (Button) findViewById(R.id.login_btn_mainactivity);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        register_btn_mainactivity = (Button) findViewById(R.id.register_btn_mainactivity);
        register_btn_mainactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Second.class);
                startActivity(intent);
            }
        });
        login_btn_mainactivity.setOnClickListener(new View.OnClickListener() {   //登录按钮
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.login_btn_mainactivity:
                        String user = username.getText().toString();
                        String pass = password.getText().toString();
                        if (!user.equals(Info.USERNAME)) {
                            Toast.makeText(MainActivity.this, "User name isn't exist!", Toast.LENGTH_SHORT).show();

                        } else if (user.equals(Info.USERNAME) && !pass.equals(Info.PASSWORD)) {

                            Toast.makeText(MainActivity.this, "Password isn't true!", Toast.LENGTH_SHORT).show();

                        } else if (!user.equals(null) || !pass.equals(null)) {

                            Toast.makeText(MainActivity.this, "User name and Password can't null!", Toast.LENGTH_SHORT).show();

                        } else if (user.equals(Info.USERNAME) && pass.equals(Info.PASSWORD)) {
                            Toast.makeText(MainActivity.this, "Login success!", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(MainActivity.this, Third.class);
                            startActivity(intent);
                        }
                }
            }
        });
    }

    ;
}

