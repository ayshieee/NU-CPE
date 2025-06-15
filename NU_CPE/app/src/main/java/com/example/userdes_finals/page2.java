package com.example.userdes_finals;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.example.userdes_finals.R;
import com.example.userdes_finals.MainActivity;
import com.example.userdes_finals.page3;

public class page2 extends AppCompatActivity {

    private Button buttonsc;
    private ImageView backb2;
    private EditText editTextEmail;
    private Button buttonSendCode;
    private TextView forgotPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        buttonsc = findViewById(R.id.buttonsc);
        buttonsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(page2.this, page3.class);
                startActivity(intent);
            }
        });

        backb2 = findViewById(R.id.backb2);
        backb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page2.this, MainActivity.class);
                startActivity(intent);
            }
        });
        editTextEmail = findViewById(R.id.editTextTextEmailAddress);
        buttonSendCode = findViewById(R.id.buttonsc);
        forgotPassword = findViewById(R.id.textView);

        // Set up button click listener
        buttonSendCode.setOnClickListener(view -> {
            String emailInput = editTextEmail.getText().toString();

            // Example: Check if the email field is empty
            if (emailInput.isEmpty()) {
                editTextEmail.setError("Please enter an email");
            } else {
                // Handle your send code functionality here
                sendVerificationCode(emailInput);
            }
        });
    }

    private void sendVerificationCode(String email) {
        // Logic for sending verification code
        // Example placeholder code
        Toast.makeText(this, "Code sent to: " + email, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(page2.this, page3.class);
        startActivity(intent);
    }

}