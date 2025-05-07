package com.appsotimos.aniversrio;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;
import android.content.Context;
import android.content.Intent;
import android.view.Window;
import android.media.MediaPlayer;


public class MainActivity extends Activity {
    
    Context ctx = MainActivity.this;

    Button bt1,bt2,bt3,bt4,confirmar,avancar,voltar;
    TextView texto,pontos;
    MediaPlayer audio1,audio2,audio3,audio4,audio5,audio6,audio7,audio8,audio9,audio10,audio11,audio12,audio13,audio14,audio15;

    int resposta = 0;

    String selecionado = "";

    Pergunta pgt = new Pergunta(MainActivity.this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
requestWindowFeature(Window.FEATURE_NO_TITLE);
 
       setContentView(R.layout.activity_main);
        bt1=(Button)findViewById(R.id.button);
        bt2=(Button)findViewById(R.id.button2);
        bt3=(Button)findViewById(R.id.button3);
        bt4=(Button)findViewById(R.id.button4);
        texto =(TextView)findViewById(R.id.pergunta);

pgt.atualizarBotoes(texto,bt1,bt2,bt3,bt4);


    }
    public void onClickButton(View view){
     bt1=(Button)findViewById(R.id.button);
     bt2=(Button)findViewById(R.id.button2);
     bt3=(Button)findViewById(R.id.button3);
     bt4=(Button)findViewById(R.id.button4);
     confirmar =(Button)findViewById(R.id.confirmar);
     avancar =(Button)findViewById(R.id.avancar);
     voltar =(Button)findViewById(R.id.voltar);
     pontos =(TextView)findViewById(R.id.score);
     audio1 = MediaPlayer.create(this,R.raw.audio1);
     audio2 = MediaPlayer.create(this,R.raw.audio2);
     audio3 = MediaPlayer.create(this,R.raw.audio3);
     audio4 = MediaPlayer.create(this,R.raw.audio4);
     audio5 = MediaPlayer.create(this,R.raw.audio5);
     audio6 = MediaPlayer.create(this,R.raw.audio6);
     audio7 = MediaPlayer.create(this,R.raw.audio7);
     audio8 = MediaPlayer.create(this,R.raw.audio8);
     audio9 = MediaPlayer.create(this,R.raw.audio9);
     audio10 = MediaPlayer.create(this,R.raw.audio10);
     audio11 = MediaPlayer.create(this,R.raw.audio11);
     audio12 = MediaPlayer.create(this,R.raw.audio12);
     audio13 = MediaPlayer.create(this,R.raw.audio13);
     audio14 = MediaPlayer.create(this,R.raw.audio14);
     audio15 = MediaPlayer.create(this,R.raw.audio15);

     switch(view.getId()){

       case R.id.button:
        if(resposta ==0){
bt1.setBackgroundColor(ctx.getResources().getColor(R.color.selecionado));
         resposta = 1;
         confirmar.setVisibility(View.VISIBLE);

         }
        break;

        case R.id.button2:
         if(resposta == 0){
bt2.setBackgroundColor(ctx.getResources().getColor(R.color.selecionado));
          resposta = 2;
         confirmar.setVisibility(View.VISIBLE);
         }
        break;

        case R.id.button3:
         if(resposta ==0){
bt3.setBackgroundColor(ctx.getResources().getColor(R.color.selecionado));
         resposta = 3;
         confirmar.setVisibility(View.VISIBLE);

         }

        break;

        case R.id.button4:
         if(resposta ==0){
bt4.setBackgroundColor(ctx.getResources().getColor(R.color.selecionado));
         resposta = 4;
         confirmar.setVisibility(View.VISIBLE);

         }

        break;

        case R.id.confirmar:
 pgt.atualizarResposta(resposta,bt1,bt2,bt3,bt4);
         pgt.erro(resposta,bt1,bt2,bt3,bt4);
         confirmar.setVisibility(View.GONE);
         if(pgt.atualizarResposta(resposta,bt1,bt2,bt3,bt4)==true){
          avancar.setVisibility(View.VISIBLE);
         }else{
          voltar.setVisibility(View.VISIBLE);         
         } 
      
         break;
 
         case R.id.avancar:

          resposta = 0;
bt1.setBackgroundColor(ctx.getResources().getColor(R.color.colorAccent));
bt2.setBackgroundColor(ctx.getResources().getColor(R.color.colorAccent));
bt3.setBackgroundColor(ctx.getResources().getColor(R.color.colorAccent));
bt4.setBackgroundColor(ctx.getResources().getColor(R.color.colorAccent));

pgt.atualizarBotoes(texto,bt1,bt2,bt3,bt4);
          avancar.setVisibility(View.GONE);

          if(pgt.venceu(pontos) == true){
            Intent venceu = new Intent(ctx,Venceu.class);
            startActivity(venceu);
          }

          break;

         case R.id.voltar:
            Intent perdeu = new Intent(ctx,Menu.class);
            startActivity(perdeu);   
          break;

         case R.id.som:
pgt.reproduzir(audio1,audio2,audio3,audio4,audio5,audio6,audio7,audio8,audio9,audio10,audio11,audio12,audio13,audio14,audio15);
          break;
     }
    }

}