package com.appsotimos.aniversrio;
import java.util.Random;
import android.widget.Button;
import android.widget.TextView;
import android.content.Context;
import java.util.ArrayList;
import android.media.MediaPlayer;

public class Pergunta {
    private Context context;
    private Random random = new Random();
    private int aleatorio;
    private int pontos = 0;

    private String[] pergunta ={"foi o fundador da raça carnívora boliniana,também conhecido por seu irmão como bola, quem foi esse?","Te ensinou como ser e táticas de gado,falecendo no dia 26 de agosto por um botijão de gás, quem foi essa?","Foi  um cachorro, fugiu ainda na infância, após alguns anos, ele apareceu e ainda te latiu","É uma fruta,toda vez que vc fala uma história específica dela,mais uma dessa fruta apodrece,que fruta é essa?","Nessa rede social, em um grupo de lego, vc fez maior zoação, destruiu o grupo e seu irmão virou o dono, em qual rede social isso aconteceu?","Seu jogador favorito,com 5 bolas de ouro,atuou por vários anos no Real Madrid. Quem é esse jogador?","Foi seu primeiro celular digital, uma fusão de Windows e mobile, não conectava nem em bluetooth e nem em wafi, que celular foi esse?","Sua cor preferida","Uma jongonga,populamente conhecido como Joncognonga,como ele era chamado por você?","Em um dia aleatório,um cara parou e te disse: Meu nome é [...] você se lembra de min?Vc ficou motivado a voltar jogar um jogo. Qual era o nome dessa pessoa?","Sua saga de filmes favorita","Foi um dos primeiros jogos de verdade que vc jogou e zerou, em um emulador de ps2, com baixo desempenho em função do seu celular. Que jogo foi esse?","Um dos objetos mais usados na sua infância, você o utilizava para a caça de pássaros, apenas por diversão. Que objeto é esse?","Você sempre sonhou em jogar esse jogo, você sempre viu outras pessoas jogando ele desde o seu lançamento, no dia 23 de Maio de 2021 realizou o desejo iniciar uma jogatina enorme. Que jogo é esse?","Quando criança, vc achava que esse local era a capital de São Paulo. Você brincava de ir um ponto ao outro e dizer que vc estáva indo nesse local e voltando. Que Local é esse?"};
  
    private ArrayList<Integer> contem = new ArrayList<Integer>();  
    private int tamanho = 0;             
    private int[] certa = {1,2,4,1,4,2,3,4,2,3,1,2,1,4,3};
    String[] alternativa1 =  {"Bolinha","Pinthusynho","Boby","Maritaco"};
    boolean um = false;

    String alternativa2[] = {"Ellen","Geise","Mickey","Morena"};
    boolean dois = false;

    String alternativa3[] = {"Bola Gorda","Mickey","Joãozinho","Bobby"};
    boolean tres = false;

    String alternativa4[] = {"Farinha","Amora","Manga","Alface"};
    boolean quatro = false;

    String alternativa5[] = {"Instragam","Whatsapp","Discord","Facebook"};
    boolean cinco = false;

    String alternativa6[] = {"Mesi","Cristiano Ronaldo","Vinicíus Júnior","Mbappe"};
    boolean seis = false;

    String alternativa7[] = {"navicity","J2 Core","Nokia Lunina 6100","Nokia 2.4"};
    boolean sete = false;

    String alternativa8[] = {"Vermelho","Branco","Verde","Azul"};
    boolean oito = false;

    String alternativa9[] = {"Maritaco","Joãozinho","Joncongnonga","Pato"};
    boolean nove = false;

    String alternativa10[] = {"Romário","Bruno","Reginaldo","Walker"};
    boolean deis = false;

    String alternativa11[] = {"Transformers","Deuses Gregos","Velozes e furiosos ","Rio"};
    boolean onze = false;

    String alternativa12[] = {"Fifa Street","Gta Libert City Stories","Dragon Ball Z","Real Gangster"};
    boolean doze = false;

    String alternativa13[] = {"Estilingue","Pistola d'água","Arco","Birimbau"};
    boolean treze = false;

    String alternativa14[] = {"Gta 5","Red Dead Redepention","Minecraft","Free Fire"};
    boolean quatorze = false;

    String alternativa15[] = {"São Paulo","Belo Horizonte","Piauí","Acre"};
    boolean quinze = false;

    

     public Pergunta(Context context){
       this.context = context;
     }

     public void atualizar(){
       aleatorio = random.nextInt(pergunta.length);
       if(contem.contains(aleatorio)){
         aleatorio = random.nextInt(pergunta.length);
       }

     }

