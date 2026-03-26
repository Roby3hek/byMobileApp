package com.example.eqs;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class him_chistka extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_him_chistka);

        ImageButton backspaceGamePad = (ImageButton) findViewById(R.id.backspaceGamePad);

        View.OnClickListener oclbackspaceGamePad = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(him_chistka.this, catalog.class);
                startActivity(intent);
            }
        };
        backspaceGamePad.setOnClickListener(oclbackspaceGamePad);

        TextView contacts3 = (TextView) findViewById(R.id.contacts3);
        View.OnClickListener oclcontacts3 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(him_chistka.this, MainActivity.class);
                startActivity(intent);
            }
        };
        contacts3.setOnClickListener(oclcontacts3);

        TextView contacts2 = (TextView) findViewById(R.id.contacts2);
        View.OnClickListener oclcontacts2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(him_chistka.this, pay.class);
                startActivity(intent);
            }
        };
        contacts2.setOnClickListener(oclcontacts2);

        TextView contacts = (TextView) findViewById(R.id.contacts);
        View.OnClickListener oclcontacts = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(him_chistka.this, prjob.class);
                startActivity(intent);
            }
        };
        contacts.setOnClickListener(oclcontacts);

        ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton);
        View.OnClickListener oclimageButton = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.instagram.com/roby3hek/"));
                startActivity(browserIntent);
            }
        };
        imageButton.setOnClickListener(oclimageButton);

        ImageButton imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        View.OnClickListener oclimageButton2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://vk.com/be1kaeb"));
                startActivity(browserIntent);
            }
        };
        imageButton2.setOnClickListener(oclimageButton2);

        ImageButton imgButtonHim = (ImageButton) findViewById(R.id.imgButtonHim);
        View.OnClickListener oclimgButtonHim = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(him_chistka.this, zxc_him.class);
                startActivity(intent);
            }
        };
        imgButtonHim.setOnClickListener(oclimgButtonHim);
    }

}