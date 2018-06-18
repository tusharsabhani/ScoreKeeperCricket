package com.example.android.scorekeepercricket;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Bundle bundle = getIntent().getExtras();
        String valueReceivedOne = bundle.getString("key1");
        String valueReceivedTwo = bundle.getString("key2");
        String valueReceivedThree = bundle.getString("key3");
        String valueReceivedFour = bundle.getString("key4");

        TextView player1 = findViewById(R.id.player1);
        player1.setText(valueReceivedOne);

        TextView defPlayer = findViewById(R.id.playerDefending);
        defPlayer.setText(valueReceivedOne);

        TextView player2 = findViewById(R.id.player2);
        player2.setText(valueReceivedTwo);

        TextView defScore = findViewById(R.id.defendingScore);
        defScore.setText(valueReceivedThree);

        TextView defWicket = findViewById(R.id.defendingWickets);
        defWicket.setText(valueReceivedFour);

        button = findViewById(R.id.endMatch);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivity4();
            }
        });
    }

    int scoreB=0;
    int wicketA=0;
    int balls=0;

    public void sixRuns(View view){
        if(balls==60)
        {   Toast.makeText(this,"Maximum overs have been bowled\nPress End Result to see result",Toast.LENGTH_SHORT).show();
            return ;}

        if(wicketA==10)
        {   Toast.makeText(this,"You're all out\nPress End Result to see result",Toast.LENGTH_SHORT).show();
            return ;}

        TextView textview = findViewById(R.id.defendingScore);
        int defendingScore = Integer.valueOf(textview.getText().toString());

        if(scoreB>defendingScore){
            Toast.makeText(this,"Match is over\nPress End Game to see the result",Toast.LENGTH_SHORT).show();
            return ; }
        scoreB+=6;
        balls+=1;
        displayScoreTeamB(scoreB);
        displayBalls();
        if(scoreB>defendingScore){
            Toast.makeText(this,"Match is over\nPress End Game to see the result",Toast.LENGTH_SHORT).show();
            return ; }
        runsNeeded();
        ballsLeft();
    }
    public void fourRuns(View view){
        if(balls==60)
        {   Toast.makeText(this,"Maximum overs have been bowled\nPress End Result to see result",Toast.LENGTH_SHORT).show();
            return ;}

        if(wicketA==10)
        {   Toast.makeText(this,"You're all out\nPress End Result to see result",Toast.LENGTH_SHORT).show();
            return ;}
        TextView textview = findViewById(R.id.defendingScore);
        int defendingScore = Integer.valueOf(textview.getText().toString());

        if(scoreB>defendingScore){
            Toast.makeText(this,"Match is over\nPress End Game to see the result",Toast.LENGTH_SHORT).show();
            return ; }
        scoreB+=4;
        balls+=1;
        displayBalls();
        displayScoreTeamB(scoreB);

        if(scoreB>defendingScore){
            Toast.makeText(this,"Match is over\nPress End Game to see the result",Toast.LENGTH_SHORT).show();
            return ; }
        runsNeeded();
        ballsLeft();
    }
    public void threeRuns(View view){
        if(balls==60)
        {   Toast.makeText(this,"Maximum overs have been bowled\nPress End Result to see result",Toast.LENGTH_SHORT).show();
            return ;}

        if(wicketA==10)
        {   Toast.makeText(this,"You're all out\nPress End Result to see result",Toast.LENGTH_SHORT).show();
            return ;}
        TextView textview = findViewById(R.id.defendingScore);
        int defendingScore = Integer.valueOf(textview.getText().toString());

        if(scoreB>defendingScore){
            Toast.makeText(this,"Match is over\nPress End Game to see the result",Toast.LENGTH_SHORT).show();
            return ; }
        scoreB+=3;
        balls+=1;
        displayBalls();
        displayScoreTeamB(scoreB);

        if(scoreB>defendingScore){
            Toast.makeText(this,"Match is over\nPress End Game to see the result",Toast.LENGTH_SHORT).show();
            return ; }
        runsNeeded();
        ballsLeft();
    }
    public void twoRuns(View view){
        if(balls==60)
        {   Toast.makeText(this,"Maximum overs have been bowled\nPress End Result to see result",Toast.LENGTH_SHORT).show();
            return ;}

        if(wicketA==10)
        {   Toast.makeText(this,"You're all out\nPress End Result to see result",Toast.LENGTH_SHORT).show();
            return ;}
        TextView textview = findViewById(R.id.defendingScore);
        int defendingScore = Integer.valueOf(textview.getText().toString());

        if(scoreB>defendingScore){
            Toast.makeText(this,"Match is over\nPress End Game to see the result",Toast.LENGTH_SHORT).show();
            return ; }
        scoreB+=2;
        balls+=1;
        displayBalls();
        displayScoreTeamB(scoreB);

        if(scoreB>defendingScore){
            Toast.makeText(this,"Match is over\nPress End Game to see the result",Toast.LENGTH_SHORT).show();
            return ; }
        runsNeeded();
        ballsLeft();
    }
    public void oneRun(View view){
        if(balls==60)
        {   Toast.makeText(this,"Maximum overs have been bowled\nPress End Result to see result",Toast.LENGTH_SHORT).show();
            return ;}

        if(wicketA==10)
        {   Toast.makeText(this,"You're all out\nPress End Result to see result",Toast.LENGTH_SHORT).show();
            return ;}
        TextView textview = findViewById(R.id.defendingScore);
        int defendingScore = Integer.valueOf(textview.getText().toString());

        if(scoreB>defendingScore){
            Toast.makeText(this,"Match is over\nPress End Game to see the result",Toast.LENGTH_SHORT).show();
            return ; }
        scoreB+=1;
        balls+=1;
        displayBalls();
        displayScoreTeamB(scoreB);

        if(scoreB>defendingScore){
            Toast.makeText(this,"Match is over\nPress End Game to see the result",Toast.LENGTH_SHORT).show();
            return ; }
        runsNeeded();
        ballsLeft();
    }
    public void wideBall(View view){
        if(balls==60)
        {   Toast.makeText(this,"Maximum overs have been bowled\nPress End Result to see result",Toast.LENGTH_SHORT).show();
            return ;}

        if(wicketA==10)
        {   Toast.makeText(this,"You're all out\nPress End Result to see result",Toast.LENGTH_SHORT).show();
            return ;}
        TextView textview = findViewById(R.id.defendingScore);
        int defendingScore = Integer.valueOf(textview.getText().toString());

        if(scoreB>defendingScore){
            Toast.makeText(this,"Match is over\nPress End Game to see the result",Toast.LENGTH_SHORT).show();
            return ; }
        scoreB+=1;
        displayScoreTeamB(scoreB);

        if(scoreB>defendingScore){
            Toast.makeText(this,"Match is over\nPress End Game to see the result",Toast.LENGTH_SHORT).show();
            return ; }
        runsNeeded();
    }
    public void noBall(View view){
        if(balls==60)
        {   Toast.makeText(this,"Maximum overs have been bowled\nPress End Result to see result",Toast.LENGTH_SHORT).show();
            return ;}

        if(wicketA==10)
        {   Toast.makeText(this,"You're all out\nPress End Result to see result",Toast.LENGTH_SHORT).show();
            return ;}
        TextView textview = findViewById(R.id.defendingScore);
        int defendingScore = Integer.valueOf(textview.getText().toString());

        if(scoreB>defendingScore){
            Toast.makeText(this,"Match is over\nPress End Game to see the result",Toast.LENGTH_SHORT).show();
            return ; }
        scoreB+=1;
        displayScoreTeamB(scoreB);

        if(scoreB>defendingScore){
            Toast.makeText(this,"Match is over\nPress End Game to see the result",Toast.LENGTH_SHORT).show();
            return ; }
        runsNeeded();
    }

    public void wicket(View view){
        if(balls==60)
        {   Toast.makeText(this,"Maximum overs have been bowled\nPress End Result to see result",Toast.LENGTH_SHORT).show();
            return ;}

        if(wicketA==10){
            Toast.makeText(this, "You're all out\nPress End Result to see result", Toast.LENGTH_SHORT).show();
            return ;
        }
        TextView textview = findViewById(R.id.defendingScore);
        int defendingScore = Integer.valueOf(textview.getText().toString());

        if(scoreB>defendingScore){
            Toast.makeText(this,"Match is over\nPress End Game to see the result",Toast.LENGTH_SHORT).show();
            return ; }
        wicketA+=1;
        balls+=1;

        if(scoreB>defendingScore){
            Toast.makeText(this,"Match is over\nPress End Game to see the result",Toast.LENGTH_SHORT).show();
            return ; }
        displayBalls();
        displayWicketTeamA(wicketA);
        runsNeeded();
        ballsLeft();
    }

    public void dotBall(View view) {
        if(balls==60)
        {   Toast.makeText(this,"Maximum overs have been bowled\nPress End Result to see result",Toast.LENGTH_SHORT).show();
            return ;}

        if(wicketA==10)
        {   Toast.makeText(this,"You're all out\nPress End Result to see result",Toast.LENGTH_SHORT).show();
            return ;}
        TextView textview = findViewById(R.id.defendingScore);
        int defendingScore = Integer.valueOf(textview.getText().toString());

        if(scoreB>defendingScore){
            Toast.makeText(this,"Match is over\nPress End Game to see the result",Toast.LENGTH_SHORT).show();
            return ; }
        balls += 1;
        if(scoreB>defendingScore){
            Toast.makeText(this,"Match is over\nPress End Game to see the result",Toast.LENGTH_SHORT).show();
            return ; }
        displayBalls();
        runsNeeded();
        ballsLeft();
    }
        public void reset(View view){
        wicketA=0;
        scoreB=0;
        balls=0;
        displayWicketTeamA(wicketA);
        displayScoreTeamB(scoreB);
        displayBalls();
    }

    public void displayScoreTeamB(int score) {
        TextView scoreView = findViewById(R.id.score_B);
        scoreView.setText(String.valueOf(score));
    }

    public void runsNeeded() {
        TextView scre = findViewById(R.id.defendingScore);
        int target = Integer.valueOf(scre.getText().toString());

        int runsNeeded = target +1 - scoreB;

        TextView scoreView = findViewById(R.id.runsNeeded);
        scoreView.setText(String.valueOf(runsNeeded));
    }

    public void ballsLeft(){
        TextView textview = findViewById(R.id.ballsLeft);
        int ballsLeft = 60 - balls;
        textview.setText(String.valueOf(ballsLeft));
    }

    public void displayWicketTeamA(int wicket){
        TextView wicketView = findViewById(R.id.wickets_A);
        wicketView.setText(String.valueOf(wicket));
    }

    public void displayBalls(){
        if(balls==60){
            Toast.makeText(this, "Maximum overs have been bowled\nPress Innings to change innings", Toast.LENGTH_SHORT).show();
            return ;
        }

        int ball = balls%6;
        int ovr = balls/6;

        TextView overview = findViewById(R.id.over);
        overview.setText(String.valueOf(ovr));

        TextView ballView = findViewById(R.id.ball);
        ballView.setText(String.valueOf(ball));
    }
    public void openActivity4(){
        TextView name1 = findViewById(R.id.defendingScore);
        int  num2 = Integer.valueOf(name1.getText().toString());

        /**TextView name2 = findViewById(R.id.score_B);
        int  num1 = Integer.valueOf(name2.getText().toString());*/
        int num1 = scoreB;

        if(num2-num1>0) {
            TextView name3 = findViewById(R.id.player1);
            String value3 = name3.getText().toString();
            Intent intent = new Intent(this, Main4Activity.class);
            intent.putExtra("Key3",value3);
            startActivity(intent);
        }

        if(num1>num2) {
            TextView name4 = findViewById(R.id.player2);
            String value4 = name4.getText().toString();
            Intent intent = new Intent(this, Main4Activity.class);
            intent.putExtra("Key3", value4);
            startActivity(intent);
        }
    }

}
