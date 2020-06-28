package com.example.forgegroundservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editTextInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapping();
    }

    private void mapping() {
        editTextInput = findViewById(R.id.et_input);
    }

    public void startService(View view) {
        String input = editTextInput.getText().toString();

        Intent serviceIntent = new Intent(this, ExampleService.class);
        serviceIntent.putExtra("inputExtra", input);

        startService(serviceIntent);
    }

    public void stopService(View view) {
        Intent serviceIntent = new Intent(this, ExampleService.class);
        stopService(serviceIntent);
    }
}
