package com.bgvinayak.techvidya2k19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EventsActivity extends AppCompatActivity {

    private Button cse,ece,me,civil,eee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        cse = (Button) findViewById(R.id.button);
        cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCseActivity();
            }
        });

        ece = (Button) findViewById(R.id.button2);
        ece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEceActivity();
            }
        });

        civil = (Button) findViewById(R.id.button3);
        civil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCivilActivity();
            }
        });

        me = (Button) findViewById(R.id.button4);
        me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMechActivity();
            }
        });




    }

    public void openCseActivity()
    {
        Intent intent1 = new Intent(this,CseActivity.class);
        startActivity(intent1);
    }

    public void openEceActivity()
    {
        Intent intent1 = new Intent(this,EceActivity.class);
        startActivity(intent1);
    }

    public void openCivilActivity()
    {
        Intent intent1 = new Intent(this,CivilActivity.class);
        startActivity(intent1);
    }

    public void openMechActivity()
    {
        Intent intent1 = new Intent(this,MechActivity.class);
        startActivity(intent1);
    }


}
