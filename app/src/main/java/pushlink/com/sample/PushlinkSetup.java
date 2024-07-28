package pushlink.com.sample;

import android.app.Application;
import android.os.Bundle;
import android.provider.Settings;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.pushlink.android.PushLink;

public class PushlinkSetup extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        String yourDeviceID = Settings.Secure.getString(getContentResolver(), Settings.Secure.ANDROID_ID);
        PushLink.start(this, R.mipmap.ic_launcher, "yourApiKey", yourDeviceID);
    }
}