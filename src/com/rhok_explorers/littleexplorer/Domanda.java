package com.rhok_explorers.littleexplorer;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Typeface;
import android.view.Menu;
import android.widget.Button;
import android.widget.TextView;

public class Domanda extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_domanda);
		
		Typeface typeFace = Typeface.createFromAsset(getAssets(), "fonts/Action_Man.ttf");
		
		
		Button risposta1 = (Button) findViewById (R.id.risposta1);
		Button risposta2 = (Button) findViewById (R.id.risposta2);
		Button risposta3 = (Button) findViewById (R.id.risposta3);
		Button risposta4 = (Button) findViewById (R.id.risposta4);

		TextView domanda = (TextView) findViewById (R.id.domanda);
		TextView titolo = (TextView) findViewById (R.id.titolone);
		
		domanda.setTypeface(typeFace);
		titolo.setTypeface(typeFace);
		
		risposta1.setTypeface(typeFace);
		risposta2.setTypeface(typeFace);
		risposta3.setTypeface(typeFace);
		risposta4.setTypeface(typeFace);
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.domanda, menu);
		return true;
	}

}
