package com.example.cricket_score;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button one_1,two_2,three_3,four_4,six_6,wide_wd,noball_nb,wicket_w;
    private TextView ball_hit,score_total,over_total,current_hits_over;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one_1 = findViewById(R.id.button);
        two_2 = findViewById(R.id.button2);
        three_3 = findViewById(R.id.button3);
        four_4 = findViewById(R.id.button4);
        six_6 = findViewById(R.id.button5);
        wide_wd = findViewById(R.id.button6);
        noball_nb = findViewById(R.id.button7);
        wicket_w = findViewById(R.id.button8);

    }
}
