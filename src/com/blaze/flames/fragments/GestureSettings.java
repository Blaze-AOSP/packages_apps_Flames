package com.blaze.flames.fragments;

import com.android.internal.logging.nano.MetricsProto;

import android.os.Bundle;
import com.android.settings.R;

import com.android.settings.SettingsPreferenceFragment;

public class GestureSettings extends SettingsPreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.blaze_flames_gestures);
    }

    @Override
    public int getMetricsCategory() {
        return MetricsProto.MetricsEvent.BLAZE;
    }

}
