package com.example.eqs;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class catalog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog);

        TextView contacts3 = (TextView) findViewById(R.id.contacts3);
        View.OnClickListener oclcontacts3 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(catalog.this, MainActivity.class);
                startActivity(intent);
            }
        };
        contacts3.setOnClickListener(oclcontacts3);

        TextView contacts2 = (TextView) findViewById(R.id.contacts2);
        View.OnClickListener oclcontacts2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(catalog.this, pay.class);
                startActivity(intent);
            }
        };
        contacts2.setOnClickListener(oclcontacts2);

        TextView contacts = (TextView) findViewById(R.id.contacts);
        View.OnClickListener oclcontacts = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(catalog.this, prjob.class);
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

        ImageButton imgBtnSan= (ImageButton) findViewById(R.id.imgBtnSan);
        View.OnClickListener oclimgBtnSan = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(catalog.this, santehnik.class);
                startActivity(intent);
            }
        };
        imgBtnSan.setOnClickListener(oclimgBtnSan);

        ImageButton imgBtnEl = (ImageButton) findViewById(R.id.imgBtnEl);
        View.OnClickListener oclimgBtnEl = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(catalog.this, electric.class);
                startActivity(intent);
            }
        };
        imgBtnEl.setOnClickListener(oclimgBtnEl);

        ImageButton imgBtnRem = (ImageButton) findViewById(R.id.imgBtnRem);
        View.OnClickListener oclimgBtnRem = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(catalog.this, remont.class);
                startActivity(intent);
            }
        };
        imgBtnRem.setOnClickListener(oclimgBtnRem);

        ImageButton imgBtnHim = (ImageButton) findViewById(R.id.imgBtnHim);
        View.OnClickListener oclimgBtnHim = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(catalog.this, him_chistka.class);
                startActivity(intent);
            }
        };
        imgBtnHim.setOnClickListener(oclimgBtnHim);

        ImageButton imgBtnAuto = (ImageButton) findViewById(R.id.imgBtnAuto);
        View.OnClickListener oclimgBtnAuto = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(catalog.this, auto.class);
                startActivity(intent);
            }
        };
        imgBtnAuto.setOnClickListener(oclimgBtnAuto);

        ImageButton imgBtnServ = (ImageButton) findViewById(R.id.imgBtnServ);
        View.OnClickListener oclimgBtnServ = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(catalog.this, service.class);
                startActivity(intent);
            }
        };
        imgBtnServ.setOnClickListener(oclimgBtnServ);
    }
}