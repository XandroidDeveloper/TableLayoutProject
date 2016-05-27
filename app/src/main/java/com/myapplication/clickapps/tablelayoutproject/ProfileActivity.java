package com.myapplication.clickapps.tablelayoutproject;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;


public class ProfileActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Bundle extras = getIntent().getExtras();
        String Name = extras.getString("Name");
        String Address = extras.getString("Address");

        TextView lbl_name = (TextView) findViewById(R.id.lbl_name);
        lbl_name.setText(Name);

        Typeface tface = Typeface.createFromAsset(this.getAssets(), "horror.ttf");
        lbl_name.setTypeface(tface);

        TextView lbl_Address = (TextView) findViewById(R.id.lbl_address);
        lbl_Address.setText(Address);

    }
}
