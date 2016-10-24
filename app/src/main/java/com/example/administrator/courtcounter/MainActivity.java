package com.example.administrator.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewTeam1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewTeam1 = (TextView)findViewById( R.id.textViewAdd1 );
        textViewTeam1.setText("0");
    }

    public void clickAdd1(View view) {
        textViewTeam1.setText("1");
    }


}
