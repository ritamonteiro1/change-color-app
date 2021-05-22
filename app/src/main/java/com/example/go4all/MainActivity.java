package com.example.go4all;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;


public class MainActivity extends AppCompatActivity {

    private Button mainButton;
    private ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findIds();
        setupButton();
    }

    private void findIds() {
        mainButton = findViewById(R.id.mainButton);
        constraintLayout = findViewById(R.id.mainConstraintLayout);
    }

    private void setupButton() {
        mainButton.setOnClickListener(this::onClick);
    }

    private void changeBackgroundColor(String timestamp) {
        switch (Colors.convertLetterToColor(timestamp.charAt(timestamp.length() - 1))){
            case Colors.WHITE:
                constraintLayout.setBackgroundColor(Color.WHITE);
                break;
            case Colors.BLACK:
                constraintLayout.setBackgroundColor(Color.BLACK);
                break;
            case Colors.BLUE:
                constraintLayout.setBackgroundColor(Color.BLUE);
                break;
            case Colors.GREEN:
                constraintLayout.setBackgroundColor(Color.GREEN);
                break;
            case Colors.MAGENTA:
                constraintLayout.setBackgroundColor(Color.MAGENTA);
                break;
            case Colors.RED:
                constraintLayout.setBackgroundColor(Color.RED);
                break;
            case Colors.PURPLE:
                constraintLayout.setBackgroundResource(R.color.purple);
                break;
            case Colors.YELLOW:
                constraintLayout.setBackgroundColor(Color.YELLOW);
                break;
            case Colors.GRAY:
                constraintLayout.setBackgroundColor(Color.GRAY);
                break;
            case Colors.LILAC:
                constraintLayout.setBackgroundResource(R.color.lilac);
                break;
        }
    }

    private void onClick(View v) {
        long timestampNumber = System.currentTimeMillis() / 1000;
        String timestamp = Long.toString(timestampNumber);
        changeBackgroundColor(timestamp);
    }
}