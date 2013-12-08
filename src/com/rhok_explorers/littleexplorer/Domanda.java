package com.rhok_explorers.littleexplorer;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Domanda extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_domanda);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.domanda, menu);
		return true;
	}

}
