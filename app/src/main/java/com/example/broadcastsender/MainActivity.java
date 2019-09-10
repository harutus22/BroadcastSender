package com.example.broadcastsender;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.KeyEventDispatcher;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.text);
    }

    public void sendBroadcast(View view){
//        Intent intent = new Intent("com.example.EXAMPLE_ACTION");
//        intent.putExtra("com.example.EXTRA_TEXT", "Broadcast Received");

//        Intent intent = new Intent(this, ExampleBroadcastReceiver2.class);

//        Intent intent = new Intent();

//        ComponentName componentName = new ComponentName("com.example.broadcastreceiver",
//                "com.example.broadcastreceiver.ExampleBroadcastReceiver");
//        intent.setComponent(componentName);

//        intent.setClassName("com.example.broadcastreceiver",
//                "com.example.broadcastreceiver.ExampleBroadcastReceiver");

        Intent intent = new Intent("com.example.EXAMPLE_ACTION");
        intent.setPackage("com.example.broadcastreceiver");
//
//        PackageManager packageManager = getPackageManager();
//        List<ResolveInfo> infos = packageManager.queryBroadcastReceivers(intent, 0);
//
//        for(ResolveInfo resolveInfo:infos){
//            ComponentName componentName = new ComponentName(resolveInfo.activityInfo.packageName,
//                    resolveInfo.activityInfo.name);
//            intent.setComponent(componentName);
//            sendBroadcast(intent);
//        }

//        sendBroadcast(intent);
        Bundle extras = new Bundle();
        extras.putString("STRING_EXTRA", "Start");

        sendOrderedBroadcast(intent, null, new ExampleBroadcastReceiver2(),
                null, 0, "Start", extras);
    }

//    private BroadcastReceiver broadcastReceiver = new BroadcastReceiver() {
//        @Override
//        public void onReceive(Context context, Intent intent) {
//            String receiveText = intent.getStringExtra("com.example.EXTRA_TEXT");
//            textView.setText(receiveText);
//        }
//    };
//
//    @Override
//    protected void onStart() {
//        super.onStart();
//        IntentFilter intentFilter = new IntentFilter("com.example.EXAMPLE_ACTION");
//        registerReceiver(broadcastReceiver, intentFilter);
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        unregisterReceiver(broadcastReceiver);
//    }
}
