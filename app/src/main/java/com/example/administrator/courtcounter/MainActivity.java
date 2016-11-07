package com.example.administrator.courtcounter;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewTeam1;
    private TextView textViewTeam2;
    int a;
    int b;
    AlertDialog gameOverAlert;
    private MediaPlayer soundFX;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewTeam1 = (TextView)findViewById( R.id.textViewAdd1 );
        a=0;
        textViewTeam1.setText(""+a);

        textViewTeam2 = (TextView)findViewById( R.id.textViewAdd2 );
        a=0;
        textViewTeam2.setText(""+b);

        soundFX = MediaPlayer.create(this, R.raw.buttonhitfx);
        gameOverAlert= new AlertDialog.Builder(MainActivity.this).create();}



    public void clickAdd1(View view) {
        a++;
        textViewTeam1.setText(""+a);
        soundFX.seekTo(0);
        soundFX.start();
    }

    public void clickAdd2(View view) {
        b++;
        textViewTeam2.setText(""+b);
        soundFX.seekTo(0);
        soundFX.start();
    }
    

    public void clickSub1(View view) {
        a--;
        textViewTeam1.setText(""+a);
        soundFX.seekTo(0);
        soundFX.start();
    }


    public void clickSub2(View view) {
        b--;
        textViewTeam2.setText(""+b);
        soundFX.seekTo(0);
        soundFX.start();
        }

    public void clickGameOver(View view) {
        gameOverAlert.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        gameOverAlert.setTitle("Game Over!");
        gameOverAlert.setMessage("The game is a tie!");
        if (a > b) {
            gameOverAlert.setMessage("Team 1 wins");
        }

        if (b > a) {
            gameOverAlert.setMessage("Team 2 wins");
        }
        textViewTeam1.setText("0");
        textViewTeam2.setText("0");
        a=0;
        b=0;
        gameOverAlert.show();
    }



}
