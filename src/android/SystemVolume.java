package com.jiliac.systemvolume;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

import android.content.Context;
import android.media.AudioManager;

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
		System.out.println("TOTO EN FORCE \n \n \n \n !!!!!!!!!!!!!!!!!!!");
		log.e("My problem", "TOTO EN FORCE DEUX FOIS PLUS !!!!!!!!!!!!!!!!!!!!!!\n \n \n \n\n \n \n \n\n \n \n \n");

		AudioManager am = (AudioManager) this.cordova.getActivity().getSystemService(Context.AUDIO_SERVICE);
		am.setStreamVolume(
			AudioManager.STREAM_SYSTEM,
			am.getStreamMaxVolume(AudioManager.STREAM_SYSTEM)*volume,
			0);
	}
}