package net.androidbootcamp.chapter_8_case_6;

import java.util.Calendar;

import net.androidbootcamp.chapter_8_case_6.R;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Main extends Activity {
	private int currentYear;
	private int currentMonth;
	private int currentDay;
	static final int DATE_DIALOG_ID = 0;
	private Button btDate;
	private TextView reservation;
	String service = "";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		btDate = (Button) findViewById(R.id.btnTime);
		reservation = (TextView)findViewById(R.id.txtReservation);
		
		btDate.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				showDialog(DATE_DIALOG_ID);	// TODO Auto-generated method stub
				
			}
			
		});
		final Calendar c = Calendar.getInstance();
		currentYear = c.get(Calendar.YEAR);
		currentMonth = c.get(Calendar.MONTH);
		currentDay = c.get(Calendar.DAY_OF_MONTH);
	}
	
	protected Dialog onCreateDialog(int id){
		switch (id) {
		case DATE_DIALOG_ID:
			
			return new DatePickerDialog(this, reservationDate, currentYear, currentMonth, currentDay);
		
		}
		return null;
		
	}
	
	private	DatePickerDialog.OnDateSetListener reservationDate = new DatePickerDialog.OnDateSetListener() {

		@Override
		public void onDateSet(DatePicker view, int year, int month,
				int day) {
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
			reservation.setText("Your reservation for "+service+" is set to " + (month + 1)+("-") + day + ("-") + year);// TODO Auto-generated method stub
			
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
