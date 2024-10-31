package com.umntv.launcher.util;

import android.content.Context;
import android.view.View;

import androidx.annotation.NonNull;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.umntv.launcher.App;

import java.util.List;

import media.umn.tv.BuildConfig;
import media.umn.tv.R;

public class Admob {

    public static void setup(View view) {
        System.out.println("ad_view: " + view);
        try {
            if (view instanceof AdView adView) {
                MobileAds.initialize(adView.getContext(), initializationStatus -> {
                    /**/
                });
                adView.bringToFront();
                AdRequest adRequest = new AdRequest.Builder().build();
                adView.loadAd(adRequest);
            } else if (view instanceof MaxAdView adView) {
                Context c = adView.getContext();
//                if (!AppLovinSdk.getInstance(c).isInitialized()) return;
                adView.setListener(new MaxAdViewAdListener() {
                    @Override
                    public void onAdExpanded(@NonNull MaxAd maxAd) {

                    }

                    @Override
                    public void onAdCollapsed(@NonNull MaxAd maxAd) {

                    }

                    @Override
                    public void onAdLoaded(@NonNull MaxAd maxAd) {

                    }

                    @Override
                    public void onAdDisplayed(@NonNull MaxAd maxAd) {

                    }

                    @Override
                    public void onAdHidden(@NonNull MaxAd maxAd) {
                        adView.loadAd();
                    }

                    @Override
                    public void onAdClicked(@NonNull MaxAd maxAd) {

                    }

                    @Override
                    public void onAdLoadFailed(@NonNull String s, @NonNull MaxError maxError) {
                        System.out.println("abc onAdLoadFailed: " + maxError.getMessage());
                        adView.loadAd();
                    }

                    @Override
                    public void onAdDisplayFailed(@NonNull MaxAd maxAd, @NonNull MaxError maxError) {
                        System.out.println("abc onAdDisplayFailed: " + maxError.getMessage());
                        adView.loadAd();
                    }
                });
//                String key = c.getString(R.string.applovin_sdk_key);
//                AppLovinSdkInitializationConfiguration.Builder initConfig = AppLovinSdkInitializationConfiguration.builder(key, c)
//                        .setMediationProvider(AppLovinMediationProvider.MAX);
////                .setAdUnitIds(List.of(getString(R.string.applovin_ad_unit_id_type_banner)));
//                if (BuildConfig.DEBUG) {
////            initConfig.setTestDeviceAdvertisingIds(List.of("71810ab3-83fd-4e73-a057-4de90e9a5200"));
//                }
//                AppLovinSdk.getInstance(c).initialize(initConfig.build(), sdkConfig -> {
//                    adView.loadAd();
//                    adView.bringToFront();
//                });
                adView.bringToFront();
                adView.loadAd();

//                Context c = adView.getContext();
//                String key = c.getString(R.string.applovin_sdk_key);
//                AppLovinSdkInitializationConfiguration.Builder initConfig = AppLovinSdkInitializationConfiguration.builder(key, c)
//                        .setMediationProvider(AppLovinMediationProvider.MAX)
//                        .setAdUnitIds(List.of(c.getString(R.string.applovin_ad_unit_id_type_banner)));
//                if (BuildConfig.DEBUG) {
//                    initConfig.setTestDeviceAdvertisingIds(List.of("71810ab3-83fd-4e73-a057-4de90e9a5200"));
//                }
//                AppLovinSdk.getInstance(c).initialize(initConfig.build(), sdkConfig -> {
//                    adView.loadAd();
//                    adView.bringToFront();
//                });

//                adView.loadAd();
//                adView.bringToFront();


//                Context context = adView.getContext();
//                AppLovinSdkSettings settings = new AppLovinSdkSettings(context);
////                List<String> adUnitIds = new ArrayList<>();
////                settings.setInitializationAdUnitIds(adUnitIds);
//                AppLovinSdk.getInstance(settings, context).setMediationProvider("max");

//                adView.bringToFront();
//                adView.loadAd();
            }
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
