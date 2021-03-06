package com.rhok_explorers.littleexplorer;

import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Percorsi extends ListActivity {

	
	
	String[] array = {"Percorso Povo", "Percorso Marmotta",
	"Percorso Gabbiano","Sentiero 04", "Percorso Orso", "Intorno al Lago", "Lungo il fiume", "Alla Baita Verde"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		

		Typeface typeFace = Typeface.createFromAsset(getAssets(), "fonts/Action_Man.ttf");
		
//		TextView titolo = (TextView) findViewById (R.id.titolo);
//		titolo.setTypeface(typeFace);
		
		Resources res=getResources();
		
		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.row, R.id.nomepercorso, array);
		setListAdapter(arrayAdapter);
	
	}

	public void onListItemClick(ListView Parent, View v, int position,long id)
	{
	    startActivity(new Intent(Percorsi.this, DettaglioPercorso.class)); 
	    //Toast.makeText(this, "Clicked on : " + array[position], Toast.LENGTH_LONG).show();
	}
		
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.percorsi, menu);
		return true;
	}

}
