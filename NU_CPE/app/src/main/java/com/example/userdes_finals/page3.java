package com.example.userdes_finals;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class page3 extends AppCompatActivity {

    private Button enterButton;
    private ImageView backButton;
    private EditText editTextEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        // Initialize views
        enterButton = findViewById(R.id.enterbutton);
        backButton = findViewById(R.id.backb3);
        editTextEmail = findViewById(R.id.editTextText);

        // Set up Enter button click listener for login functionality
        enterButton.setOnClickListener(view -> {
            String emailInput = editTextEmail.getText().toString().trim();

            // Check if the email field is empty
            if (emailInput.isEmpty()) {
                editTextEmail.setError("Please enter code");
            } else {
                login(emailInput);
            }
        });

        // Set up Back button click listener
        backButton.setOnClickListener(v -> {
            Intent intent = new Intent(page3.this, page2.class);
            startActivity(intent);
        });
    }

    private void login(String email) {
        // Show a toast message and navigate to page4
        Toast.makeText(this, "Logging in with Email: " + email, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(page3.this, page4.class);
        startActivity(intent);
    }
}
