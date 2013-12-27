package com.prashant.adesara.roboguice.activities;

import roboguice.activity.RoboActivity;
import roboguice.inject.ContentView;
import roboguice.inject.InjectResource;
import roboguice.inject.InjectView;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

@ContentView(R.layout.activity_main)
public class MainActivity extends RoboActivity {
	
	@InjectView(R.id.txtHelloWorld) private TextView txtHelloWorld;
	@InjectView (R.id.imgView) private ImageView imgView;
	@InjectResource (R.drawable.ic_launcher) private Drawable drwImage;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		txtHelloWorld.setText("How are you?");
		imgView.setBackground(drwImage);
	}
}
