package com.example.bj.testpopoutandsavedatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.WindowManager;

public class pop extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int screenWidth = dm.widthPixels;
        int screenHeight = dm.heightPixels;

        //getWindow().setLayout( (int)(screenWidth*0.8) , (int)(screenHeight*0.6) );
        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.height = 800;
        params.width = 500;
        params.x = 0;
        params.y = -100;
        this.getWindow().setAttributes(params);
    }
}
