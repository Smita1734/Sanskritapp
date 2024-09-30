package com.example.sankrit_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private Class<?> gridlayout;

    public MainActivity(Class<?> gridlayout) {
        this.gridlayout = gridlayout;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View view) {

                Intent intent= new Intent(MainActivity.this,gridlayout);
                startActivity(intent);
            }
        });

    }

}