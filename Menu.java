import javax.swing.JOptionPane;

public class Menu{


	public void startMenu(){

		String opc = JOptionPane.showInputDialog(null, "1 - Cadastrar Time \n 2 - Simula Jogo \n 3 - Sair");
		validaOpc(opc);
	};

	private int validaOpc (String opc ){
		try{
			int numero = 	Integer.parseInt(opc);
			return numero;

		}catch(NumberFormatException Erro){
			printErro("Errro de conversão de inteiro " + Erro.getMessage());
			return -1;
		}finally{
			startMenu();
		}
		
		
	}

	private void printErro(String msg) {
		JOptionPane.showMessageDialog(null, msg,"Mensagem De Erro", JOptionPane.ERROR_MESSAGE);
	}
	
}