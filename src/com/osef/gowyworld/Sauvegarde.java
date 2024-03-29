package com.osef.gowyworld;

import com.osef.gowyworld.sauvegarde.Sauvegarde1;
import com.osef.gowyworld.sauvegarde.Sauvegarde2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.support.v4.app.NavUtils;

public class Sauvegarde extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sauvegarde);
		// Show the Up button in the action bar.
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_sauvegarde, menu);
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

	
	public void goSauvegarde1 (View v) {
		Intent intent = new Intent(this,Sauvegarde1.class);
        startActivity(intent);
	}		
		
	public void goSauvegarde2 (View v) {
		Intent intent = new Intent(this,Sauvegarde2.class);
        startActivity(intent);
	}	
	
	public void goSauvegarde3 (View v) {
		Log.d(ACTIVITY_SERVICE,"goSauvegarde3()");
	}	
	
	public void goSauvegarde4 (View v) {
		Log.d(ACTIVITY_SERVICE,"goSauvegarde4()");
	}
	
	public void retour (View v) {
		this.finish();
	}
	
	
}
