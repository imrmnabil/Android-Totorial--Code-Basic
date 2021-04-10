package com.example.falsephone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvShow = findViewById(R.id.tvShow);

        if(getIntent().getData() != null) {
            String tel = getIntent().getData().toString().substring(4).trim();
            tvShow.setText(tel);
        }
        else
        {
            tvShow.setText("No data received");
        }
    }
}