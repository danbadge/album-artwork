package com.example.helloandroid;

import com.loopj.android.image.SmartImageView;

import android.os.Bundle;
import android.app.Activity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	//requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
    	super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_main);
       // getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.window_title);
       
    	SmartImageView image = (SmartImageView)findViewById(R.id.beatles);
    	String imageUrl = "http://www.beatlesbible.com/wp/media/abbey_road.jpg";
    	image.setImageUrl(imageUrl);        	
    }


    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }*/
    
}
