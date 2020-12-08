package com.example.a30_databind;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.a30_databind.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        int drawable = R.drawable.ic_launcher_background;
        UserProfile userProfile = new UserProfile("홍길동", "01040382576", "서울 양천구 신월동", drawable);
        binding.setUserProfile(userProfile);
    }
}