package com.a4455jkjh.apktool;

import android.app.Application;
import com.a4455jkjh.apktool.util.Settings;
import java.security.Security;
import sun1.security.provider.JavaProvider;

public class ApktoolApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		Security.addProvider(new JavaProvider());
		/*new Thread(){
			@Override
			public void run() {
				
			}
		}.start();*/
		Settings.init(ApktoolApplication.this);
	}

}
