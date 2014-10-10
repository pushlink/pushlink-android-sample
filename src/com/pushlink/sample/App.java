package com.pushlink.sample;

import android.app.Application;

import com.pushlink.android.PushLink;

public class App extends Application{
	
	@Override
	public void onCreate() {
		super.onCreate();

		String apiKey = "get it in web administration after login";
		String id = "must read http://pushlink.com/idguide.xhtml";
		
		/* 
		 * 1 - Change apiKey and id, after that run it.
		 * 2 - You will get a logcat error: Device register failed: Invalid Package. Probably you never uploaded this app.
		 * 3 - Upload the newly created APK in bin folder to the pushlink web administration.
		 * 4 - Run it again. No update will happen because this is the same version.
		 * 5 - Change something into this project and run again.
		 * 6 - Pushlink is going to fire the update task in few seconds. 
		 */
		
		PushLink.start(this, R.drawable.ic_launcher, apiKey, id);
	}

}
