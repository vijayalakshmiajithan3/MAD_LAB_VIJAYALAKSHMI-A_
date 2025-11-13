package com.example.toggleregistration;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RelativeLayout form1, form2;
    Button nextBtn, backBtn, submitBtn;
    EditText username, mobile, email, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        form1 = findViewById(R.id.form1);
        form2 = findViewById(R.id.form2);
        nextBtn = findViewById(R.id.nextBtn);
        backBtn = findViewById(R.id.backBtn);
        submitBtn = findViewById(R.id.submitBtn);

        username = findViewById(R.id.username);
        mobile = findViewById(R.id.mobile);
        email = findViewById(R.id.email);
        pass = findViewById(R.id.pass);

      
        nextBtn.setOnClickListener(v -> {
            if (username.getText().toString().isEmpty() || mobile.getText().toString().isEmpty()) {
                Toast.makeText(MainActivity.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
            } else {
                form1.setVisibility(View.GONE);
                form2.setVisibility(View.VISIBLE);
            }
        });

    
        backBtn.setOnClickListener(v -> {
            form2.setVisibility(View.GONE);
            form1.setVisibility(View.VISIBLE);
        });

      n
        submitBtn.setOnClickListener(v -> {
            if (email.getText().toString().isEmpty() || pass.getText().toString().isEmpty()) {
                Toast.makeText(MainActivity.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this, "Registration Successful!", Toast.LENGTH_LONG).show();
                form2.setVisibility(View.GONE);
                form1.setVisibility(View.VISIBLE);
                username.setText("");
                mobile.setText("");
                email.setText("");
                pass.setText("");
            }
        });
    }
}
