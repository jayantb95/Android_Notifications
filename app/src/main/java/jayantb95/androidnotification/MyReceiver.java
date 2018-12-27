package jayantb95.androidnotification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.Log;

/*
 * Created by android1 on 27/12/18 @ 4:30 PM.
 */
public class MyReceiver extends BroadcastReceiver {

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onReceive(Context context, Intent intent) {
      /*Intent service1 = new Intent(context, MyAlarmService.class);
        context.startService(service1);*/
        Log.i("App", "called receiver method");
        try {
            Utils.generateNotification(context);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}