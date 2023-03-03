package com.soulsoft.shetkarikrushiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    private final int PERMISSION_ID = 44;

    @Override
    protected void onStart() {
        super.onStart();
        // FirebaseApp.initializeApp(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        int SPLASH_DISPLAY_DURATION = 2000;

        new Handler().postDelayed(() -> {
            /* Create an Intent that will start the Menu-Activity. */
            Intent intent = new Intent(SplashActivity.this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            finish();
        }, SPLASH_DISPLAY_DURATION);
    }
}