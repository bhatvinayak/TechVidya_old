package com.bgvinayak.techvidya2k19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class CivilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil);
    }

    public void event1(View view)
    {
        Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forms.gle/KViWUxXW9PZ4dsCk6"));
        startActivity(intent3);
    }

    public void event2(View view)
    {
        Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forms.gle/cWtMX8iVxS4xGEr88"));
        startActivity(intent3);
    }

    public void event3(View view)
    {
        Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forms.gle/yt47DNyFTfkGN9Kj8"));
        startActivity(intent3);
    }
}
