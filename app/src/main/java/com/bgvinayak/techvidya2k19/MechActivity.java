package com.bgvinayak.techvidya2k19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MechActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mech);
    }

    public void event1(View view)
    {
        Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forms.gle/ZsQafCqurtomvLHf6"));
        startActivity(intent3);
    }

    public void event2(View view)
    {
        Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forms.gle/W87LdjaVC6AdyCdU8"));
        startActivity(intent3);
    }

    public void event3(View view)
    {
        Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forms.gle/EKcKrPM7sLYYCaRL8"));
        startActivity(intent3);
    }

    public void event4(View view)
    {
        Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forms.gle/HJPDS6ipHHnE4NCv9"));
        startActivity(intent3);
    }
}
