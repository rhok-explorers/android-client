package com.rhok_explorers.littleexplorer;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Typeface;
import android.view.Menu;
import android.widget.TextView;

public class Diario extends Activity {
	
	TextView numberpunteggio;
	TextView numbermedaglie;
	TextView numberpercorsi;
	TextView numberpercorsiNO;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_diario);

		
		Typeface typeFace = Typeface.createFromAsset(getAssets(), "fonts/Action_Man.ttf");
		
		
		TextView textpunteggio = (TextView) findViewById (R.id.textpunteggio);
		TextView textmedaglie = (TextView) findViewById (R.id.textmedaglie);
		TextView textpercorsi = (TextView) findViewById (R.id.textpercorsi);
		TextView textpercorsiNO = (TextView) findViewById (R.id.textpercorsiNO);

		numberpunteggio = (TextView) findViewById (R.id.numberpunteggio);
		numbermedaglie = (TextView) findViewById (R.id.numbermedaglie);
		numberpercorsi = (TextView) findViewById (R.id.numberpercorsi);
		numberpercorsiNO = (TextView) findViewById (R.id.numberpercorsiNO);
		
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
