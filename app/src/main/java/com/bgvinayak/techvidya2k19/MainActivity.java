package com.bgvinayak.techvidya2k19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button eve,cnt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    eve = (Button) findViewById(R.id.button6);
    eve.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            openEventsActivity();
        }
    });

        cnt = (Button) findViewById(R.id.button8);
        cnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAboutActivity();
            }
        });
    }





    public void openEventsActivity()
    {
        Intent intent2 = new Intent(this,EventsActivity.class);
        startActivity(intent2);
    }

    public void openAboutActivity()
    {
        Intent intent2 = new Intent(this,AboutActivity.class);
        startActivity(intent2);
    }

}
