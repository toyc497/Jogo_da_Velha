import java.util.Scanner;

class Main {
  //Função que valida vitória
  public static void validaVitoria(int[][] matriz, int num){
    int player = num;

    if(matriz[0][0]==player && matriz[0][1]==player && matriz[0][2]==player){
      System.out.println("Player "+player+" Ganhou!");
    }else if(matriz[1][0]==player && matriz[1][1]==player && matriz[1][2]==player){
      System.out.println("Player "+player+" Ganhou!");
    }else if(matriz[2][0]==player && matriz[2][1]==player && matriz[2][2]==player){
      System.out.println("Player "+player+" Ganhou!");
    }else if(matriz[0][0]==player && matriz[1][0]==player && matriz[2][0]==player){
      System.out.println("Player "+player+" Ganhou!");
    }else if(matriz[0][1]==player && matriz[1][1]==player && matriz[2][1]==player){
      System.out.println("Player "+player+" Ganhou!");
    }else if(matriz[0][2]==player && matriz[1][2]==player && matriz[2][2]==player){
      System.out.println("Player "+player+" Ganhou!");
    }else if(matriz[0][0]==player && matriz[1][1]==player && matriz[2][2]==player){
      System.out.println("Player "+player+" Ganhou!");
    }else if(matriz[0][2]==player && matriz[1][1]==player && matriz[2][0]==player){
      System.out.println("Player "+player+" Ganhou!");
    }

  }

  //Função imprime matriz(tabuleiro)
  public static void imprimeMatriz(int[][] matriz){
    System.out.println("\n");

    for(int i=0; i<3; i++){
      
      for(int j=0; j<3; j++){
        if(matriz[i][j] == 0){
          System.out.print("\t.");
        }else{
          System.out.print("\t"+matriz[i][j]);
        }
      }

      System.out.println("\n");
    }
  }

  //Função que cria o jogo e mostra o menu
  public static void createGame(){
    int[][] tabuleiro = new int[3][3];

    Scanner scan = new Scanner(System.in);

    System.out.println("\nNovo jogo (1)\nSair do jogo (2)\n");

    int gameOption = scan.nextInt();

    System.out.println("\nOpção: "+gameOption+"\n");

    if(gameOption == 1){
      
      //Loop para validar o Player e passar as coordenadas
      for(int i=1; i < 10; i++){

        if(i % 2 == 1){
          System.out.println("\n\nPlayer1");

          System.out.println("Digite a Linha: ");
          int lin = scan.nextInt();       

          System.out.println("Digite a Coluna: ");
          int col = scan.nextInt();

          tabuleiro[lin][col] = 1;

          imprimeMatriz(tabuleiro);

          validaVitoria(tabuleiro, 1);

        }else{
          System.out.println("\n\nPlayer2");

          System.out.println("Digite a Linha: ");
          int lin = scan.nextInt();

          System.out.println("Digite a Coluna: ");
          int col = scan.nextInt();       

          tabuleiro[lin][col] = 2;

          imprimeMatriz(tabuleiro);

          validaVitoria(tabuleiro, 2);

        }

      }

    }else{
      System.out.println("\n.......................\nCaso queira jogar execute o programa novamente\n\nBye Bye\n");
    }



  }

  //Main
  public static void main(String[] args) {

    System.out.print("\n\n\t\tJOGO DA VELHA\n\n");

    createGame();

  }
  
}//Fim do método Main