package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

     ImageView iv;
     Button bt;
     boolean flag;
     int images[]={R.drawable.gwagon,
             R.drawable.m5,
             R.drawable.models,
             R.drawable.traktor};
     int i=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        iv = findViewById(R.id.imageView);
        bt = findViewById(R.id.button);
        flag = true;
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv.setImageResource(images[i]);
                i++;
                if (i==4){
                    i=0;
                }
            }
        });




    }
}