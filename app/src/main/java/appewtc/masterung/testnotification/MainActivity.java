package appewtc.masterung.testnotification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }   // Main Method

    public void clickNotification(View view) {

        Intent objIntent = new Intent(Intent.ACTION_VIEW);
        objIntent.setData(Uri.parse("http://androidthai.in.th/about-me.html"));
        PendingIntent objPendingIntent = PendingIntent.getActivity(this, 0, objIntent, 0);

        Notification objNotification = new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.icon_cow)
                .setContentTitle("Title")
                .setContentText("Message")
                .setAutoCancel(true)
                .setContentIntent(objPendingIntent)
                .build();

        NotificationManager objNotificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        objNotificationManager.notify(1000, objNotification);


    }   // clickNotification

}   // Main Class
