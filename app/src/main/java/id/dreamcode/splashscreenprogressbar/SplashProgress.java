/*
Copyright 2016 Dreamcode Developer

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
 
	 http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

 */

package id.dreamcode.splashscreenprogressbar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
 
public class SplashProgress extends Activity {
   
  //lamanya waktu splashscreen
  private static int splashInterval = 12000;
   
  @Override
  protected void onCreate(Bundle savedInstanceState) {
   super.onCreate(savedInstanceState);
   requestWindowFeature(Window.FEATURE_NO_TITLE);
   getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
     WindowManager.LayoutParams.FLAG_FULLSCREEN);      
   
   setContentView(R.layout.splashmain);
   
   new Handler().postDelayed(new Runnable() {
     
     
    @Override
    public void run() {
     // TODO Auto-generated method stub
     Intent i = new Intent(SplashProgress.this, MainActivity.class);
     startActivity(i);
     
     
                                 //jeda selesai Splashscreen
     this.finish();
        }
 
 private void finish() {
  // TODO Auto-generated method stub
 
 }
     }, splashInterval);
     
   };
     
  }