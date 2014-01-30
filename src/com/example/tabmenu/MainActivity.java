package com.example.tabmenu;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		TabHost tabHost = (TabHost)findViewById(android.R.id.tabhost);
		TabSpec tab1 = tabHost.newTabSpec("Tab 1");
		Intent tab1Intent = new Intent(this, firstActivity.class);
		tab1.setContent(tab1Intent);
		tab1.setIndicator("First Tab");
		
		TabSpec tab2 = tabHost.newTabSpec("Tab 2");
		Intent tab2Intent = new Intent(this, secondActivity.class);
		tab2.setContent(tab2Intent);
		tab2.setIndicator("Second Tab");
		
		TabSpec tab3 = tabHost.newTabSpec("Tab 3");
		Intent tab3Intent = new Intent(this, thirdActivity.class);
		tab3.setContent(tab3Intent);
		tab3.setIndicator("Third Tab");
		
		
		tabHost.addTab(tab1);
		tabHost.addTab(tab2);
		tabHost.addTab(tab3);
				
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
