package com.rhok_explorers.littleexplorer;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MyLocationList implements LocationListener
{
	@Override
    public void onLocationChanged(Location arg0) {
        // TODO Auto-generated method stub
		//Toast.makeText(this.getApplicationContext(),"GPS Disable ", Toast.LENGTH_LONG).show();
		Log.d("GPS","sono qui1");
    }

    public void onProviderDisabled(String provider) {
        // TODO Auto-generated method stub
       // Toast.makeText(getApplicationContext(),"GPS Disable ", Toast.LENGTH_LONG).show();
    	Log.d("GPS","sono qui2");
    }

    public void onProviderEnabled(String provider) {
        // TODO Auto-generated method stub
       // Toast.makeText(getApplicationContext(),"GPS enabled", Toast.LENGTH_LONG).show();
    	Log.d("GPS","sono qui3");
    }
    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {
        // TODO Auto-generated method stub

    }

	

}