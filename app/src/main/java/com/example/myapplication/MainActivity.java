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


     Button btn_show,btn_hide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        //ZNIKANIE I POKAZYWANIE ZDJĘCIA
        iv = (ImageView)findViewById(R.id.imageView);
        btn_hide = (Button)findViewById(R.id.nZdjecie);
        btn_show = (Button)findViewById(R.id.wZdjecie);

        btn_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                iv.setVisibility(View.VISIBLE);
            }
        });

        btn_hide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv.setVisibility(View.INVISIBLE);
            }
        });







        //NASTEPNE ZDJECIE
        iv = findViewById(R.id.imageView);
        bt = findViewById(R.id.nasZdjecie);
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


        //POPRZEDNIE ZDJECIE
        iv = findViewById(R.id.imageView);
        bt = findViewById(R.id.popZdjecie);
        flag = true;
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv.setImageResource(images[i]);
                i--;
                if(i==-1){
                    i=0;
                }
            }
        });







    }
}