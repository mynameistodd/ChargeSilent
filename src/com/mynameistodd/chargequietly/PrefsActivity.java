package com.mynameistodd.chargequietly;

import com.mynameistodd.chargequietly.R;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;
import android.app.Activity;
import android.view.Menu;

public class PrefsActivity extends PreferenceActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.preferences);
		PreferenceManager.setDefaultValues(this, R.xml.preferences, false);
	}
}
