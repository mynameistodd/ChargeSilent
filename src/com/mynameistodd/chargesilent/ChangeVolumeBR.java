package com.mynameistodd.chargesilent;

import java.util.Date;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.preference.PreferenceManager;

public class ChangeVolumeBR extends BroadcastReceiver {

	
	@Override
	public void onReceive(Context context, Intent intent) {
		SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(context);
		boolean isEnabled = sharedPrefs.getBoolean("enabled", true);
		int volumeLevel = Integer.parseInt(sharedPrefs.getString("volumeLevel", "1"));
		int startTime = Integer.parseInt(sharedPrefs.getString("startTime", "10"));
		int endTime = Integer.parseInt(sharedPrefs.getString("endTime", "7"));
		Date now = new Date();
		
		if (isEnabled) {
			AudioManager audioManager = (AudioManager) context.getSystemService(Context.AUDIO_SERVICE);
			audioManager.setStreamVolume(AudioManager.STREAM_RING, volumeLevel, AudioManager.FLAG_SHOW_UI);
			audioManager.setStreamVolume(AudioManager.STREAM_NOTIFICATION, volumeLevel, AudioManager.FLAG_SHOW_UI);
		}

	}

}
