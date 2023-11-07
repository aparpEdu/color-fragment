package com.example.color_fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

import com.example.color_fragment.fragment.ColorFragment;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button add  = findViewById(R.id.add);
        Button transfer = findViewById(R.id.transfer);
        Button remove = findViewById(R.id.remove);
        add.setOnClickListener(view -> {
            Random rnd = new Random();
            Integer color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256),
                    rnd.nextInt(256));
            ColorFragment colorFragment = ColorFragment.newInstance(color);
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frame1, colorFragment, "colorFragment")
                    .commit();
        });


    }
}