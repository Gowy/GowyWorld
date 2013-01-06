package com.osef.gowyworld;

import com.osef.gowyworld.utility.StatutActivity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.support.v4.app.NavUtils;

public class ActivityA extends Activity {

	private StatutActivity statutClass;
	private TextView statutAff;
	private String typeStatut = "";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activitya);
		// Show the Up button in the action bar.
		statutAff = (TextView) findViewById(R.id.editTextA);
		statutClass = new StatutActivity();
		String tmpStatut = ""+this;
		typeStatut = "A("+(tmpStatut.split("@")[1])+")";
				
		//getActionBar().setDisplayHomeAsUpEnabled(true);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_activitya, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public void startActivityB(View v) {
		statutClass.AddInfo(typeStatut, "startActivityB");
		statutClass.ShowInfo(statutAff);
		Intent intent = new Intent(this,ActivityB.class);
        startActivity(intent);		
	}
	
	
	public void stopActivityA(View v) {
		statutClass.AddInfo(typeStatut, "stopActivityA");
		statutClass.ShowInfo(statutAff);
		this.finish();
	}
	
	
	public void cleanActivity(View v) {
		statutClass.cleanInfo();
		statutClass.ShowInfo(statutAff);
	}


	protected void onPause() {
		super.onPause();
		statutClass.AddInfo(typeStatut,"onPause()");
		statutClass.ShowInfo(statutAff);
	}
	
	protected void onStart() {
		super.onStart();
		statutClass.AddInfo(typeStatut,"onStart()");
		statutClass.ShowInfo(statutAff);
	}
	
	protected void onRestart() {
		super.onRestart();
		statutClass.AddInfo(typeStatut,"onRestart()");
		statutClass.ShowInfo(statutAff);
	}	
	
	protected void onResume() {
		super.onResume();
		statutClass.AddInfo(typeStatut,"onResume()");
		statutClass.ShowInfo(statutAff);
	}
	
	protected void onPostResume() {
		super.onPostResume();
		statutClass.AddInfo(typeStatut,"onPostResume()");
		statutClass.ShowInfo(statutAff);
	}	
	
	protected void onStop() {
		super.onStop();
		statutClass.AddInfo(typeStatut,"onStop()");
		statutClass.ShowInfo(statutAff);
	}
	
	protected void onUserLeaveHint() {
		super.onUserLeaveHint();
		statutClass.AddInfo(typeStatut,"onUserLeaveHint()");
		statutClass.ShowInfo(statutAff);
	}	
	
	
	
}
