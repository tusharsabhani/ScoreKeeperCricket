package com.example.android.scorekeepercricket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle bundle = getIntent().getExtras();
        String valueReceived1 = bundle.getString("Key1");
        String valueReceived2 = bundle.getString("Key2");

        TextView playerOne = findViewById(R.id.player1);
        playerOne.setText(valueReceived1);

        TextView playerTwo = findViewById(R.id.player2);
        playerTwo.setText(valueReceived2);

        button = findViewById(R.id.innings);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivity3();
            }
        });

    }

    int scoreA=0;
    int wicketB=0;
    int balls=0;

    public void sixRuns(View view){
        if(balls==60)
        {   Toast.makeText(this,"Maximum overs have been bowled\nPress innings to change innings",Toast.LENGTH_SHORT).show();
            return ;}

        if(wicketB==10)
        {   Toast.makeText(this,"You're all out\nPress innings to change innings",Toast.LENGTH_SHORT).show();
            return ;}
        scoreA+=6;
        balls+=1;
        displayBalls();
        displayScoreTeamA(scoreA);
    }
    public void fourRuns(View view){
        if(balls==60)
        {   Toast.makeText(this,"Maximum overs have been bowled\nPress innings to change innings",Toast.LENGTH_SHORT).show();
            return ;}

        if(wicketB==10)
        {   Toast.makeText(this,"You're all out\nPress innings to change innings",Toast.LENGTH_SHORT).show();
            return ;}
        scoreA+=4;
        balls+=1;
        displayBalls();
        displayScoreTeamA(scoreA);
    }
    public void threeRuns(View view){
        if(balls==60)
        {   Toast.makeText(this,"Maximum overs have been bowled\nPress innings to change innings",Toast.LENGTH_SHORT).show();
            return ;}

        if(wicketB==10)
        {   Toast.makeText(this,"You're all out\nPress innings to change innings",Toast.LENGTH_SHORT).show();
            return ;}
        scoreA+=3;
        balls+=1;
        displayBalls();
        displayScoreTeamA(scoreA);
    }
    public void twoRuns(View view){
        if(balls==60)
        {   Toast.makeText(this,"Maximum overs have been bowled\nPress innings to change innings",Toast.LENGTH_SHORT).show();
            return ;}

        if(wicketB==10)
        {   Toast.makeText(this,"You're all out\nPress innings to change innings",Toast.LENGTH_SHORT).show();
            return ;}
        scoreA+=2;
        balls+=1;
        displayBalls();
        displayScoreTeamA(scoreA);
    }
    public void oneRun(View view){
        if(balls==60)
        {   Toast.makeText(this,"Maximum overs have been bowled\nPress innings to change innings",Toast.LENGTH_SHORT).show();
            return ;}

        if(wicketB==10)
        {   Toast.makeText(this,"You're all out\nPress innings to change innings",Toast.LENGTH_SHORT).show();
            return ;}
        scoreA+=1;
        balls+=1;
        displayBalls();
        displayScoreTeamA(scoreA);
    }
    public void wideBall(View view){
        if(balls==60)
        {   Toast.makeText(this,"Maximum overs have been bowled\nPress innings to change innings",Toast.LENGTH_SHORT).show();
            return ;}

        if(wicketB==10)
        {   Toast.makeText(this,"You're all out\nPress innings to change innings",Toast.LENGTH_SHORT).show();
            return ;}
        scoreA+=1;
        displayScoreTeamA(scoreA);
    }
    public void noBall(View view){
        if(balls==60)
        {   Toast.makeText(this,"Maximum overs have been bowled\nPress innings to change innings",Toast.LENGTH_SHORT).show();
            return ;}

        if(wicketB==10)
        {   Toast.makeText(this,"You're all out\nPress innings to change innings",Toast.LENGTH_SHORT).show();
            return ;}
        scoreA+=1;
        displayScoreTeamA(scoreA);
    }

    public void wicket(View view){
        if(balls==60)
        {   Toast.makeText(this,"Maximum overs have been bowled\nPress innings to change innings",Toast.LENGTH_SHORT).show();
            return ;}

        if(wicketB==10)
        {   Toast.makeText(this,"You're all out\nPress innings to change innings",Toast.LENGTH_SHORT).show();
            return ;}
        wicketB+=1;
        balls+=1;
        displayBalls();
        displayWicketTeamB(wicketB);
    }

    public void dotBall(View view){
        if(balls==60)
        {   Toast.makeText(this,"Maximum overs have been bowled\nPress innings to change innings",Toast.LENGTH_SHORT).show();
            return ;}

        if(wicketB==10)
        {   Toast.makeText(this,"You're all out\nPress innings to change innings",Toast.LENGTH_SHORT).show();
            return ;}
        balls+=1;
        displayBalls();
    }

    public void reset(View view){
        wicketB=0;
        scoreA=0;
        balls=0;
        displayWicketTeamB(wicketB);
        displayScoreTeamA(scoreA);
        displayBalls();
    }

    public void displayScoreTeamA(int score) {
        TextView scoreView = findViewById(R.id.score_A);
        scoreView.setText(String.valueOf(score));
    }

    public void displayWicketTeamB(int wicket){
        TextView wicketView = findViewById(R.id.wickets_B);
        wicketView.setText(String.valueOf(wicket));
    }

    public void displayBalls(){
        int ball = balls%6;
        int ovr = balls/6;

        TextView overview = findViewById(R.id.over);
        overview.setText(String.valueOf(ovr));

        TextView ballView = findViewById(R.id.ball);
        ballView.setText(String.valueOf(ball));
    }
    public void openActivity3(){
        TextView nameOne = findViewById(R.id.player1);
        String valueOne = nameOne.getText().toString();

        TextView nameTwo = findViewById(R.id.player2);
        String valueTwo = nameTwo.getText().toString();

        TextView score = findViewById(R.id.score_A);
        String valueThree = score.getText().toString();

        TextView wicket = findViewById(R.id.wickets_B);
        String valueFour = wicket.getText().toString();

        Intent intent = new Intent(this, Main3Activity.class);
        intent.putExtra("key1",valueOne);
        intent.putExtra("key2",valueTwo);
        intent.putExtra("key3",valueThree);
        intent.putExtra("key4",valueFour);
        startActivity(intent);
    }
}
