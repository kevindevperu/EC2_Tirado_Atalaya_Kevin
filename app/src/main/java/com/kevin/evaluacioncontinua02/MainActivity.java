package com.kevin.evaluacioncontinua02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.kevin.evaluacioncontinua02.databinding.ActivityMainBinding;
import android.os.Bundle;
import android.os.Handler;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    private static final int ONBOARDING_DELAY = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        }, ONBOARDING_DELAY);
    }
}