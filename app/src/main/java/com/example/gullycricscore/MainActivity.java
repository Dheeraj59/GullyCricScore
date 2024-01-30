package com.example.gullycricscore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int wicketsA = 0;
    int wicketsB = 0;

    public void addSixForTeamA(View v){
        scoreTeamA = scoreTeamA + 6 ;
        displayForTeamA(scoreTeamA);
    }
    public void addFourForTeamA(View v){
        scoreTeamA = scoreTeamA + 4 ;
        displayForTeamA(scoreTeamA);
    }
    public void addThreeForTeamA(View v){
        scoreTeamA = scoreTeamA + 3 ;
        displayForTeamA(scoreTeamA);
    }
    public void addTwoForTeamA(View v){
        scoreTeamA = scoreTeamA + 2 ;
        displayForTeamA(scoreTeamA);
    }
    public void addOneForTeamA(View v){
        scoreTeamA = scoreTeamA + 1 ;
        displayForTeamA(scoreTeamA);
    }
    public void addExtraForTeamA(View v){
        scoreTeamA = scoreTeamA + 1 ;
        displayForTeamA(scoreTeamA);
    }
    public void addWicketForTeamA(View v){
        wicketsA = wicketsA + 1 ;
        displayForTeamAWickets(wicketsA);

    }
    public void addSixForTeamB(View v){
        scoreTeamB = scoreTeamB + 6 ;
        displayForTeamB(scoreTeamB);
    }
    public void addFourForTeamB(View v){
        scoreTeamB = scoreTeamB + 4 ;
        displayForTeamB(scoreTeamB);
    }
    public void addThreeForTeamB(View v){
        scoreTeamB = scoreTeamB + 3 ;
        displayForTeamB(scoreTeamB);
    }
    public void addTwoForTeamB(View v){
        scoreTeamB = scoreTeamB + 2 ;
        displayForTeamB(scoreTeamB);
    }
    public void addOneForTeamB(View v){
        scoreTeamB = scoreTeamB + 1 ;
        displayForTeamB(scoreTeamB);
    }
    public void addExtraForTeamB(View v){
        scoreTeamB = scoreTeamB + 1 ;
        displayForTeamB(scoreTeamB);
    }
    public void addWicketForTeamB(View v){
        wicketsB = wicketsB + 1 ;
        displayForTeamBWickets(wicketsB);

    }
    public void resetScores(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        wicketsA = 0;
        wicketsB = 0;
        displayForTeamAWickets(wicketsA);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayForTeamBWickets(wicketsB);
    }
    public void matchResult(View v){
        String result = "Team B needs " + (scoreTeamA - scoreTeamB) + " runs to win" ;
        if (scoreTeamB > scoreTeamA){
            result = "Team B won the Match";}
        if (scoreTeamA > scoreTeamB && wicketsB >= 10){
            result = "Team A won the Match";
        }
        if (scoreTeamB == scoreTeamA){
            result = "Match Tied";
        }
        displayForMatchResult(result);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamBWickets(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_wickets);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamAWickets(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_wickets);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForMatchResult(String message) {
        TextView matchResult = (TextView) findViewById(R.id.match_result);
        matchResult.setText(String.valueOf(message));
    }


}