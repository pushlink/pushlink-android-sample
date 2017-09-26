# Pushlink - Android - Sample

## Usage

Clone and run *(eclipe IDE project)*

## Updating to a new version

Just replace the Puhslink jar in libs folder

## Code Sample

```java
public class PushLinkSetup extends Application {
	@Override
	public void onCreate() {
		super.onCreate();
		PushLink.start(this, R.mipmap.ic_launcher, "yourApiKey", "yourDeviceID");
		//you can use R.drawable.icon for older sdks
	}
}

//Don't forget the AndroidManifest.xml <application android:name=".PushLinkSetup" ... >
//Parameters:
//	1 - Android context
//	2 - Notification icon
//	3 - User apiKey available after sign up
//	4 - Unique device ID. Very important. See http://push-link.com/idguide.xhtml

//OBS1: You must call PushLink.start in the UI Thread. Don't call it inside a BroadcastReceiver. 
//OBS2: Extends android.app.Application, becouse certainly it will be called when your process start/restart.
//OBS3: If PushLink.start was called twice the second call will be ignored! 
```

## Help & Support

Always feel free to drop a line to support at pushlink dot com or visit our [support](https://www.pushlink.com/support.xhtml).
