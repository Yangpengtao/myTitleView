package com.example.titleview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends Activity {

	private TitleView tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		TabHost tb=new TabHost(this);
		
		
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tv = (TitleView) findViewById(R.id.tv);
		tv.setleftBtnImg(R.drawable.back);
		tv.setTitle("≥Ã–Ú‘≥");
		tv.setleftBtnMarginLeft(10);
		tv.setBackgroundResource(R.drawable.delete_login_bg);
	}
}
