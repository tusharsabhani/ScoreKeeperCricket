package com.example.android.scorekeepercricket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivity2();
            }
        });

    }

    public void openActivity2(){
        EditText name1 = findViewById(R.id.player1);
        String value1 = name1.getText().toString();

        EditText name2 = findViewById(R.id.player2);
        String value2 = name2.getText().toString();

        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("Key1",value1);
        intent.putExtra("Key2",value2);
        startActivity(intent);
    }

  }
