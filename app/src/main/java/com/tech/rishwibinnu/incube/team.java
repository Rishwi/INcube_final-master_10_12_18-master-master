package com.tech.rishwibinnu.incube;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class team extends AppCompatActivity {

    TextView rtv,stv,ratv,htv,mtv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);

        rtv = findViewById(R.id.rishwitxt);
        stv = findViewById(R.id.saitxt);
        ratv = findViewById(R.id.ravindertxt);
        htv = findViewById(R.id.madhavitxt);
        mtv = findViewById(R.id.hodtxt);

        rtv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(team.this,RishwiActivity.class);
                startActivity(i);

            }
        });

        stv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(team.this,SaiActivity.class);
                startActivity(i);

            }
        });

        ratv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(team.this,RavinderActivity.class);
                startActivity(i);

            }
        });

        mtv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(team.this,MadhaviActivity.class);
                startActivity(i);

            }
        });

        htv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(team.this,HodActivity.class);
                startActivity(i);

            }
        });



    }
}
