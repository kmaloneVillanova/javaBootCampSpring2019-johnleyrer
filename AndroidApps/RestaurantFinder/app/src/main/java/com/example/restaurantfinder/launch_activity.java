package com.example.restaurantfinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class launch_activity extends AppCompatActivity {
    TextView titlePrompt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_activity);
        Log.d("launch_activity", "in launch_activity onCreate method");

        titlePrompt = findViewById(R.id.titlePrompt);
    }

    public void launchMain(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}
