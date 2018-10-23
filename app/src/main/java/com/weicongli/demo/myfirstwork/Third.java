package com.weicongli.demo.myfirstwork;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by 李炜聪 on 2016/11/17.
 */

public class Third extends AppCompatActivity {
    private Button exit_third;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);
        init();
    }

    private void init() {
        exit_third = (Button) findViewById(R.id.exit_third);
        exit_third.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
                Toast.makeText(Third.this, "Exit success!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
