package com.example.proyecto1__is;

import android.Manifest;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageButton imageButton5;
    private ImageButton imageButton7;
    private ImageButton imageButton10;
    private ImageButton imageButton12;
    private ImageButton imageButton13;
    private ImageButton imageButton15;
    private ImageButton imageButton16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButton5 = (ImageButton) findViewById(R.id.imageButton5);
        imageButton7 = (ImageButton) findViewById(R.id.imageButton7);
        imageButton10 = (ImageButton) findViewById(R.id.imageButton10);
        imageButton12 = (ImageButton) findViewById(R.id.imageButton12);
        imageButton13 = (ImageButton) findViewById(R.id.imageButton13);
        imageButton15 = (ImageButton) findViewById(R.id.imageButton15);
        imageButton16 = (ImageButton) findViewById(R.id.imageButton16);

        imageButton15.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"No me gusta :(",Toast.LENGTH_LONG).show();
            }

        });

        imageButton16.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"No me gusta :(",Toast.LENGTH_LONG).show();
            }

        });

        imageButton12.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Me gusta ;)",Toast.LENGTH_LONG).show();
            }

        });

        imageButton13.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Me gusta ;)",Toast.LENGTH_LONG).show();
            }

        });

        imageButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

        imageButton5.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                /*Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                startActivity(Intent.createChooser(intent, "Share with"));
                startActivity(intent);*/
                shareIt();
            }
            private void shareIt(){
                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareBody = "Here is the share content body";
                startActivity(Intent.createChooser(sharingIntent, "Share with:"));
            }

        });

        imageButton7.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                shareIt();
            }

            private void shareIt(){
                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareBody = "Here is the share content body";
                startActivity(Intent.createChooser(sharingIntent, "Share with:"));
            }
        });





    }
}
