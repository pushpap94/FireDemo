package com.zuantech.zuansys104.firedemo;

import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    Button b1;
    PendingIntent contentIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button)findViewById(R.id.button);


        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.MONTH, 6);
        calendar.set(Calendar.YEAR, 2013);
        calendar.set(Calendar.DAY_OF_MONTH, 13);

        calendar.set(Calendar.HOUR_OF_DAY, 20);
        calendar.set(Calendar.MINUTE, 48);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.AM_PM,Calendar.PM);

        Intent myIntent = new Intent(MainActivity.this, MyReceiver.class);
        contentIntent = PendingIntent.getBroadcast(MainActivity.this, 0, myIntent,0);

        AlarmManager am = (AlarmManager) this.getSystemService(Context.ALARM_SERVICE);
        long recurring = (5 * 60000);
        am.setRepeating(AlarmManager.RTC, Calendar.getInstance().getTimeInMillis(), recurring, contentIntent);





















        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                addNotification();


            }
        });
    }

}
