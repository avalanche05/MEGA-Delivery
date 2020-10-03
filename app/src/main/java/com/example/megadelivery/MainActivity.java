package com.example.megadelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    // метод подключает пользователя к серверу
    private void connectToServer() throws InterruptedException {

        // тут будет подключение к серверу с помощью Retrofit
        startActivity(new Intent(MainActivity.this, LoginActivity.class));
    }
}