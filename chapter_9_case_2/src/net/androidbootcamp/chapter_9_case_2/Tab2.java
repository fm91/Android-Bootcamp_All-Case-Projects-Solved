package net.androidbootcamp.chapter_9_case_2;

import net.androidbootcamp.chapter_9_case_2.R;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;


public class Tab2 extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab2);
		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://mbn.com/")));
	}

}

