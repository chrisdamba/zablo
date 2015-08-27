/*
       Licensed to the Apache Software Foundation (ASF) under one
       or more contributor license agreements.  See the NOTICE file
       distributed with this work for additional information
       regarding copyright ownership.  The ASF licenses this file
       to you under the Apache License, Version 2.0 (the
       "License"); you may not use this file except in compliance
       with the License.  You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

       Unless required by applicable law or agreed to in writing,
       software distributed under the License is distributed on an
       "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
       KIND, either express or implied.  See the License for the
       specific language governing permissions and limitations
       under the License.
 */

package app.codetic.bankatmfinder;

import android.os.Bundle;
import android.widget.LinearLayout;

import org.apache.cordova.*;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

public class CordovaApp extends CordovaActivity
{
	private AdView mAdView;
	
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        super.init();
        // Set by <content src="index.html" /> in config.xml
        loadUrl(launchUrl);

        // Admob with Google Play Service
        
        
        // Banner Ad  (Replace publisher ID with your own)
        mAdView = new AdView(this);
        mAdView.setAdUnitId("ca-app-pub-3553223773958701/1451902274");
        mAdView.setAdSize(AdSize.BANNER);
        LinearLayout layout = super.root;

        layout.addView(mAdView);
        layout.setHorizontalGravity(android.view.Gravity.CENTER_HORIZONTAL);
        mAdView.loadAd(new AdRequest.Builder().build());
    }

    @Override
    public void onDestroy() {
        // Destroy the AdView.
        mAdView.destroy();

        super.onDestroy();
    }
}
