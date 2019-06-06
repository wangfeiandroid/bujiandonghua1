package com.example.administrator.bujiandonghua;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class zhuceActivity extends AppCompatActivity {
    private Button zhucequeren,quxiao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhuce);
        quxiao = findViewById(R.id.buttonzhuce1);
        zhucequeren = findViewById(R.id.buttonzhuce2);
        quxiao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(zhuceActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        zhucequeren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(zhuceActivity.this,"注册成功",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(zhuceActivity.this,shouyeActivity.class);
                startActivity(intent);
            }
        });
    }
}
