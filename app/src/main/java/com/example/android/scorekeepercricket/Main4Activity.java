package com.example.android.scorekeepercricket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Bundle bundle = getIntent().getExtras();
        String valueReceivedThree = bundle.getString("Key3");

        TextView winner = findViewById(R.id.winner);
        winner.setText(valueReceivedThree);
    }
}
