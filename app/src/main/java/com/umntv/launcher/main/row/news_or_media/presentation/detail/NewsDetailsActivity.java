package com.umntv.launcher.main.row.news_or_media.presentation.detail;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;

import com.umntv.launcher.util.Admob;

import media.umn.tv.R;

public class NewsDetailsActivity extends FragmentActivity {

    public static final String SHARED_ELEMENT_NAME = "hero";
    public static final String ITEM = "Item";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Admob.setup(findViewById(R.id.adView));

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(android.R.id.content, new NewsDetailsFragment())
                    .commitNow();
        }
    }
}
