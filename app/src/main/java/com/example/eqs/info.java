package com.example.eqs;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        TextView contacts3 = (TextView) findViewById(R.id.contacts3);
        View.OnClickListener oclcontacts3 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(info.this, MainActivity.class);
                startActivity(intent);
            }
        };
        contacts3.setOnClickListener(oclcontacts3);

        TextView contacts2 = (TextView) findViewById(R.id.contacts2);
        View.OnClickListener oclcontacts2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(info.this, pay.class);
                startActivity(intent);
            }
        };
        contacts2.setOnClickListener(oclcontacts2);

        TextView contacts = (TextView) findViewById(R.id.contacts);
        View.OnClickListener oclcontacts = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(info.this, prjob.class);
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

        //копирование по нажатию на кнопку
        TextView copy = (TextView) findViewById(R.id.copy);
        copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager myClipboard;
                ClipData myClip;
                imageButton2.setOnClickListener(oclimageButton2);
                myClipboard = (ClipboardManager)getSystemService(CLIPBOARD_SERVICE);
                String text = copy.getText().toString();
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Cкопировано",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}