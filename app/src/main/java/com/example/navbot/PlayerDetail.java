package com.example.navbot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PlayerDetail extends AppCompatActivity {
    ImageView imageView;
    TextView name,role;
    String player_name,player_role;
    int image_id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_detail);

        imageView =findViewById(R.id.image);
        name =  findViewById(R.id.name);
        role = findViewById(R.id.role);

        player_name = getIntent().getStringExtra("name");
        player_role = getIntent().getStringExtra("role");
        image_id = getIntent().getIntExtra("image",0);

        imageView.setImageDrawable(getApplicationContext().getResources().getDrawable(image_id));
        // imageView.setImageResource(image_id);
        name.setText(player_name);
        role.setText(player_role);


    }
}
