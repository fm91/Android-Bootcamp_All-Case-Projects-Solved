package net.androidbootcamp.chapter_9_case_1;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class Tab3 extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab3);
		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sushifaq.com/")));
	}

}
