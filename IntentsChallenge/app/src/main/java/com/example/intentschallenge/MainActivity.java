package com.example.intentschallenge;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView imgResult, imgCall, imgMap, imgWeb;
    Button btnCreate;
    String stName, stPhone, stMap, stWeb;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        imgResult = findViewById(R.id.imgResult);
        imgCall = findViewById(R.id.imgCall);
        imgMap = findViewById(R.id.imgMap);
        imgWeb = findViewById(R.id.imgWeb);
        btnCreate = findViewById(R.id.btnCreate);



        imgResult.setVisibility(View.INVISIBLE);
        imgCall.setVisibility(View.INVISIBLE);
        imgMap.setVisibility(View.INVISIBLE);
        imgWeb.setVisibility(View.INVISIBLE);


        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.intentschallenge.Activity2.class);
                startActivityForResult(intent, 1);
            }
        });

        imgCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + stPhone));
                startActivity(intent);

            }
        });

        imgMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=" + stMap));
                startActivity(intent);

            }
        });

        imgWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + stWeb));
                startActivity(intent);
            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 1)
        {
            if (resultCode == 1)
            {
                imgResult.setImageResource(R.drawable.vctfriend);
                stName = data.getStringExtra("stname");
                stPhone = data.getStringExtra("stphone");
                stMap = data.getStringExtra("stmap");
                stWeb = data.getStringExtra("stweb");

                imgResult.setVisibility(View.VISIBLE);
                imgCall.setVisibility(View.VISIBLE);
                imgMap.setVisibility(View.VISIBLE);
                imgWeb.setVisibility(View.VISIBLE);




            }
            if (resultCode == 2)
            {
                imgResult.setImageResource(R.drawable.vcthome);
                stName = data.getStringExtra("stname");
                stPhone = data.getStringExtra("stphone");
                stMap = data.getStringExtra("stmap");
                stWeb = data.getStringExtra("stweb");

                imgResult.setVisibility(View.VISIBLE);
                imgCall.setVisibility(View.VISIBLE);
                imgMap.setVisibility(View.VISIBLE);
                imgWeb.setVisibility(View.VISIBLE);

            }
            if (resultCode == 3)
            {
                imgResult.setImageResource(R.drawable.vcthospital);
                stName = data.getStringExtra("stname");
                stPhone = data.getStringExtra("stphone");
                stMap = data.getStringExtra("stmap");
                stWeb = data.getStringExtra("stweb");

                imgResult.setVisibility(View.VISIBLE);
                imgCall.setVisibility(View.VISIBLE);
                imgMap.setVisibility(View.VISIBLE);
                imgWeb.setVisibility(View.VISIBLE);

            }
        }
    }
}