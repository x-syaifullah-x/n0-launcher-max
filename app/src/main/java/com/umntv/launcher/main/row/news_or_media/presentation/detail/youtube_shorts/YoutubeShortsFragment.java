package com.umntv.launcher.main.row.news_or_media.presentation.detail.youtube_shorts;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.umntv.launcher.main.row.news_or_media.presentation.detail.BaseDetailFragment;
import com.umntv.launcher.util.Admob;

import media.umn.tv.R;

public class YoutubeShortsFragment extends BaseDetailFragment {
    public YoutubeShortsFragment() {
        super(DataSource.items);
    }

//    @Override
//    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//
//        Admob.setup(requireActivity().findViewById(R.id.adView));
//    }
}
