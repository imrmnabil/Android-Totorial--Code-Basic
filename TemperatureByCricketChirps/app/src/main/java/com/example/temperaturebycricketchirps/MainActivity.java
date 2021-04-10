package com.example.temperaturebycricketchirps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText crpNumber;
    TextView result;
    Button btnSubmit;
    DecimalFormat decAns = new DecimalFormat("#0.0");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        crpNumber = findViewById(R.id.crpNumber);
        btnSubmit = findViewById(R.id.btnSubmit);
        result = findViewById(R.id.result);
        result.setVisibility(View.INVISIBLE);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(crpNumber.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter the number of chirps.", Toast.LENGTH_SHORT).show();
                }
                else {
                    String sCrpNumber = crpNumber.getText().toString().trim();
                    int num = Integer.parseInt(sCrpNumber);
                    double ans = num / 3.0 + 4.0;
                    String sAns = decAns.format(ans);
                    String text = "Approximate temperature outside :" + sAns + " °C\n";
                    result.setText(text);
                    result.setVisibility(View.VISIBLE);
                }
            }
        });


    }
}