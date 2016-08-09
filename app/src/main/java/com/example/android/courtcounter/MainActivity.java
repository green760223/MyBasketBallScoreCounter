package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //To initialize global variables
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int teamFoulForTeamA = 0;
    int teamFoulForTeamB = 0;

    //To declare rating bar.
    private RatingBar ratingBarTeamA;
    private RatingBar ratingBarTeamB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * To adds three points score for Team A.
     */
    public void addThreePointsForTeamA(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * To adds two points score for Team A.
     */
    public void addTwoPointsForTeamA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * To adds one points score for Team A.
     */
    public void addOnePointsForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * To adds Three points score for Team B.
     */
    public void addThreePointsForTeamB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * To adds Two points score for Team B.
     */
    public void addTwoPointsForTeamB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * To adds one points score for Team B.
     */
    public void addOnePointsForTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * To reset score and team foul for both team.
     */
    public void resetScore(View view) {
        displayForTeamA(0);
        displayForTeamB(0);
        ratingBarTeamA.setRating(0);
        ratingBarTeamB.setRating(0);
    }

    /**
     * To Displays team foul for team A.
     */
    public void teamFoulForTeamA(View view) {
        teamFoulForTeamA = teamFoulForTeamA + 1;
        ratingBarTeamA = (RatingBar) findViewById(R.id.ratingBarForTeamA);
        ratingBarTeamA.setRating(teamFoulForTeamA);
    }

    /**
     * To Displays team foul for team B.
     */
    public void teamFoulForTeamB(View view) {
        teamFoulForTeamB = teamFoulForTeamB + 1;
        ratingBarTeamB = (RatingBar) findViewById(R.id.ratingBarForTeamB);
        ratingBarTeamB.setRating(teamFoulForTeamB);
    }
}
