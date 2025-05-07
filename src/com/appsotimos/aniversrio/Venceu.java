package com.appsotimos.aniversrio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.content.Intent;
import android.view.View;
  
public class Venceu extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
 requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.venceu);

        
    } 
    public void tocou(View view){
      switch(view.getId()){

         case R.id.menu:
            Intent menu = new Intent(Venceu.this,Menu.class);
            startActivity(menu);
      }

    }
}