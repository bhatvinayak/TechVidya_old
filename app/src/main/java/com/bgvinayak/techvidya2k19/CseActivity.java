package com.bgvinayak.techvidya2k19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class CseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse);
    }

    public void event1(View view)
    {
        Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forms.gle/uADYSmJhdBsWG8ts6"));
        startActivity(intent3);
    }

    public void event2(View view)
    {
        Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forms.gle/KU8zJfe5TWfAdFKJA"));
        startActivity(intent3);
    }

    public void event3(View view)
    {
        Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forms.gle/9qCzt9dyx922qzX76"));
        startActivity(intent3);
    }

    public void event4(View view)
    {
        Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forms.gle/6GBvw5S1LwjrLNfq7"));
        startActivity(intent3);
    }

    public void event5(View view)
    {
        Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forms.gle/xL5AVk3fR5VpKv2K7"));
        startActivity(intent3);
    }

    public void event6(View view)
    {
        Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forms.gle/SHewnHjPXThxJmzc8"));
        startActivity(intent3);
    }

    public void event7(View view)
    {
        Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forms.gle/ctNiF7NPmafFrqkD9"));
        startActivity(intent3);
    }

    public void event8(View view)
    {
        Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forms.gle/7Kj3zUpbtf6vNpM26"));
        startActivity(intent3);
    }

    public void event9(View view)
    {
        Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forms.gle/zvwmntr3zHJ4rsxt5"));
        startActivity(intent3);
    }

    public void event10(View view)
    {
        Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forms.gle/hoNqb4rg5BtiVETV9"));
        startActivity(intent3);
    }
}
