package com.example.eqs;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class zxc_el extends AppCompatActivity {
    RadioButton radioButton;
    RadioGroup radioGroup;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zxc_el);

        radioGroup = findViewById(R.id.radioGroup4);
        TextView itog = findViewById(R.id.itog);
        ImageButton oclgoPayButton = findViewById(R.id.goPayButton);
        RadioButton oclrb = findViewById(R.id.radioButton);
        RadioButton oclrb2 = findViewById(R.id.radioButton2);
        RadioButton oclrb3 = findViewById(R.id.radioButton3);
        int radioId =radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.radioButton:
                        itog.setText("5000 рублей");
                        break;
                    case R.id.radioButton2:
                        itog.setText("7000 рублей");
                        break;
                    case R.id.radioButton3:
                        itog.setText("6000 рублей");
                        break;
                }
            }
        });

        oclgoPayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        ImageButton backspaceGamePad = (ImageButton) findViewById(R.id.backspaceGamePad);
        View.OnClickListener oclbackspaceGamePad = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(zxc_el.this, electric.class);
                startActivity(intent);
            }
        };
        backspaceGamePad.setOnClickListener(oclbackspaceGamePad);

        TextView contacts3 = (TextView) findViewById(R.id.contacts3);
        View.OnClickListener oclcontacts3 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(zxc_el.this, MainActivity.class);
                startActivity(intent);
            }
        };
        contacts3.setOnClickListener(oclcontacts3);

        TextView contacts2 = (TextView) findViewById(R.id.contacts2);
        View.OnClickListener oclcontacts2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(zxc_el.this, pay.class);
                startActivity(intent);
            }
        };
        contacts2.setOnClickListener(oclcontacts2);

        TextView contacts = (TextView) findViewById(R.id.contacts);
        View.OnClickListener oclcontacts = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(zxc_el.this, prjob.class);
                startActivity(intent);
            }
        };
        contacts.setOnClickListener(oclcontacts);

        ImageButton  ImgButtonEl = (ImageButton) findViewById(R.id.goPayButton);

        View.OnClickListener oclImgButtonEl = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://a0784668.xsph.ru/index_el.php"));
                startActivity(browserIntent);
            }
        };
        ImgButtonEl.setOnClickListener(oclImgButtonEl);

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
    }
}