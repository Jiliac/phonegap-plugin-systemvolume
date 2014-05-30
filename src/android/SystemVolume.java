package com.jiliac.systemvolume;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

import android.content.Context;
import android.media.AudioManager;
import android.os.Vibrator;

public class SystemVolume extends CordovaPlugin {
	public SystemVolume(){

	}

	public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		if(action.equals("setSystemVolume")) {
			this.setSystemVolume(args.getDouble(0));
		} else {
			return false;
		}

		callbackContext.success();
		return true;
	}

	public void setSystemVolume(double volume) {
		/*
		Vibrator vibrator = (Vibrator) this.cordova.getActivity().getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(10000);

		AudioManager am = (AudioManager) this.cordova.getActivity().getSystemService(Context.AUDIO_SERVICE);
		*/
		/*
		am.setStreamVolume(
			AudioManager.STREAM_MUSIC,
			am.getStreamMaxVolume(AudioManager.STREAM_MUSIC),
			0);
		am.setStreamVolume(
			AudioManager.STREAM_SYSTEM,
			am.getStreamMaxVolume(AudioManager.STREAM_SYSTEM),
			0);
		*/

        am.setStreamMute(AudioManager.STREAM_NOTIFICATION, true);
        am.setStreamMute(AudioManager.STREAM_ALARM, true);
        am.setStreamMute(AudioManager.STREAM_MUSIC, true);
        am.setStreamMute(AudioManager.STREAM_RING, true);
        am.setStreamMute(AudioManager.STREAM_SYSTEM, true);
	}
}