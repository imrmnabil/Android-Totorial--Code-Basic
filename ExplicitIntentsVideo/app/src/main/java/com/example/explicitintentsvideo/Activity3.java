package com.example.explicitintentsvideo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity3 extends AppCompatActivity {

    EditText etSurename;
    Button btnSubmit, btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        etSurename = findViewById(R.id.etSurename);
        btnSubmit = findViewById(R.id.btnSubmit);
        btnCancel = findViewById(R.id.btnCancel);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etSurename.getText().toString().isEmpty())
                {
                    Toast.makeText(Activity3.this,"Please enter your name!",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    String surename = etSurename.getText().toString().trim();

                    Intent intent = new Intent();
                    intent.putExtra("surename", surename);
                    setResult(RESULT_OK, intent);
                    Activity3.this.finish();
                }

            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(RESULT_CANCELED);
                Activity3.this.finish();
            }
        });
    }
}