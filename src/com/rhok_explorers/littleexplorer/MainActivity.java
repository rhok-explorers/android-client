package com.rhok_explorers.littleexplorer;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	
	Button IniziaAvventura, IlMioDiario;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		IniziaAvventura = (Button) findViewById (R.id.IniziaAvventura);
		IlMioDiario = (Button) findViewById (R.id.IlMioDiario);
		
	
		
	IniziaAvventura.setOnClickListener(new View.OnClickListener() {

		 @Override
           public void onClick(View v) {
			 Intent intent1 = new Intent (getApplicationContext(), Percorsi.class);
			 startActivity(intent1);
		 }
	});
	
	
	IlMioDiario.setOnClickListener(new View.OnClickListener() {

		 @Override
          public void onClick(View v) {
			 Intent intent2 = new Intent (getApplicationContext(), Diario.class);
			 startActivity(intent2);
		 }
	});
	
}

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}



