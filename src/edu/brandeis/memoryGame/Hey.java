

package edu.brandeis.memoryGame;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;

public class Hey extends Activity implements OnClickListener {

    /** Jared Dunn
     * jbs2011
     * pa4
     * this is the wlecome screen*/
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hey);
        
     // Set up click listeners for all the buttons
        View continueButton = findViewById(R.id.play_button);
        continueButton.setOnClickListener(this);
        
        View aboutButton = findViewById(R.id.about_button);
        aboutButton.setOnClickListener(this);
        
        }
    
    // this is what happends when the buttons are clicked. it uses a case and brake statements to choose the best choise based on what button you select
    public void onClick(View v) {
    	switch (v.getId()) {
    	
    	case R.id.play_button:
    		Intent j = new Intent(this, Test.class);
    		startActivity(j);
    		break;
    		
        
    	case R.id.about_button:
    		Intent i = new Intent(this, About.class);
    		startActivity(i);
    		break;
    	}
    }
    	
   
    	
}
