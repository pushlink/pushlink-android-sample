package pushlink.com.sample;

import android.app.Application;
import android.provider.Settings;

import com.pushlink.android.PushLink;

public class PushlinkSetup extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        String yourApiKey = "get your api key after sign up";
        String deviceId = Settings.Secure.getString(this.getContentResolver(), Settings.Secure.ANDROID_ID); //Must read https://www.pushlink.com/idguide.xhtml
        PushLink.start(this, R.mipmap.ic_launcher, yourApiKey, deviceId);
    }
}
