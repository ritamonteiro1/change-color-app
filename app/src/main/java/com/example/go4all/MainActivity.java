package com.example.go4all;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;


public class MainActivity extends AppCompatActivity {

    public static final int SUBTRACTION_ASSISTANT = 1;
    private Button mainButton;
    private ConstraintLayout mainConstraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewsById();
        setupButton();
    }

    private void findViewsById() {
        mainButton = findViewById(R.id.mainButton);
        mainConstraintLayout = findViewById(R.id.mainConstraintLayout);
    }

    private void setupButton() {
        mainButton.setOnClickListener(v -> {
            long timestampNumber = System.currentTimeMillis();
            String timestamp = Long.toString(timestampNumber);
            changeBackgroundColor(timestamp);
        });
    }

    private void changeBackgroundColor(String timestamp) {
        char lastLetter = getLastChar(timestamp);
        Colors color = Colors.convertLetterToColor(lastLetter);
        switch (color) {
            case WHITE:
                mainConstraintLayout.setBackgroundColor(Color.WHITE);
                break;
            case BLACK:
                mainConstraintLayout.setBackgroundColor(Color.BLACK);
                break;
            case BLUE:
                mainConstraintLayout.setBackgroundColor(Color.BLUE);
                break;
            case GREEN:
                mainConstraintLayout.setBackgroundColor(Color.GREEN);
                break;
            case PINK:
                mainConstraintLayout.setBackgroundColor(Color.MAGENTA);
                break;
            case RED:
                mainConstraintLayout.setBackgroundColor(Color.RED);
                break;
            case PURPLE:
                mainConstraintLayout.setBackgroundResource(R.color.purple);
                break;
            case YELLOW:
                mainConstraintLayout.setBackgroundColor(Color.YELLOW);
                break;
            case GRAY:
                mainConstraintLayout.setBackgroundColor(Color.GRAY);
                break;
            case LILAC:
                mainConstraintLayout.setBackgroundResource(R.color.lilac);
                break;
            default:
                Toast.makeText(this, getString(R.string.error_color_message), Toast.LENGTH_SHORT).show();
                break;
        }
    }

    private char getLastChar(String timestamp) {
        return timestamp.charAt(timestamp.length() - SUBTRACTION_ASSISTANT);
    }
}