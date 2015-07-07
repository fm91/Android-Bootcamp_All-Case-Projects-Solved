package net.androidbootcamp.chapter_8_case_5;

import java.util.Calendar;

import android.app.Activity;
import android.app.TimePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Main extends Activity {
	private int currentMinute;
	private int currentHour;
	
	static final int TIME_DIALOG_ID = 0;
	private Button btTime;
	private TextView reservation;
	String service = "";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		btTime = (Button) findViewById(R.id.btnTime);
		reservation = (TextView)findViewById(R.id.txtReservation);
		
		btTime.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				showDialog(TIME_DIALOG_ID);	// TODO Auto-generated method stub
				
			}
			
		});
		final Calendar c = Calendar.getInstance();
		currentMinute = c.get(Calendar.MINUTE);
		currentHour = c.get(Calendar.HOUR_OF_DAY);
		
	}
	
	protected Dialog onCreateDialog(int id){
		switch (id) {
		case TIME_DIALOG_ID:
			
			return new TimePickerDialog(this, reservationTime, currentHour, currentMinute, false);
		
		}
		return null;
		
	}
	
	private	TimePickerDialog.OnTimeSetListener reservationTime = new TimePickerDialog.OnTimeSetListener() {

		@Override
		public void onTimeSet(TimePicker view, int hour, int minute) {
			RadioButton rad1 = (RadioButton) findViewById(R.id.radDinner1);
			RadioButton rad2 = (RadioButton) findViewById(R.id.radDinner2);
			RadioButton rad3 = (RadioButton) findViewById(R.id.radDinner3);
			RadioButton rad4 = (RadioButton) findViewById(R.id.radDinner4);
		
			if(rad1.isChecked()){
				service = rad1.getText().toString();
			}
			else if(rad2.isChecked()){
				service = rad2.getText().toString();
			}
			else if(rad3.isChecked()){
				service = rad3.getText().toString();
			}
			else if(rad4.isChecked()){
				service = rad4.getText().toString();
			}
			reservation.setText("Your dinner delivery for "+service+" is at " + hour+(":") + minute);
		}
	
		
	};

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
