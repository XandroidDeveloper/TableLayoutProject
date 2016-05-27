package com.myapplication.clickapps.tablelayoutproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txt_name;
    EditText txt_rolno;
    EditText txt_address;
    EditText txt_phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_info);

        txt_name = (EditText) findViewById(R.id.txt_name);
        txt_rolno = (EditText) findViewById(R.id.txt_rollno);
        txt_address = (EditText) findViewById(R.id.txt_address);
        txt_phone = (EditText) findViewById(R.id.txt_phone);

        Button cancelB = (Button) findViewById(R.id.cancelB);
        View.OnClickListener  cancelBListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        };
        cancelB.setOnClickListener(cancelBListener);

        Button submitB = (Button) findViewById(R.id.submitB);
        View.OnClickListener  submitBListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ( txt_name.getText().toString().isEmpty() )
                {
                    Toast.makeText(getBaseContext(), "Name Required !", Toast.LENGTH_SHORT).show();
                }
                else if ( txt_rolno.getText().toString().isEmpty())
                {
                    Toast.makeText(getBaseContext(), "Roll NO. Required !", Toast.LENGTH_SHORT).show();
                }
                else if (txt_address.getText().toString().isEmpty())
                {
                    Toast.makeText(getBaseContext(), "Address Required !", Toast.LENGTH_SHORT).show();
                }
                else if (txt_phone.getText().toString().isEmpty())
                {
                    Toast.makeText(getBaseContext(), "Phone Number Required !", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent intent = new Intent("com.myapplication.clickapps.tablelayoutproject.ProfileActivity");

                    //Passing info to ProfileActivity
                    Bundle extras = new Bundle();
                    extras.putString("Name", txt_name.getText().toString());
                    extras.putString("Address", txt_address.getText().toString());
                    intent.putExtras(extras);

                    startActivity(intent);
                }
            }
        };

        submitB.setOnClickListener(submitBListener);
    }
}
