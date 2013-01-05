package com.example.test;

//import java.util.Calendar;
import java.util.GregorianCalendar;

import android.os.Bundle;
import android.provider.CalendarContract;
import android.provider.CalendarContract.Events;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
//import android.widget.Toast;

public class TestActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_test, menu);
        return true;
    }
    
    public void buttonHandler(View v) {
//    	Toast toast = Toast.makeText(getApplicationContext(), "Evalla", Toast.LENGTH_SHORT);
//	    toast.show(); 
    	
//    	Calendar cal = Calendar.getInstance();              
//    	Intent intent = new Intent(Intent.ACTION_EDIT);
//    	intent.setType("vnd.android.cursor.item/event");
//    	intent.putExtra("beginTime", cal.getTimeInMillis());
//    	intent.putExtra("allDay", false);
//    	intent.putExtra("rrule", "FREQ=DAILY");
//    	intent.putExtra("endTime", cal.getTimeInMillis()+60*60*1000);
//    	intent.putExtra("title", "A Test Event from android app");
//    	startActivity(intent);
    	
    	Intent intent = new Intent(Intent.ACTION_INSERT);
    	intent.setData(CalendarContract.Events.CONTENT_URI);
    	startActivity(intent); 
    	
    	/*
    	Intent intent = new Intent(Intent.ACTION_INSERT);
    	intent.setType("vnd.android.cursor.item/event");
    	intent.putExtra(Events.TITLE, "Learn Android");
    	intent.putExtra(Events.EVENT_LOCATION, "Home suit home");
    	intent.putExtra(Events.DESCRIPTION, "Download Examples");

    	// Setting dates
    	GregorianCalendar calDate = new GregorianCalendar(2013, 01, 06);
    	intent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
    	  calDate.getTimeInMillis());
    	intent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
    	  calDate.getTimeInMillis());

    	// Make it a full day event
    	intent.putExtra(CalendarContract.EXTRA_EVENT_ALL_DAY, true);

    	// Make it a recurring Event
    	intent.putExtra(Events.RRULE, "FREQ=WEEKLY;COUNT=11;WKST=SU;BYDAY=TU,TH");

    	// Making it private and shown as busy
    	intent.putExtra(Events.ACCESS_LEVEL, Events.ACCESS_PRIVATE);
    	intent.putExtra(Events.AVAILABILITY, Events.AVAILABILITY_BUSY); 
    	*/
    }
    
}
