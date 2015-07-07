package net.androidbootcamp.chapter_9_case_6;

import net.androidbootcamp.chapter_9_case_6.R;
import net.androidbootcamp.chapter_9_case_6.Tab1;
import net.androidbootcamp.chapter_9_case_6.Tab2;
import net.androidbootcamp.chapter_9_case_6.Tab3;
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
        photospec.setIndicator("Photos", getResources().getDrawable(R.drawable.tab2));
        Intent photosIntent = new Intent(this, Tab1.class);
        photospec.setContent(photosIntent);
        TabSpec tourspec = tabHost.newTabSpec("Tour");
        tourspec.setIndicator("Tour",
        getResources().getDrawable(R.drawable.tab1));
        Intent tourIntent = new Intent(this, Tab2.class);
        tourspec.setContent(tourIntent);
        TabSpec webspec = tabHost.newTabSpec("Web Site");
        webspec.setIndicator("Web Site",
        getResources().getDrawable(R.drawable.tab3));
        Intent webIntent = new Intent(this, Tab3.class);
        webspec.setContent(webIntent);
        tabHost.addTab(photospec);
        tabHost.addTab(webspec);
        tabHost.addTab(tourspec);
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
