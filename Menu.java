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
		JOptionPane.showInputDialog(null, tabela);
	}



    
}