     public void atualizarBotoes(TextView pergunta, Button bt1, Button bt2,Button bt3,Button bt4){
       atualizar();
      if(contem.contains(aleatorio)){
        atualizar();
      }
      contem.add(aleatorio);
      
       switch(aleatorio){
    
        case 0:

 pergunta.setText(this.pergunta[aleatorio]);
          bt1.setText(alternativa1[0]);
          bt2.setText(alternativa1[1]);
          bt3.setText(alternativa1[2]);
          bt4.setText(alternativa1[3]);

         break;

        case 1:

 pergunta.setText(this.pergunta[aleatorio]);
          bt1.setText(alternativa2[0]);
          bt2.setText(alternativa2[1]);
          bt3.setText(alternativa2[2]);
          bt4.setText(alternativa2[3]);
          
         break;

        case 2:

 pergunta.setText(this.pergunta[aleatorio]);
          bt1.setText(alternativa3[0]);
          bt2.setText(alternativa3[1]);
          bt3.setText(alternativa3[2]);
          bt4.setText(alternativa3[3]);
          
         break;

        case 3:

 pergunta.setText(this.pergunta[aleatorio]);
          bt1.setText(alternativa4[0]);
          bt2.setText(alternativa4[1]);
          bt3.setText(alternativa4[2]);
          bt4.setText(alternativa4[3]);

         break;

        case 4:

 pergunta.setText(this.pergunta[aleatorio]);
          bt1.setText(alternativa5[0]);
          bt2.setText(alternativa5[1]);
          bt3.setText(alternativa5[2]);
          bt4.setText(alternativa5[3]);
          

         break;

        case 5:

 pergunta.setText(this.pergunta[aleatorio]);
          bt1.setText(alternativa6[0]);
          bt2.setText(alternativa6[1]);
          bt3.setText(alternativa6[2]);
          bt4.setText(alternativa6[3]);

         break;

        case 6:

 pergunta.setText(this.pergunta[aleatorio]);
          bt1.setText(alternativa7[0]);
          bt2.setText(alternativa7[1]);
          bt3.setText(alternativa7[2]);
          bt4.setText(alternativa7[3]);
          sete = true;
         
         break;

        case 7:
         
 pergunta.setText(this.pergunta[aleatorio]);
          bt1.setText(alternativa8[0]);
          bt2.setText(alternativa8[1]);
          bt3.setText(alternativa8[2]);
          bt4.setText(alternativa8[3]);
          
         break;

        case 8:

 pergunta.setText(this.pergunta[aleatorio]);
          bt1.setText(alternativa9[0]);
          bt2.setText(alternativa9[1]);
          bt3.setText(alternativa9[2]);
          bt4.setText(alternativa9[3]);
          
         break;

        case 9:

 pergunta.setText(this.pergunta[aleatorio]);
          bt1.setText(alternativa10[0]);
          bt2.setText(alternativa10[1]);
          bt3.setText(alternativa10[2]);
          bt4.setText(alternativa10[3]);
          

         break;

        case 10:

 pergunta.setText(this.pergunta[aleatorio]);
          bt1.setText(alternativa11[0]);
          bt2.setText(alternativa11[1]);
          bt3.setText(alternativa11[2]);
          bt4.setText(alternativa11[3]);

         break;

        case 11:

 pergunta.setText(this.pergunta[aleatorio]);
          bt1.setText(alternativa12[0]);
          bt2.setText(alternativa12[1]);
          bt3.setText(alternativa12[2]);
          bt4.setText(alternativa12[3]);

         break;

        case 12:

 pergunta.setText(this.pergunta[aleatorio]);
          bt1.setText(alternativa13[0]);
          bt2.setText(alternativa13[1]);
          bt3.setText(alternativa13[2]);
          bt4.setText(alternativa13[3]);

         break;

        case 13:
         
 pergunta.setText(this.pergunta[aleatorio]);
          bt1.setText(alternativa14[0]);
          bt2.setText(alternativa14[1]);
          bt3.setText(alternativa14[2]);
          bt4.setText(alternativa14[3]);

         break;

        case 14:

 pergunta.setText(this.pergunta[aleatorio]);
          bt1.setText(alternativa15[0]);
          bt2.setText(alternativa15[1]);
          bt3.setText(alternativa15[2]);
          bt4.setText(alternativa15[3]);
         
         break; 

         }  


     }

