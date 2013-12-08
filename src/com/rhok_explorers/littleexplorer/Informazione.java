package com.rhok_explorers.littleexplorer;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Typeface;
import android.view.Menu;
import android.widget.TextView;

public class Informazione extends Activity {

	TextView titolo, informazione;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_informazione);
		
		Typeface typeFace = Typeface.createFromAsset(getAssets(), "fonts/Action_Man.ttf");
		
		titolo = (TextView)findViewById(R.id.titolo);
		informazione = (TextView)findViewById(R.id.informazione);
		
		titolo.setTypeface(typeFace);
		informazione.setTypeface(typeFace);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.informazione, menu);
		return true;
	}

}
