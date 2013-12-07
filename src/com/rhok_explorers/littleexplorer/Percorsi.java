package com.rhok_explorers.littleexplorer;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Percorsi extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_percorsi);
		
		 ListView listView = (ListView)findViewById(R.id.ListPercorsi);
	     String[] array = {"Percorso 1","Percorso Marmotta","Percorso Gabbiano"};
	     ArrayAdapter <String> arrayAdapter =
	    		 new ArrayAdapter<String>(this, R.layout.row, R.id.textViewList, array);
	     listView.setAdapter(arrayAdapter);
	 
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.percorsi, menu);
		return true;
	}

}
