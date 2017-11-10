package com.lesson.craig.facebooktips;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.util.Linkify;
import android.widget.TextView;

public class TipsActivity extends AppCompatActivity {
    private TextView TextView1;
    //private TextView TextView2;
    private TextView TextView3;
    // private TextView TextView4;
    private TextView TextView5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);

        Intent intent = getIntent();
        TextView1 = (TextView) findViewById(R.id.TextView1);
        //TextView2 = (TextView)findViewById(R.id.TextView2);
        TextView3 = (TextView) findViewById(R.id.TextView3);
        //TextView4 = (TextView)findViewById(R.id.TextView4);
        TextView5 = (TextView) findViewById(R.id.TextView5);

        TextView1.setAutoLinkMask(Linkify.WEB_URLS);
        TextView1.setText(R.string.Admanager);

        //TextView2.setAutoLinkMask(Linkify.WEB_URLS);
        //TextView2.setText(R.string.Link2);

        TextView3.setAutoLinkMask(Linkify.WEB_URLS);
        TextView3.setText(R.string.Link3);

        //TextView4.setAutoLinkMask(Linkify.WEB_URLS);
        // TextView4.setText(R.string.Link4);

        TextView5.setAutoLinkMask(Linkify.WEB_URLS);
        TextView5.setText(R.string.Link5);


        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        // setSupportActionBar(toolbar);

        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
