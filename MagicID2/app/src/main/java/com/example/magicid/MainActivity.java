package com.example.magicid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etID;
    Button btnSubmit;
    TextView tvResults;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etID = findViewById(R.id.etID);
        btnSubmit = findViewById(R.id.btnSubmit);
        tvResults = findViewById(R.id.tvResults);
        tvResults.setVisibility(View.INVISIBLE);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String idNumber = etID.getText().toString().trim();
                String dob = idNumber.substring(0,6);
                int gender = Integer.parseInt(Character.toString(idNumber.charAt(6)));

                String sGender;

                if(gender < 5) { sGender = "Female";}
                else {sGender = "Male";}

                int nationality = Integer.parseInt(Character.toString(idNumber.charAt(10)));

                String sNationality;

                if(nationality == 0)
                {
                    sNationality = "SA Citizen";
                }
                else {
                    sNationality = "Permanent Resident";
                }

                String text = ("Date of Birth:" + dob + "\n"
                        + "Gender:" + sGender + "\n"
                        + "Nationality:" + sNationality);

                tvResults.setText(text);
                tvResults.setVisibility(View.VISIBLE);
            }
        });

    }
}