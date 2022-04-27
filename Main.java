class Main {
  public static void main(String[] args) {
    
    
    String nome = Menu.janelaStrCamp();
    Campeonato camp = new Campeonato(nome);

    while(true){

      int opc = Menu.startMenu();

      switch (opc) {
        case 1:
          String nomeTime = Menu.janelaStrTime();
          Time time = new Time(nomeTime);
          camp.cadastrarTimes(time);        
          break;
        case 2:
          String TimeA = Menu.janelaStrTime();
          Time timeA = new Time(TimeA);
          String TimeB = Menu.janelaStrTime();
          Time timeB = new Time(TimeB);
          camp.criarJogo(timeA, timeB);
          break;
        case 3:
          camp.imprimirTabela();
        default:
          break;
      }
      

      if( opc == 4 ){break;}
    }       
  }
}