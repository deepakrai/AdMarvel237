package com.admarvel.androidads;

import java.util.HashMap;
import java.util.Map;

import com.admarvel.android.ads.AdMarvelActivity;
import com.admarvel.android.ads.AdMarvelAd;
import com.admarvel.android.ads.AdMarvelInterstitialAds;
import com.admarvel.android.ads.AdMarvelInterstitialAds.AdMarvelInterstitialAdListener;
import com.admarvel.android.ads.AdMarvelUtils.ErrorReason;
import com.admarvel.android.ads.AdMarvelUtils.SDKAdNetwork;
import com.admarvel.android.ads.AdMarvelVideoActivity;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class AdMarvelInterstitialDemoActivity extends Activity implements AdMarvelInterstitialAdListener{
	
	private String TAG = "AdMarvelInterstitialDemoActivity";
	private String _siteId = "45587";

	private String _partnerId = "a8bfcec36625c56f";
	
	private AdMarvelInterstitialAds adMarvelInterstitialAds;

	private AdMarvelActivity adMarvelActivity = null;

	private AdMarvelVideoActivity adMarvelVideoActivity = null;

	
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interstitial);
        
        final Button button = (Button) findViewById(R.id.Button01);

		final EditText editText01 = (EditText) findViewById(R.id.EditText01);

		final EditText editText02 = (EditText) findViewById(R.id.EditText02);
		
		editText01.setText(_partnerId);
		editText02.setText(_siteId);
		
		adMarvelInterstitialAds = new AdMarvelInterstitialAds(this, 0,
				0x726D6D, 0x00FF00, 0x000000);
		
		button.setOnClickListener(new OnClickListener()
		{

			public void onClick(View v)
			{

				Map<String, Object> targetParams = new HashMap<String, Object>();

				targetParams.put("GEOLOCATION", "42.253387,-83.6874026");
				targetParams.put("test", "bt_inapp");

				final EditText editText01 = (EditText) findViewById(R.id.EditText01);
				final EditText editText02 = (EditText) findViewById(R.id.EditText02);

				String partnerId = editText01.getText().toString();
				String interstitialSiteId = editText02.getText().toString();

				AdMarvelInterstitialAds
						.setListener(AdMarvelInterstitialDemoActivity.this);
				AdMarvelInterstitialAds.setEnableClickRedirect(true);
				AdMarvelInterstitialDemoActivity.this.adMarvelInterstitialAds
						.requestNewInterstitialAd(AdMarvelInterstitialDemoActivity.this,
								targetParams, partnerId, interstitialSiteId, AdMarvelInterstitialDemoActivity.this);

			}

		});
    }

	public void onRequestInterstitialAd()
	{
		Log.e(TAG, "onRequestInterstitialAd");
		
	}

	public void onReceiveInterstitialAd(SDKAdNetwork sdkAdNetwork,
			String publisherid, AdMarvelAd adMarvelAd)
	{
		Log.e(TAG, "onReceiveInterstitialAd");

		adMarvelInterstitialAds.displayInterstitial(this, sdkAdNetwork,
				publisherid, adMarvelAd);
		
	}

	public void onFailedToReceiveInterstitialAd(SDKAdNetwork sdkAdNetwork,
			String publisherid, int errorCode, ErrorReason errorReason)
	{
		Log.e(TAG, "onFailedToReceiveInterstitialAd; errorCode: "
				+ errorCode + " errorReason: " + errorReason.toString());
		
	}

	public void onCloseInterstitialAd()
	{
		Log.e(TAG, "onCloseInterstitialAd");
		if (this.adMarvelActivity != null)
		{
			this.adMarvelActivity.finish();
			this.adMarvelActivity = null;
		}
		else if (this.adMarvelVideoActivity != null)
		{
			this.adMarvelVideoActivity.finish();
			this.adMarvelVideoActivity = null;
		}
		
	}

	public void onAdmarvelActivityLaunched(AdMarvelActivity a)
	{
		Log.e(TAG, "onAdmarvelActivityLaunched");
		this.adMarvelActivity = a;
		
	}

	public void onAdMarvelVideoActivityLaunched(AdMarvelVideoActivity a)
	{
		Log.e(TAG, "onAdmarvelVideoActivityLaunched");
		this.adMarvelVideoActivity = a;
		
	}

	public void onClickInterstitialAd(String clickUrl)
	{
		if (clickUrl != null)
		{
			Log.e(TAG, "InterstitialClickUrl: " + clickUrl);
		}
		
	}
}