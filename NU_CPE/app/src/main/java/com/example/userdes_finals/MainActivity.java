package com.example.userdes_finals;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView forgotpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        forgotpass = findViewById(R.id.forgotpass);
        forgotpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, page2.class);
                startActivity(intent);
            }
        });

        TextView email = findViewById(R.id.email);
        TextView password = findViewById(R.id.password);
        Button login = findViewById(R.id.loginbutton);

        email.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus) {
                email.setText("");
            }
        });

        password.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus) {
                password.setText("");
            }
        });

        login.setOnClickListener(view -> {
            String emailInput = email.getText().toString();
            String passwordInput = password.getText().toString();


            if (emailInput.endsWith("@students.nu-laguna.edu.ph")) {

                Intent intent = new Intent(MainActivity.this, Dashboard.class);
                startActivity(intent);
            } else {
                Toast.makeText(MainActivity.this, "Login failed, please try again.", Toast.LENGTH_SHORT).show();

                Button buttonToast = findViewById(R.id.loginbutton);
                buttonToast.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, Dashboard.class);
                        startActivity(intent);
                    }
                });
            }
        });
    }
}