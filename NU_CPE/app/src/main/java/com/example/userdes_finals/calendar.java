package com.example.userdes_finals;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

public class calendar extends AppCompatActivity {

    private ImageView imageView10;
    private ImageView imageView12;
    private ImageView imageView13;
    private ImageView imageView14;
    private ImageView no28, no29, no30, no31;
    private ImageView popupImage, popupMessage;
    private boolean isPopupVisible = false;
    private View dimBackground;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        no28 = findViewById(R.id.imageView3);
        no29 = findViewById(R.id.imageView4);
        no30 = findViewById(R.id.imageView5);
        no31 = findViewById(R.id.imageView6);

        popupImage = findViewById(R.id.popupImage);
        popupMessage = findViewById(R.id.popupMessage);

        dimBackground = findViewById(R.id.dimBackground);

        no28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopup(R.drawable.popup28);
            }
        });

        no29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopup(R.drawable.popup29);
            }
        });

        no30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopup(R.drawable.popup30);
            }
        });

        no31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopup(R.drawable.popup31);
            }
        });

        popupImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupMessage();
            }
        });
        imageView10 = findViewById(R.id.imageView10);
        imageView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(calendar.this, Dashboard.class);
                startActivity(intent);
            }
        });
        imageView12 = findViewById(R.id.imageView12);
        imageView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(calendar.this, registration.class);
                startActivity(intent);
            }
        });
        imageView13 = findViewById(R.id.imageView13);
        imageView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(calendar.this, calendar.class);
                startActivity(intent);
            }
        });
        imageView14 = findViewById(R.id.imageView14);
        imageView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(calendar.this, profile.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        if (isPopupVisible) {
            popupImage.setVisibility(View.GONE);
            popupMessage.setVisibility(View.GONE);
            dimBackground.setVisibility(View.GONE);
            isPopupVisible = false;
        } else {
            super.onBackPressed();
        }
    }

    private void showPopup(int popupDrawable) {
        popupImage.setImageResource(popupDrawable);
        popupImage.setVisibility(View.VISIBLE);
        popupMessage.setVisibility(View.GONE);
        dimBackground.setVisibility(View.VISIBLE);
        applySlideInAnimation(popupImage);
        isPopupVisible = true;
    }

    private void showPopupMessage() {
        popupMessage.setVisibility(View.VISIBLE);
        applySlideInAnimation(popupMessage);
        Toast.makeText(this, "Detail successfully saved", Toast.LENGTH_SHORT).show();
    }

    private void applySlideInAnimation(View view) {
        Animation slideInAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_in);
        view.startAnimation(slideInAnimation);
    }
}

