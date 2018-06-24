package com.example.ankush.nightmode_daymode;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Switch sw1;
    LinearLayout lay1;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sw1 = (Switch)findViewById(R.id.sw1);
        lay1 = (LinearLayout)findViewById(R.id.lay1);
        tv = (TextView)findViewById(R.id.tv);

        sw1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    lay1.setBackgroundColor(Color.BLACK);
                    tv.setTextColor(Color.WHITE);
                    sw1.setText("DAY ");
                    sw1.setTextColor(Color.WHITE);

                }
                else {
                    lay1.setBackgroundColor(Color.WHITE);
                    tv.setTextColor(Color.BLACK);
                    sw1.setText("NIGHT ");
                    sw1.setTextColor(Color.BLACK);
                }

            }
        });


    }
}
