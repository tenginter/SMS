package rru.sms;

import android.app.Activity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SMS extends Activity {
	Button bt1;
	public static EditText et1,et2;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        bt1=(Button) findViewById(R.id.Button01);
        et1=(EditText) findViewById(R.id.EditText01);
        et2=(EditText) findViewById(R.id.EditText02);
        //et1.toString();
        //String.valueOf(et1);
        
        bt1.setOnClickListener(new OnClickListener(){
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				sendSMS(et1.getText().toString(),et2.getText().toString());
				//sendSMS(et1.getText()+"",et2.getText()+"");
				Toast t=new Toast(SMS.this);
				t.setText("Sent OK!");
				t.setDuration(4);
				t.show();
			}
		});
    }
    private void sendSMS(String phoneNumber, String message)
    {                 
        SmsManager sms = SmsManager.getDefault();
        sms.sendTextMessage(phoneNumber, null, message,null, null);        
    } 
}