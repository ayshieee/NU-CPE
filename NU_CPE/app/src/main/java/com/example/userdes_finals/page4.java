package com.example.userdes_finals;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class page4 extends AppCompatActivity {

    private Button buttonToast;
    private ImageView backb4;
    private EditText newPassword;
    private EditText confirmPassword;
    private Button resetPasswordButton;
    private ImageView backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);

        buttonToast = findViewById(R.id.buttonrp);
        buttonToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(page4.this, "Password changed successfully! Proceed to Login", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(page4.this, MainActivity.class);
                startActivity(intent);
            }
        });

        backb4 = findViewById(R.id.backb4);
        backb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page4.this, page3.class);
                startActivity(intent);
            }
        });
        newPassword = findViewById(R.id.newpass);  // EditText for new password
        confirmPassword = findViewById(R.id.confirmpass);  // EditText for confirm password
        resetPasswordButton = findViewById(R.id.buttonrp);  // Button for reset action
        backButton = findViewById(R.id.backb4);  // ImageView for back button

        // Set up back button click listener to navigate back
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page4.this, page3.class);
                startActivity(intent);
            }
        });

        // Set up reset password button click listener
        resetPasswordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newPasswordInput = newPassword.getText().toString().trim();
                String confirmPasswordInput = confirmPassword.getText().toString().trim();

                // Validate inputs
                if (newPasswordInput.isEmpty()) {
                    newPassword.setError("Please enter a new password");
                } else if (confirmPasswordInput.isEmpty()) {
                    confirmPassword.setError("Please confirm your password");
                } else if (!newPasswordInput.equals(confirmPasswordInput)) {
                    confirmPassword.setError("Passwords do not match");
                } else {
                    // Call password reset functionality
                    resetPassword(newPasswordInput);
                }
            }
        });
    }

    private void resetPassword(String newPassword) {
        // Implement password reset functionality here
        // Placeholder: Display a toast message for now
        Toast.makeText(this, "Password reset successfully", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(page4.this, page5.class);
        startActivity(intent);
    }
}