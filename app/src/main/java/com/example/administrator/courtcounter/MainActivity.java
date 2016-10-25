package com.example.administrator.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewTeam1;
    private TextView textViewTeam2;
    int a;
    int b;


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

    }

    public void clickAdd1(View view) {
        a++;
        textViewTeam1.setText(""+a);
    }
    public void clickAdd2(View view) {
        b++;
        textViewTeam2.setText(""+b);
    }

    public void clickReset(View view) {
        textViewTeam1.setText("0");
        textViewTeam2.setText("0");
        a=0;
        b=0;
    }
}
