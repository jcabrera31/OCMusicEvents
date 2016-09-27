package edu.orangecoastcollege.cs273.jcabrera31.ocmusicevents;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class EventDetailsActivity extends AppCompatActivity {

    private ImageView eventImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_details);

        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String details = intent.getStringExtra("details");
        String imageFileName = title.replace(" ", "")+".png";

        eventImageView = (ImageView) findViewById(R.id.eventImageView);

        //load the iamge from the Assets folder using the AssetManager class
        
    }
}
