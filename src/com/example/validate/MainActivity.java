package com.example.validate;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	public void ButtonClicked(View v)
	{
		EditText ed_usernm=(EditText) findViewById(R.id.editText1);
		String username=ed_usernm.getText().toString();

		EditText ed_pass=(EditText) findViewById(R.id.editText2);
		String pass=ed_pass.getText().toString();

		if(username.equals(""))
		{
			ed_usernm.setError("Enter name");
			return;
		}
		else if(pass.equals("")||!(pass.length()>=8))
		{
			ed_pass.setError("Password must be at least 8 character");
			return;
		}

		Toast.makeText(getApplicationContext(), "Login to the registration page", Toast.LENGTH_SHORT).show();
		startActivity(new Intent(this,SecondMainActivity.class));
		return;

	}
}
