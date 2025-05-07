package com.appsotimos.aniversrio;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.Window;

public class Menu extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.menu);

        
    }

    public void tocou(View view){
      switch(view.getId()){

      case R.id.go:
       Intent jogo = new Intent(Menu.this,MainActivity.class);
       startActivity(jogo);
      }
    }

}