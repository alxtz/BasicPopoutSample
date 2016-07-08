package com.example.bj.testpopoutandsavedatabase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startPopoutWindow(View v)
    {
        Log.d("MyLog" , "This should popout !");

        Intent popoutWindowIntent = new Intent(this , pop.class);
        startActivity(popoutWindowIntent);
    }
}
