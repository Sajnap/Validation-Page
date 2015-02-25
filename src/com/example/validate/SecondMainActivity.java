package com.example.validate;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class SecondMainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second_activity_main);
	}
	public void ButtonSaved(View v)
	{
		EditText ed_name=(EditText) findViewById(R.id.editText1);
		String name=ed_name.getText().toString();

		EditText ed_email=(EditText) findViewById(R.id.editText2);
		String email=ed_email.getText().toString();

		EditText ed_address=(EditText) findViewById(R.id.editText3);
		String address=ed_address.getText().toString();

		EditText ed_phone=(EditText) findViewById(R.id.editText4);
		String phone=ed_phone.getText().toString();

		EditText ed_pass=(EditText) findViewById(R.id.editText5);
		String pass=ed_pass.getText().toString();
		
		//Validation
		
		if(name.equals("")){
			ed_name.setError("Enter data");
			return;
		}
		else if(email.equals("")||!(email.length()>=15))
		{
			ed_email.setError("Email id must be at least 15 characters");
			return;
		}
		else if(address.equals("")||!(address.length()<=30))
		{
			ed_address.setError("Address must be at least 30 characters");
			return;
		}
		else if(phone.equals("")||!(phone.length()==10))
		{
			ed_phone.setError("Phone number must be 10 digit");
			return;
		}
		else if(pass.equals("")||!(pass.length()>=8))
		{
			ed_pass.setError("Password must be at least 8 character");
			return;
		}

		Toast.makeText(getApplicationContext(), "Submitted", Toast.LENGTH_SHORT).show();
		startActivity(new Intent(this,ThirdMainActivity.class));
		finish();
	}
}
