package com.example.userdes_finals;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class page5 extends AppCompatActivity {

    private EditText firstName, lastName, email, newPassword, confirmPassword;
    private Button createAccountButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page5);

        firstName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.lastName);
        email = findViewById(R.id.email2);
        newPassword = findViewById(R.id.newPassword);
        confirmPassword = findViewById(R.id.confirmPassword);
        createAccountButton = findViewById(R.id.buttonca);

        createAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String firstNameInput = firstName.getText().toString().trim();
                String lastNameInput = lastName.getText().toString().trim();
                String emailInput = email.getText().toString().trim();
                String newPasswordInput = newPassword.getText().toString().trim();
                String confirmPasswordInput = confirmPassword.getText().toString().trim();

                if (firstNameInput.isEmpty()) {
                    firstName.setError("Please enter your first name");
                } else if (lastNameInput.isEmpty()) {
                    lastName.setError("Please enter your last name");
                } else if (emailInput.isEmpty()) {
                    email.setError("Please enter your email");
                } else if (newPasswordInput.isEmpty()) {
                    newPassword.setError("Please enter a password");
                } else if (confirmPasswordInput.isEmpty()) {
                    confirmPassword.setError("Please confirm your password");
                } else if (!newPasswordInput.equals(confirmPasswordInput)) {
                    confirmPassword.setError("Passwords do not match");
                } else {
                    createAccount(firstNameInput, lastNameInput, emailInput, newPasswordInput);
                }
            }
        });
    }

    private void createAccount(String firstName, String lastName, String email, String password) {
        Toast.makeText(this, "Account created successfully for " + firstName + " " + lastName, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(page5.this, MainActivity.class);
        startActivity(intent);
    }
}
