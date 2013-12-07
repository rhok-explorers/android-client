package com.rhok_explorers.littleexplorer;

import org.achartengine.ChartFactory;
import org.achartengine.GraphicalView;
import org.achartengine.model.CategorySeries;
import org.achartengine.renderer.DefaultRenderer;
import org.achartengine.renderer.SimpleSeriesRenderer;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.widget.RelativeLayout;

public class DettaglioPercorso extends Activity {

	GraphicalView mChartView = null;
	private DefaultRenderer mRenderer = new DefaultRenderer();
	private CategorySeries mSeries = new CategorySeries("Expenses");
	private static int[] COLORS = new int[] {Color.GREEN, Color.BLUE, Color.MAGENTA, Color.YELLOW, Color.RED, Color.DKGRAY, Color.BLACK};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dettaglio_percorso);
		
		double[] values = new double[2];
		String[] categoryNames = new String[2];
		
		    values[0] = 25;
		    categoryNames[0] = "Animali";
		    values[1] = 20;
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
		    
		    
//		    addContentView(mChartView,
		    
		    
		    RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
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