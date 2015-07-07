package net.androidbootcamp.chapter_9_tutorial;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class Tab1 extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab1);
		GridView g = (GridView) findViewById(R.id.photos);
		g.setAdapter(new ImageAdapter(this));
	}
	public class ImageAdapter extends BaseAdapter {
		private Context context;
		private Integer[] Bikes = { R.drawable.bike1, R.drawable.bike2,
				R.drawable.bike3, R.drawable.bike4, R.drawable.bike5, R.drawable.bike6};
		public ImageAdapter(Context c){
			context = c;
			// TODO Auto-generated constructor stub
		}

		@Override
		public int getCount() {
			return Bikes.length;	// TODO Auto-generated method stub
		
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
			public View getView(int position, View convertView, ViewGroup parent) {
				// TODO Auto-generated method stub
				ImageView pic = new ImageView(context);
				pic.setLayoutParams(new GridView.LayoutParams(275, 250));
				pic.setScaleType(ImageView.ScaleType.CENTER_CROP);
				pic.setPadding(8, 8, 8, 8);
				pic.setImageResource(Bikes[position]);
				return pic;
				};	// TODO Auto-generated method stub
			
		}
		
	}

