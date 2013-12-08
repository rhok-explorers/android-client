package com.rhok_explorers.littleexplorer;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class LocationService extends Service {

@Override
public void onCreate() {
    // TODO Auto-generated method stub
    super.onCreate();
    final LocationManager mlocmag = (LocationManager)getSystemService(Context.LOCATION_SERVICE);
    final LocationListener mlocList = new LocationListener() {
		
		@Override
		public void onStatusChanged(String provider, int status, Bundle extras) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void onProviderEnabled(String provider) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void onProviderDisabled(String provider) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void onLocationChanged(Location location) {
			 String str = "Latitude: "+location.getLatitude()+" Longitude: "+location.getLongitude();
					   
			
		}
	};
   // final Location loc = mlocmag.getLastKnownLocation(LocationManager.GPS_PROVIDER);
   // UpdateWithNewLocation(loc); // This method is used to get updated location. 
    mlocmag.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0 , mlocList);
    final Location loc = mlocmag.getLastKnownLocation(LocationManager.GPS_PROVIDER);
    CountDownTimer t = new CountDownTimer( Long.MAX_VALUE , 10000) {

        public void onTick(long millisUntilFinished) {
        	 UpdateWithNewLocation(loc);
        }

        public void onFinish() {
            Log.d("test","Timer last tick");            
        }
     }.start();
 
}

@Override
public IBinder onBind(Intent arg0) {
    // TODO Auto-generated method stub
    return null;
}

@Override
public void onDestroy() {
    // TODO Auto-generated method stub
    super.onDestroy();
}

@Override
public void onStart(Intent intent, int startId) {
    // TODO Auto-generated method stub
    super.onStart(intent, startId);
}
 public void UpdateWithNewLocation(final Location loc) {
        // TODO Auto-generated method stub

        if(loc!= null)
        {
        final double lat =loc.getLatitude(); // Updated lat
        final double Long = loc.getLongitude(); // Updated long

       // System.out.println(lat+Long);
       // Toast.makeText(this, "Your location is "+lat+Long ,Toast.LENGTH_LONG).show();
        
//        try {
//            DefaultHttpClient httpClient = new DefaultHttpClient();
//            HttpGet httpGet = new HttpGet("http://littleexplorers.herokuapp.com/location/" + lat + "/" + Long);
//
//            HttpResponse httpResponse = httpClient.execute(httpGet);
//            HttpEntity httpEntity = httpResponse.getEntity();
//            String response = EntityUtils.toString(httpEntity);
//        } catch (ClientProtocolException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
        
        
//        HttpResponse response = null;
//        try {        
//                HttpClient client = new DefaultHttpClient();
//                HttpGet request = new HttpGet();
//                request.setURI(new URI("http://littleexplorers.herokuapp.com/location/" + lat + "/" + Long));
//               // Toast.makeText(this, "Your location is "+request.toString() ,Toast.LENGTH_LONG).show();
//                response = client.execute(request);
//            } catch (URISyntaxException e) {
//                e.printStackTrace();
//            }
//                catch (ClientProtocolException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            } catch (IOException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            }  
      
      //  Toast.makeText(this, "response is "+response ,Toast.LENGTH_LONG).show();
        	}
        else 
        {
            String latLongStr = "No lat and longitude found";
              Toast.makeText(this, "Your location is "+latLongStr ,Toast.LENGTH_LONG).show();
        }


    }
}