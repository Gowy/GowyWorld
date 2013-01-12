package com.osef.gowyworld.sauvegarde;

import com.osef.gowyworld.R;
import com.osef.gowyworld.R.layout;
import com.osef.gowyworld.R.menu;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.support.v4.app.NavUtils;

public class Sauvegarde1 extends Activity {

	
	public static final String SAVE_NAME = "com.osef.gowyworld.sauvegarde1";
	private String saveText = "";
	private TextView textviewSave;
	private SharedPreferences settings;
	private EditText textEd;
	private String key1 = "Sauvegarde1";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sauvegarde1);
		textviewSave = (TextView)findViewById(R.id.textView2);
		textEd = (EditText)findViewById(R.id.editTextSauve);
		settings = getSharedPreferences(SAVE_NAME, 0);
		showSauvegarde();
		
		SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
		
		String comptes = prefs.getString("valeur_compte", "compte inexistant");
		String Alerte = prefs.getString("sync_frequency", "aucune frequence");
		
		String[] values = new String[] { "Compte : "+comptes, "Frequence Alerte : "+Alerte };
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				  android.R.layout.simple_list_item_1, android.R.id.text1, values);
		
		ListView test = (ListView) findViewById(R.id.list1);
		test.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_sauvegarde1, menu);
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
	
	
	private void showSauvegarde() {
		saveText = settings.getString(key1, "VIDE Pour Le Moment");
		textviewSave.setText(saveText);	
	}
	
	public void addSauvegarde (View v) {
		String tmp = textEd.getText().toString();
		SharedPreferences.Editor editorTmp = settings.edit();
		editorTmp.putString(key1, tmp);
		editorTmp.commit();
		showSauvegarde();
	}	
	
	public void cleanSauvegarde (View v) {
		SharedPreferences.Editor editorTmp = settings.edit();
		editorTmp.clear();
		editorTmp.commit();		
		textEd.setText("");
		showSauvegarde();
		
	}	
	
	public void stopSauvegarde (View v) {	
		this.finish();
	}

}
