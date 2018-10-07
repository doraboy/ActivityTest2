package tw.dora.activitytest2;

import android.app.Application;
import android.util.Log;

public class BradApp extends Application {
    public static int a;

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("brad","BradApp:onCreate()");
        a = 111;
        Log.d("brad","a = "+ a);
    }
}
