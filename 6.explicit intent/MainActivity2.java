package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.intent.R;  

public class MainActivity2 extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imageView = findViewById(R.id.img1);

        String indexStr = getIntent().getStringExtra("ImageIndex");

        if (indexStr != null && !indexStr.isEmpty()) {
            try {
                int index = Integer.parseInt(indexStr);

                switch (index) {
                    case 1:
                        imageView.setImageResource(R.drawable.img1);
                        break;
                    case 2:
                        imageView.setImageResource(R.drawable.imga1);
                        break;
                    case 3:
                        imageView.setImageResource(R.drawable.imag2);
                        break;
                    default:
                        Toast.makeText(this, "Enter 1, 2, or 3 only", Toast.LENGTH_SHORT).show();
                        break;
                }
            } catch (NumberFormatException e) {
                Toast.makeText(this, "Invalid input! Please enter a number.", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "No input received!", Toast.LENGTH_SHORT).show();
        }
    }
}