     public boolean atualizarResposta(int resposta,Button bt1,Button bt2,Button bt3,Button bt4){

       if(aleatorio == 0 ){
         if(resposta == certa[aleatorio]){
          bt1.setBackgroundColor(context.getResources().getColor(R.color.vitoria));
          pontos += 5;
          return true;
         }
         
       }

       if(aleatorio == 1){
         if(resposta == certa[aleatorio]){
          bt2.setBackgroundColor(context.getResources().getColor(R.color.vitoria));
          pontos += 5;
          return true;
         }        
       }

       if(aleatorio == 2){
         if(resposta == certa[aleatorio]){
          bt4.setBackgroundColor(context.getResources().getColor(R.color.vitoria));
          pontos += 5;

          return true;

         }        
      }

        if(aleatorio == 3){
         if(resposta == certa[aleatorio]){
          bt1.setBackgroundColor(context.getResources().getColor(R.color.vitoria));
          pontos += 5;

          return true;

         }        
       }

        if(aleatorio == 4){
         if(resposta == certa[aleatorio]){
          bt4.setBackgroundColor(context.getResources().getColor(R.color.vitoria));
          pontos += 5;

          return true;

         }        
       }

        if(aleatorio == 5){
         if(resposta == certa[aleatorio]){
          bt2.setBackgroundColor(context.getResources().getColor(R.color.vitoria));
          pontos += 5;
          return true;
         }  
       }      

        if(aleatorio == 6){
         if(resposta == certa[aleatorio]){
          bt3.setBackgroundColor(context.getResources().getColor(R.color.vitoria));
          pontos += 5;
          return true;
         }   
       }

        if(aleatorio == 7){
         if(resposta == certa[aleatorio]){
          bt4.setBackgroundColor(context.getResources().getColor(R.color.vitoria));
          pontos += 5;
          return true;
         }             
       }

       if(aleatorio == 8){
         if(resposta == certa[aleatorio]){
          bt2.setBackgroundColor(context.getResources().getColor(R.color.vitoria));
          pontos += 5;
          return true;
         }             
       }

       if(aleatorio == 9){
         if(resposta == certa[aleatorio]){
          bt3.setBackgroundColor(context.getResources().getColor(R.color.vitoria));
          pontos += 5;
          return true;
         }             
       }

       if(aleatorio == 10){
         if(resposta == certa[aleatorio]){
          bt1.setBackgroundColor(context.getResources().getColor(R.color.vitoria));
          pontos += 5;
          return true;
         }             
       }

       if(aleatorio == 11){
         if(resposta == certa[aleatorio]){
          bt2.setBackgroundColor(context.getResources().getColor(R.color.vitoria));
          pontos += 5;
          return true;
         }             
       }

       if(aleatorio == 12){
         if(resposta == certa[aleatorio]){
          bt1.setBackgroundColor(context.getResources().getColor(R.color.vitoria));
          pontos += 5;
          return true;
         }             
       }

       if(aleatorio == 13){
         if(resposta == certa[aleatorio]){
          bt4.setBackgroundColor(context.getResources().getColor(R.color.vitoria));
          pontos += 5;
          return true;
         }             
       }

       if(aleatorio == 14){
         if(resposta == certa[aleatorio]){
          bt3.setBackgroundColor(context.getResources().getColor(R.color.vitoria));
          pontos += 5;
          return true;
         }             
       } 

       return false;

     }

     public void erro(int resposta,Button bt1,Button bt2,Button bt3,Button bt4){
      if(atualizarResposta(resposta,bt1,bt2,bt3,bt4) == false){
        
       if(resposta == 1){
bt1.setBackgroundColor(context.getResources().getColor(R.color.erro));
       }else if(resposta == 2){
bt2.setBackgroundColor(context.getResources().getColor(R.color.erro));
       }else if(resposta == 3){
         bt3.setBackgroundColor(context.getResources().getColor(R.color.erro));
       }else if(resposta == 4){
bt4.setBackgroundColor(context.getResources().getColor(R.color.erro));
       }

      }

     }


     public void reproduzir(MediaPlayer ad1,MediaPlayer ad2,MediaPlayer ad3,MediaPlayer ad4,MediaPlayer ad5,MediaPlayer ad6,MediaPlayer ad7,MediaPlayer ad8,MediaPlayer ad9,MediaPlayer ad10,MediaPlayer ad11,MediaPlayer ad12,MediaPlayer ad13,MediaPlayer ad14,MediaPlayer ad15){

switch(aleatorio){
    
        case 0:
         ad1.start();

         break;

        case 1:
         ad2.start();
          
         break;

        case 2:
         ad3.start();

         break;

        case 3:
         ad4.start();

         break;

        case 4:
         ad5.start();

         break;

        case 5:
         ad6.start();

         break;

        case 6:
         ad7.start();
         
         break;

        case 7:
         ad8.start();
          
         break;

        case 8:
         ad9.start();
          
         break;

        case 9:
         ad10.start();         

         break;

        case 10:

         ad11.start();

         break;

        case 11:

         ad12.start();

         break;

        case 12:
         ad13.start();

         break;

        case 13:
         
         ad14.start();
         break;

        case 14:
         ad15.start();
         
         break; 

         }  

     }

     public boolean venceu(TextView text){
       
       if(this.pontos >= 150){
         return true;
       }
       String pontos = "Pontos:";
       pontos += this.pontos;
       text.setText(pontos);
       return false;
     }

}