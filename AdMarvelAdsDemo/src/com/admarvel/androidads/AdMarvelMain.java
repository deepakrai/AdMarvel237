package com.admarvel.androidads;

import java.util.HashMap;
import java.util.Map;

import com.admarvel.android.ads.AdMarvelUtils.ErrorReason;
import com.admarvel.android.ads.AdMarvelUtils.SDKAdNetwork;
import com.admarvel.android.ads.AdMarvelView;
import com.admarvel.android.ads.AdMarvelView.AdMarvelViewListener;
//import com.admarvel.androidads.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class AdMarvelMain extends Activity {
		
	private String TAG = "AdMarvelBannerAdsDemoActivity";
	private String _siteId = "45586";
	private String _partnerId = "a8bfcec36625c56f";	
			
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final Button button1 = (Button) findViewById(R.id.Button01);
        
        final Button button2 = (Button) findViewById(R.id.Button02);
        
        button1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
		        Intent myIntent = new Intent(AdMarvelMain.this, AdMarvelBannerAdsDemoActivity.class);
//		        myIntent.putExtra("key", value); //Optional parameters
		        AdMarvelMain.this.startActivity(myIntent);
				
			}
        	
        });
        
        button2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
		        Intent myIntent = new Intent(AdMarvelMain.this, AdMarvelInterstitialDemoActivity.class);
//		        myIntent.putExtra("key", value); //Optional parameters
		        AdMarvelMain.this.startActivity(myIntent);
				
			}
        	
        });
        


//		final EditText editText01 = (EditText) findViewById(R.id.EditText01);
//
//		final EditText editText02 = (EditText) findViewById(R.id.EditText02);
//
//		AdMarvelView adMarvelView = (AdMarvelView) findViewById(R.id.ad);
//		adMarvelView.setEnableClickRedirect(true);
//		adMarvelView.setDisableAnimation(false);OnCl
//		adMarvelView.setListener(this);
//		adMarvelView.setEnableAutoScaling(true);
//
//		editText01.setText(_partnerId);
//		editText02.setText(_siteId);
//		
//		button.setOnClickListener(new OnClickListener()
//		{
//
//			public void onClick(View v)
//			{
//
//				try
//				{
//					Map<String, Object> targetParams = new HashMap<String, Object>();
//					//targetParams.put("GEOLOCATION", "39.1059775,-94.5785683");
//					targetParams.put("KEYWORDS", "fantasy");
//					targetParams.put("POSTAL_CODE", "64106");
//
//					final EditText editText01 = (EditText) findViewById(R.id.EditText01);
//					final EditText editText02 = (EditText) findViewById(R.id.EditText02);
//
//					String partnerId = editText01.getText().toString();
//					String siteId = editText02.getText().toString();
//
//					AdMarvelView adMarvelView = (AdMarvelView) findViewById(R.id.ad);
//					adMarvelView.requestNewAd(targetParams, partnerId, siteId, AdMarvelMain.this);
//				}
//				catch (Exception e)
//				{
//					// TODO Auto-generated catch block
//
//					Log.e(TAG, e.getStackTrace().toString());
//				}
//
//			}
//
//		});
		
    }
    
//	@Override
//	protected void onResume()
//	{
//		// TODO Auto-generated method stub
//		super.onResume();
//		
//		try
//		{
//			AdMarvelView adMarvelView = (AdMarvelView) findViewById(R.id.ad);
//			AdMarvelView.resume(this, null, adMarvelView);
//
//		}
//		catch (Exception e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//	@Override
//	protected void onPause()
//	{
//		// TODO Auto-generated method stub
//		super.onPause();
//		
//		try
//		{
//			AdMarvelView adMarvelView = (AdMarvelView) findViewById(R.id.ad);
//			AdMarvelView.pause(this, null, adMarvelView);
//
//		}
//		catch (Exception e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//	@Override
//	public void onStart()
//	{
//		super.onStart();
//		try
//		{
//			// Initialized SDKs that need to; pass in publisher ids
//			Map<SDKAdNetwork, String> publisherIds = new HashMap<SDKAdNetwork, String>();
//			
//			AdMarvelView.initialize(this, publisherIds);
//
//		}
//		catch (Exception e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		// your code
//	}
//
//	
//
//	@Override
//	public void onStop()
//	{
//		super.onStop();
//
//		try
//		{
//			Map<SDKAdNetwork, String> publisherIds = new HashMap<SDKAdNetwork, String>();
//			
//			AdMarvelView.uninitialize(this, publisherIds);
//
//		}
//		catch (Exception e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		// your code
//	}
//
//	@Override
//	protected void onDestroy()
//	{
//		// TODO Auto-generated method stub
//		super.onDestroy();
//		AdMarvelView adMarvelView = (AdMarvelView) findViewById(R.id.ad);
//		if (adMarvelView != null)
//		{
//			adMarvelView.destroy();
//		}
//	}
//
//	public void onReceiveAd(AdMarvelView adMarvelView)
//	{
//		Log.e(TAG, "onReceiveAd");
//		adMarvelView.focus();		
//	}
//
//	public void onFailedToReceiveAd(AdMarvelView adMarvelView, int errorCode,
//			ErrorReason errorReason)
//	{
//		Log.e(TAG, "onFailedToReceiveAd");
//		
//	}
//
//	public void onClickAd(AdMarvelView adMarvelView, String clickUrl)
//	{
//		Log.e(TAG, "onClickAd: "+clickUrl);
//		
//	}
//
//	public void onRequestAd(AdMarvelView adMarvelView)
//	{
//		Log.e(TAG, "onRequestAd");
//		
//	}
//
//	public void onExpand()
//	{
//		Log.e(TAG, "onExpand");
//		
//	}
//
//	public void onClose()
//	{
//		Log.e(TAG, "onClose");
//		
//	}
}