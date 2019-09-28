package com.bgvinayak.techvidya2k19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    public void onClickfb(View view)
    {
        Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/SaiVidyaInstituteOfTechnology"));
        startActivity(intent3);
    }

    public void onClickinsta(View view)
    {
        Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/sai_vidya_institute_of_tech"));
        startActivity(intent3);
    }

    public void onClicktwitter(View view)
    {
        Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/SaividyaIT"));
        startActivity(intent3);
    }

    public void onClicklinkedin(View view)
    {
        Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/school/sai-vidya-institute-of-technology/about"));
        startActivity(intent3);
    }

    public void onClickmfb(View view)
    {
        Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/vinayak.bhat.777701"));
        startActivity(intent3);
    }

    public void onClickminsta(View view)
    {
        Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/b_g_vinayak"));
        startActivity(intent3);
    }

    public void onClickmtwitter(View view)
    {
        Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/BGVinayak64"));
        startActivity(intent3);
    }

    public void onClickmlinkedin(View view)
    {
        Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/vinayak-b-g-8343ab180"));
        startActivity(intent3);
    }
}
