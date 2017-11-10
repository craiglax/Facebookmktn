package com.lesson.craig.facebooktips;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import static com.lesson.craig.facebooktips.R.layout.activity_main;

public class MainActivity extends AppCompatActivity {
    private static String webUrl = "https://www.hubspot.com/facebook-marketing";
    private static String weblink = "https://www.hubspot.com/facebook-marketing";
    private static String email = "craig.hlatywayo@gmail.com";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] addresses = {email};
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL, addresses);
                intent.putExtra(Intent.EXTRA_SUBJECT, "information request");
                intent.putExtra(Intent.EXTRA_TEXT, "Please send some information!");
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {

            //noinspection SimplifiableIfStatement
            case R.id.consultants:
                startActivity(new Intent(this, MainActivity.class));
                return true;

            case R.id.more:
                Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(webUrl));
                if (webIntent.resolveActivity(getPackageManager()) != null) {
                }
                startActivity(webIntent);
                return true;

            case R.id.next:
                item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Intent intent = new Intent(MainActivity.this, TipsActivity.class);
                        startActivity(intent);
                        return true;
                    }
                });
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }


    }

    private void startTips() {
        Intent intent = new Intent(this, TipsActivity.class);
        startActivity(intent);
    }

}








