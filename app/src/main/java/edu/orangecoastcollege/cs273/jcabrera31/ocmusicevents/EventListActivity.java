package edu.orangecoastcollege.cs273.jcabrera31.ocmusicevents;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import java.io.IOException;
import java.util.ArrayList;

public class EventListActivity extends ListActivity {

    ListView eventListView;
    Context context = this;
    ArrayList<MusicEvent> allMusicEvents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        eventListView = (ListView) findViewById(R.id.eventsListView);
        try{

            allMusicEvents = JSONLoader.loadJSONFromAsset(context);
        }
        catch(IOException ex)
        {
            Log.e("OC Music Events", "Error loading JSON data" + ex.getMessage());
        }

        setListAdapter(new MusicEventAdapter(context, R.layout.music_event_list_item, allMusicEvents));

        //setContentView(R.layout.activity_event_list);
    }


    @Override
    protected void onListItemClick(ListView l, View v, int pos, long id)
    {

        MusicEvent clickedEvent = allMusicEvents.get(pos);

        String title = clickedEvent.getTitle();
        String date = clickedEvent.getDate();
        String day = clickedEvent.getDay();
        String time = clickedEvent.getTime();
        String location = clickedEvent.getLocation();
        String address1 = clickedEvent.getAddress1();
        String address2 = clickedEvent.getAddress2();


        Intent intent = new Intent(this, EventDetailsActivity.class);
        intent.putExtra("title", title);
        intent.putExtra("date", date);
        intent.putExtra("day", day);
        intent.putExtra("time", time);
        intent.putExtra("location", location);
        intent.putExtra("address1", address1);
        intent.putExtra("address2", address2);

        startActivity(intent);

    }
}
