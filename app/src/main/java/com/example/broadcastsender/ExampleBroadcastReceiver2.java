package com.example.broadcastsender;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class ExampleBroadcastReceiver2 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
//        Toast.makeText(context, "EBR2 triggered", Toast.LENGTH_LONG).show();

        int resultCode = getResultCode();
        String resultData = getResultData();
        Bundle resultBundle = getResultExtras(true);
        String extraString = resultBundle.getString("STRING_EXTRA");

        resultCode++;
        extraString += "->SenderReceiver";

        String toastText = "SenderReceiver\n" + "result code: " + resultCode +"\n" + "result data:" +
                resultData + "\n" + "String extra: " + extraString;


        Toast.makeText(context, toastText, Toast.LENGTH_LONG).show();

        resultData = "SenderReceiver";

        resultBundle.putString("STRING_EXTRA", extraString);

        setResult(resultCode, resultData, resultBundle);
    }
}
