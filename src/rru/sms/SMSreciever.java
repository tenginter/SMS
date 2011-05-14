package rru.sms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.widget.Toast;

public class SMSreciever extends BroadcastReceiver{

	@Override
	public void onReceive(Context context, Intent intent) {
		Bundle bundle = intent.getExtras();

		  SmsMessage[] msgs = null;
		  if (bundle != null) {
		   Object[] pdus = (Object[]) bundle.get("pdus");
		   msgs = new SmsMessage[pdus.length];
		   if (msgs.length >= 0) {
		    msgs[0] = SmsMessage.createFromPdu((byte[]) pdus[0]);
		    String message = msgs[0].getMessageBody().toString();
		    msgs[0].getMessageBody();
		    SMS  s=new SMS();
		    s.et2.append(message);
		  //  s.et2.setText(message);
		   // Toast.makeText(context,message,Toast.LENGTH_LONG).show();
		
	}
		  }
		  }
	
	
}
