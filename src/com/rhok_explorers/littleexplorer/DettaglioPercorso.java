package com.rhok_explorers.littleexplorer;

import org.achartengine.ChartFactory;
import org.achartengine.GraphicalView;
import org.achartengine.model.CategorySeries;
import org.achartengine.renderer.DefaultRenderer;
import org.achartengine.renderer.SimpleSeriesRenderer;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class DettaglioPercorso extends Activity {

	GraphicalView mChartView = null;
	private DefaultRenderer mRenderer = new DefaultRenderer();
	private CategorySeries mSeries = new CategorySeries("Expenses");
	private static int[] COLORS = new int[] { Color.GREEN, Color.BLUE,
			Color.MAGENTA, Color.YELLOW, Color.RED, Color.DKGRAY, Color.BLACK };

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dettaglio_percorso);
		
		
		Typeface typeFace = Typeface.createFromAsset(getAssets(), "fonts/Action_Man.ttf");
		
		Button inizia = (Button) findViewById(R.id.Inizia);
		
		TextView textlunghezza = (TextView) findViewById (R.id.textlunghezza);
		TextView texttappe = (TextView) findViewById (R.id.texttappe);
		TextView textlivello = (TextView) findViewById (R.id.textlivello);
		TextView textdifficolta = (TextView) findViewById (R.id.textdifficolta);

		TextView numberlunghezza = (TextView) findViewById (R.id.numberlunghezza);
		TextView numbertappe = (TextView) findViewById (R.id.numbertappe);
		TextView numberlivello = (TextView) findViewById (R.id.numberlivello);
		TextView textdescrizione = (TextView) findViewById (R.id.textdescrizione);
		
		
		textlunghezza.setTypeface(typeFace);
		texttappe.setTypeface(typeFace);
		textlivello.setTypeface(typeFace);
		textdifficolta.setTypeface(typeFace);
		numberlunghezza.setTypeface(typeFace);
		numbertappe.setTypeface(typeFace);
		numberlivello.setTypeface(typeFace);
		textdescrizione.setTypeface(typeFace);
		inizia.setTypeface(typeFace);
		
		
		inizia.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent mapIntent = new Intent(DettaglioPercorso.this, Cartina.class);
				startActivity(mapIntent);
			}
		});

		
		
		
		
		double[] values = new double[2];
		String[] categoryNames = new String[2];

		values[0] = 70;
		categoryNames[0] = "Animali";
		values[1] = 30;
		categoryNames[1] = "Piante";

		mSeries.add(categoryNames[0], values[0]);
		SimpleSeriesRenderer renderer = new SimpleSeriesRenderer();
		renderer.setColor(COLORS[(mSeries.getItemCount() - 1) % COLORS.length]);
		renderer.setDisplayChartValues(true);
		mRenderer.addSeriesRenderer(renderer);

		mSeries.add(categoryNames[1], values[1]);
		renderer = new SimpleSeriesRenderer();
		renderer.setColor(COLORS[(mSeries.getItemCount() - 1) % COLORS.length]);
		renderer.setDisplayChartValues(true);
		mRenderer.addSeriesRenderer(renderer);
		mRenderer.setZoomEnabled(false);
		mRenderer.setShowLegend(false);
		mRenderer.setInScroll(false);
		mRenderer.setLabelsTextSize(40);
		mRenderer.setLabelsColor(Color.DKGRAY);
		mRenderer.setPanEnabled(false);

		mChartView = ChartFactory.getPieChartView(this, mSeries, mRenderer);

		// addContentView(mChartView,

		RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
				RelativeLayout.LayoutParams.MATCH_PARENT,
				RelativeLayout.LayoutParams.WRAP_CONTENT);
		mChartView.setLayoutParams(params);
		RelativeLayout layout = (RelativeLayout) findViewById(R.id.relative2);
		layout.addView(mChartView);

		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dettaglio_percorso, menu);
		return true;
	}

}
