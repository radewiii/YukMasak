package com.exp002;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.exp002.R;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

       CardView makan = (CardView) findViewById(R.id.makan);
        CardView disert = (CardView) findViewById(R.id.disert);
       CardView sms = (CardView) findViewById(R.id.sms);

        makan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this,MakanActivity.class);
                MenuActivity.this.startActivity(intent);
            }
        });

        disert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this,DessertActivity.class);
                MenuActivity.this.startActivity(intent);
            }
        });
        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this,SmothiesActivity.class);
                MenuActivity.this.startActivity(intent);
            }
        });


    }
}
