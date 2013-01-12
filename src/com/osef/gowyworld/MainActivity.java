package com.osef.gowyworld;

import com.osef.gowyworld.ActivityA;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

	private static int codeRetour = 1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menuprincipal, menu);
		return super.onCreateOptionsMenu(menu);
	}

	public boolean onOptionsItemSelected(MenuItem item) {

			if (item.getItemId() == R.id.itemOptions) {
				startActivityForResult(new Intent(this, AppliPreference.class), codeRetour);
			}
		
		return super.onOptionsItemSelected(item);
	}
	
	public void goActivityA (View v) {
		Intent intent = new Intent(this,ActivityA.class);
        startActivity(intent);
	}
	
	public void goSauvegarde (View v) {
		Intent intent = new Intent(this,Sauvegarde.class);
        startActivity(intent);
	}	
	
}
