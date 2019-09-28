package com.bgvinayak.techvidya2k19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class EceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ece);
    }

    public void event1(View view)
    {
        Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forms.gle/s5wJZZ7YV1xq9JzD6"));
        startActivity(intent3);
    }

    public void event2(View view)
    {
        Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forms.gle/aLsamoywUkmVbUep8"));
        startActivity(intent3);
    }

    public void event3(View view)
    {
        Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forms.gle/ag8xksyCNJBZciiA6"));
        startActivity(intent3);
    }
}
