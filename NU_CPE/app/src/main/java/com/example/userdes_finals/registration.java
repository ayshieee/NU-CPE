package com.example.userdes_finals;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class registration extends AppCompatActivity {

    private ImageView imageView10;
    private ImageView imageView12;
    private ImageView imageView13;
    private ImageView imageView14;
    private Button submit;
    private TextView fname;
    private TextView YPD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        // Initialize views
        submit = findViewById(R.id.submit);
        fname = findViewById(R.id.fname);
        YPD = findViewById(R.id.YPD);

        // Set up submit button click listener
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ypdInput = YPD.getText().toString();  // Retrieve text from YPD TextView
                String fnameInput = fname.getText().toString();  // Retrieve text from fname TextView

                // Check if inputs are empty
                if (ypdInput.isEmpty() || fnameInput.isEmpty()) {
                    Toast.makeText(registration.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(registration.this, "Your form has been submitted successfully, please wait for an email.",
                            Toast.LENGTH_LONG).show();
                    // Proceed with additional form submission logic if necessary
                }
            }
        });

        // Image button listeners
        imageView10 = findViewById(R.id.imageView10);
        imageView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(registration.this, Dashboard.class);
                startActivity(intent);
            }
        });

        imageView12 = findViewById(R.id.imageView12);
        imageView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(registration.this, registration.class);
                startActivity(intent);
            }
        });

        imageView13 = findViewById(R.id.imageView13);
        imageView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(registration.this, calendar.class);
                startActivity(intent);
            }
        });

        imageView14 = findViewById(R.id.imageView14);
        imageView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(registration.this, profile.class);
                startActivity(intent);
            }
        });
    }
}
