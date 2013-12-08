package com.rhok_explorers.littleexplorer;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Typeface;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Diario extends Activity {
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_diario);

		
		Typeface typeFace = Typeface.createFromAsset(getAssets(), "fonts/Action_Man.ttf");
		
		
		TextView textpunteggio = (TextView) findViewById (R.id.textpunteggio);
		TextView textmedaglie = (TextView) findViewById (R.id.textmedaglie);
		TextView textpercorsi = (TextView) findViewById (R.id.textpercorsi);
		TextView textpercorsiNO = (TextView) findViewById (R.id.textpercorsiNO);

		TextView numberpunteggio = (TextView) findViewById (R.id.numberpunteggio);
		TextView numbermedaglie = (TextView) findViewById (R.id.numbermedaglie);
		TextView numberpercorsi = (TextView) findViewById (R.id.numberpercorsi);
		TextView numberpercorsiNO = (TextView) findViewById (R.id.numberpercorsiNO);
		
		textpunteggio.setTypeface(typeFace);
		textmedaglie.setTypeface(typeFace);
		textpercorsi.setTypeface(typeFace);
		textpercorsiNO.setTypeface(typeFace);
		numberpunteggio.setTypeface(typeFace);
		numbermedaglie.setTypeface(typeFace);
		numberpercorsi.setTypeface(typeFace);
		numberpercorsiNO.setTypeface(typeFace);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.diario, menu);
		return true;
	}

}
