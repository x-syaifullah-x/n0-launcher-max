package com.umntv.launcher;

import android.app.Application;
import android.util.Log;

import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import com.flurry.android.FlurryAgent;
import com.flurry.android.FlurryPerformance;

import java.util.List;

import media.umn.tv.BuildConfig;
import media.umn.tv.R;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        String key = getString(R.string.applovin_sdk_key);
        AppLovinSdkInitializationConfiguration.Builder initConfig =
                AppLovinSdkInitializationConfiguration.builder(key, this)
                        .setMediationProvider(AppLovinMediationProvider.MAX)
                        .setAdUnitIds(List.of(getString(R.string.applovin_ad_unit_id_type_banner)));
        if (BuildConfig.DEBUG) {
//            initConfig.setTestDeviceAdvertisingIds(List.of("dfae8a54-42a4-458b-8afd-305c99a2215d"));
        }
        AppLovinSdk.getInstance(this).initialize(initConfig.build(), sdkConfig -> {
            /**/
        });

        new FlurryAgent.Builder()
                .withLogEnabled(true)
                .withLogLevel(Log.VERBOSE)
                .withReportLocation(true)
                .withCaptureUncaughtExceptions(true)
                .withContinueSessionMillis(10000)
                .withSessionForceStart(true)
                .withPerformanceMetrics(FlurryPerformance.ALL)
                .withIncludeBackgroundSessionsInMetrics(true)
                .build(this, "68Y5VWW6XTGYSXHFTFYZ");

//        Thread.setDefaultUncaughtExceptionHandler((t, e) -> {
//            Executors.newSingleThreadExecutor().execute(new Runnable() {
//                @Override
//                public void run() {
//                    StringWriter stringWriter = new StringWriter();
//                    PrintWriter printWriter = new PrintWriter(stringWriter);
//                    e.printStackTrace(printWriter);
//
//                    System.out.println(stringWriter);
//
//                    Intent intent = new Intent(getBaseContext(), ExceptionActivity.class);
//                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                    getBaseContext().startActivity(intent);
//                    System.;
//                }
//            });
//        });
    }
}
