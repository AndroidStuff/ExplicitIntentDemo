package com.karthik;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void goToActivityB(View v) {
		if(R.id.activity_main_button_goToActivityB1 == v.getId()) {
			Intent in1 = new Intent(this, ActivityB.class);
			startActivity(in1);
		}
		else if(R.id.activity_main_button_goToActivityB2 == v.getId()) {
			Intent in2 = new Intent("intentFilterActionNameActivityB"); //Copy-paste the name of the Intent Filter you create under the ActivityB tag
			startActivity(in2);
		}
		else if(R.id.activity_main_button_goToActivityB3 == v.getId()) {
			Intent in3 = new Intent();
			in3.setClassName("com.karthik", "com.karthik.ActivityB");
			startActivity(in3);
		}		
	}
}
