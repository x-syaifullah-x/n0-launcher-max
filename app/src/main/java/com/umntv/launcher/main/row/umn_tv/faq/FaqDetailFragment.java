package com.umntv.launcher.main.row.umn_tv.faq;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.umntv.launcher.main.base.ApkData;
import com.umntv.launcher.main.base.BaseDetailFragment;
import com.umntv.launcher.util.Admob;

import media.umn.tv.R;

public class FaqDetailFragment extends BaseDetailFragment {

    public FaqDetailFragment() {
        super(DataSource.items);
    }

//    @Override
//    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//        Admob.setup(requireActivity().findViewById(R.id.adView));
//    }

    @Override
    public void openOrDownload(ApkData apkData) {
        open(apkData.url);
    }

    private void open(String url) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
}
