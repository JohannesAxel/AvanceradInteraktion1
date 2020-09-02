package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void openCompass(View view) {
        Intent intent = new Intent(this, Compass.class);
        startActivity(intent);
    }
    public void openAccelerometer(View view) {
        Intent intent = new Intent(this, Accelerometers.class);
        startActivity(intent);
    }
}
