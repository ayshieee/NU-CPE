package com.example.userdes_finals;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Dashboard extends AppCompatActivity {

    private ImageView heart1, clink1, clink2;
    private ImageView imageView10;
    private ImageView imageView12;
    private ImageView imageView13;
    private ImageView imageView14;
    private TextView viewMore, name;
    private boolean isHeartFilled = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        heart1 = findViewById(R.id.heart1);
        clink1 = findViewById(R.id.clink1);
        clink2 = findViewById(R.id.clink2);
        viewMore = findViewById(R.id.viewMore);
        name = findViewById(R.id.name);

        heart1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isHeartFilled) {
                    heart1.setImageResource(R.drawable.heart1); // Outline heart
                } else {
                    heart1.setImageResource(R.drawable.icon); // Filled heart
                }
                isHeartFilled = !isHeartFilled;
            }
        });

        View.OnClickListener copyLinkListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Dashboard.this, "Copied link!", Toast.LENGTH_SHORT).show();
            }
        };

        clink1.setOnClickListener(copyLinkListener);
        clink2.setOnClickListener(copyLinkListener);

        viewMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, calendar.class);
                startActivity(intent);
            }
        });

        name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, profile.class);
                startActivity(intent);
            }
        });
        imageView10 = findViewById(R.id.imageView10);
        imageView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this, Dashboard.class);
                startActivity(intent);
            }
        });
        imageView12 = findViewById(R.id.imageView12);
        imageView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this, registration.class);
                startActivity(intent);
            }
        });
        imageView13 = findViewById(R.id.imageView13);
        imageView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this, calendar.class);
                startActivity(intent);
            }
        });
        imageView14 = findViewById(R.id.imageView14);
        imageView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this, profile.class);
                startActivity(intent);
            }
        });
    }
}