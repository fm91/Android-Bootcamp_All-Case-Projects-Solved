package net.androidbootcamp.chapter_9_case_2;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;


public class Main extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        TabHost tabHost = getTabHost();
      //First Tab
      TabSpec photospec = tabHost.newTabSpec("Photos");
      photospec.setIndicator("", getResources().getDrawable(R.drawable.tab1));
      Intent photosIntent = new Intent(this, Tab1.class);
      photospec.setContent(photosIntent);
      
      TabSpec webspec = tabHost.newTabSpec("Web Site");
      webspec.setIndicator("",
      getResources().getDrawable(R.drawable.tab2));
      Intent webIntent = new Intent(this, Tab2.class);
      webspec.setContent(webIntent);
      
      tabHost.addTab(photospec);
    
      tabHost.addTab(webspec);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
