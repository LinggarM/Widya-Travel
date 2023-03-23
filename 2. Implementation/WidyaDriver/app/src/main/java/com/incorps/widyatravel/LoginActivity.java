package com.incorps.widyatravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView forgotPassword = findViewById(R.id.forgot_password);
        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentForgotPassword = new Intent(LoginActivity.this, ForgotPasswordActivity.class);
                startActivity(intentForgotPassword);
            }
        });

    }
}
