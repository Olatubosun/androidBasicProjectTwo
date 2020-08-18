package com.example.android.footballscoring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /**
     * declare score for team A to be a global variable(instance variable)
       tracks the scores for  team A
     */
    int scoreTeamA;
    /**
     * declare a global variable for the score for team b
     tracks the scores for  team B
     */
    int scoreTeamB;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
   /** displays 6points for team A
    */
    public void touchDownA(View view) {
        scoreTeamA += 6;
        displayForTeamA(scoreTeamA);
    }

    /** displays 3 points for tram A
     *
     * @param view = button +3 point at xml
     */

    public void threePointForA(View view) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    /** displays 2 points for tram A
     *
     * @param view= button +2point
     */
    public void twoPointForA(View view) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }
    /** displays 2 points for tram A
     *
     * @param view= button safety
     */
    public void safetyA(View view){
        scoreTeamA +=2;
        displayForTeamA(scoreTeamA);
    }
    /** displays 1 points for tram A
     *
     * @param view= button extra point
     */
    public void extraPointA(View view){
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    /** displays 6points for team B
     */
    public void touchDownB(View view) {
        scoreTeamB += 6;
        displayForTeamB(scoreTeamB);
    }

    /** displays 3 points for tram B
     *
     * @param view = button +3 point at xml
     */

    public void threePointForB(View view) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    /** displays 2 points for tram B
     *
     * @param view= button +2point
     */
    public void twoPointForB(View view) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }
    /** displays 2 points for tram B
     *
     * @param view= button safety
     */
    public void safetyB(View view){
        scoreTeamB +=2;
        displayForTeamB(scoreTeamB);
    }
    /** displays 1 points for tram B
     *
     * @param view= button extra point
     */
    public void extraPointB(View view){
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    /** returns the scores to zero
     *
     * @param view = button reset
     */
    public void reset (View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * this method calls for the score declared at xml for team A
      * @param score
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**this method calls for the score declared at xml for team B
     *
     * @param score
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


}
