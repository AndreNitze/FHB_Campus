package org.alex.stundenplan;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.json.simple.JSONObject;

/**
 * @author Alex Severin
 * 
 */
/*
 * TODO
 * 1 mensa
 * 2 cache
 * daca ai accesat odata pastreaza in cache pe azi. Data viitoare utilizeaza aceasta daca nu e internet
 *  3 design
 * 
 */
public class wellcome extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		SharedPreferences sharedPref = getSharedPreferences("Login",Context.MODE_PRIVATE);
		if(sharedPref.contains("group")){
			Intent myIntent = new Intent(this, Plan.class);
			this.startActivity(myIntent);
		    finish();
		}
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.wellcome);
		Button button_Weiter = (Button)findViewById(R.id.buttonWeiter);
		
	}
	
	public void openSettings(View view){
		Intent myIntent = new Intent(this, LoginNew.class);
		this.startActivity(myIntent);
	    finish();
	}
   /* public  void k(){

        String semPref;
        String groupPref;
        String url;
        SharedPreferences sharedPref = getSharedPreferences("Login",Context.MODE_PRIVATE);
        String fachPref = sharedPref.getString("fachName", "noValue");
        JSONObject fachs = new JSONObject();


        if(!fachs.containsKey(fachPref)){
            Intent myIntent = new Intent(this, Login.class);
            this.startActivity(myIntent);
            finish();
        }
        else{
            editor.putString("fachPref", fachPref);
            editor.putString("url", url);
            Intent myIntent = new Intent(this, Login.class);
            this.startActivity(myIntent);
            finish();
        }


    }*/
}
