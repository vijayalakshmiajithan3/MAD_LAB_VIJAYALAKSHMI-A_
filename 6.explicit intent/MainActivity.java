package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.intent.R;

public class MainActivity extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.no);
    }


    public void OnIndexSendButtonClicked(View view) {
    
        Intent intent = new Intent(this, com.example.intent.MainActivity2.class);

     
        String index = editText.getText().toString();

        intent.putExtra("ImageIndex", index);


        startActivity(intent);
    }
}

