package com.umntv.launcher.main.row.umn_tv.media_center;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.umntv.launcher.main.base.BaseDetailFragment;
import com.umntv.launcher.util.Admob;

import media.umn.tv.R;

public class MediaCenterDetailFragment extends BaseDetailFragment {
    public MediaCenterDetailFragment() {
        super(DataSource.items);
    }

//    @Override
//    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//
//        Admob.setup(requireActivity().findViewById(R.id.adView));
//    }
}
