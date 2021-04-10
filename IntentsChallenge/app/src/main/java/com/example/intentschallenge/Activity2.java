package com.example.intentschallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    EditText etName, etPhone, etMap, etWeb;
    ImageView imgFriend, imgHome, imgHospital;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        etName = findViewById(R.id.etName);
        etPhone = findViewById(R.id.etPhone);
        etMap = findViewById(R.id.etMap);
        etWeb = findViewById(R.id.etWeb);
        imgFriend = findViewById(R.id.imgFriend);
        imgHome = findViewById(R.id.imgHome);
        imgHospital = findViewById(R.id.imgHospital);

        imgFriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etName.getText().toString().isEmpty() || etPhone.getText().toString().isEmpty() || etMap.getText().toString().isEmpty() || etWeb.getText().toString().isEmpty())
                {
                    Toast.makeText(Activity2.this, "Please enter all information properly", Toast.LENGTH_SHORT).show();
                }

                else {
                    Intent intent = new Intent();
                    String stName = etName.getText().toString().trim();
                    String stPhone = etPhone.getText().toString().trim();
                    String stMap = etMap.getText().toString().trim();
                    String stWeb = etWeb.getText().toString().trim();
                    intent.putExtra("stname",stName);
                    intent.putExtra("stphone",stPhone);
                    intent.putExtra("stmap",stMap);
                    intent.putExtra("stweb",stWeb);
                    setResult(1,intent);
                    Activity2.this.finish();
                }


            }
        });

        imgHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etName.getText().toString().isEmpty() || etPhone.getText().toString().isEmpty() || etMap.getText().toString().isEmpty() || etWeb.getText().toString().isEmpty())
                {
                    Toast.makeText(Activity2.this, "Please enter all information properly", Toast.LENGTH_SHORT).show();
                }

                else {
                    Intent intent = new Intent();
                    String stName = etName.getText().toString().trim();
                    String stPhone = etPhone.getText().toString().trim();
                    String stMap = etMap.getText().toString().trim();
                    String stWeb = etWeb.getText().toString().trim();
                    intent.putExtra("stname",stName);
                    intent.putExtra("stphone",stPhone);
                    intent.putExtra("stmap",stMap);
                    intent.putExtra("stweb",stWeb);
                    setResult(2,intent);
                    Activity2.this.finish();
                }

            }
        });

        imgHospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etName.getText().toString().isEmpty() || etPhone.getText().toString().isEmpty() || etMap.getText().toString().isEmpty() || etWeb.getText().toString().isEmpty())
                {
                    Toast.makeText(Activity2.this, "Please enter all information properly", Toast.LENGTH_SHORT).show();
                }

                else {
                    Intent intent = new Intent();
                    String stName = etName.getText().toString().trim();
                    String stPhone = etPhone.getText().toString().trim();
                    String stMap = etMap.getText().toString().trim();
                    String stWeb = etWeb.getText().toString().trim();
                    intent.putExtra("stname",stName);
                    intent.putExtra("stphone",stPhone);
                    intent.putExtra("stmap",stMap);
                    intent.putExtra("stweb",stWeb);
                    setResult(3,intent);
                    Activity2.this.finish();
                }

            }
        });
    }
}