import javax.swing.JOptionPane;

public class Menu{


	public static int startMenu(){

		String opc = JOptionPane.showInputDialog(null, "1 - Cadastrar Time \n 2 - Simula Jogo \n 3 - Sair");

		return validaInt(opc);

	};


    public static int validaInt(String opc){

        try{

			int numero = Integer.parseInt(opc);
			return numero;
            

		}catch(NumberFormatException Erro){
			printErro("Errro opção invalida " + Erro.getMessage());
			startMenu();
			return -1;
		

		}

    }

    public static void printErro(String msg) {
		JOptionPane.showMessageDialog(null, msg,"Mensagem De Erro", JOptionPane.ERROR_MESSAGE);
	}

	public static void printTabela(String [] tabela)
	{
		JOptionPane.showMessageDialog(null, tabela);
	}

	public static void printTela(String print)
	{
		JOptionPane.showMessageDialog(null, print);
	}

	public static String janelaStrCamp(){
		
		String nome = JOptionPane.showInputDialog(null, "Insira o nome do Campeonato");

		return nome;
		
	}

	public static String janelaStrTime(){
		
		String nome = JOptionPane.showInputDialog(null, "Insira o nome do Time");

		return nome;
		
	}



    
}