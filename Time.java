public class Time{

	private String name;
    private int numJogos;
    private int saldoGols;
    private int golsMarcados;
    private int golsSofridos;
    private int numVitorias;
    private int numDerrotas;
    private int numEmpate;


    /* METODOS GTES E SETS */

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getNumJogos() {
        return numJogos;
    }
    public void setNumJogos(int numJogos) {
        this.numJogos = numJogos;
    }

    public int getGolsMarcados() {
        return golsMarcados;
    }
    public void setGolsMarcados(int golsMarcados) {
        this.golsMarcados = golsMarcados;
    }
    public int getGolsSofridos() {
        return golsSofridos;
    }
    public void setGolsSofridos(int golsSofridos) {
        this.golsSofridos = golsSofridos;
    }
    public int getNumDerrotas() {
        return numDerrotas;
    }
    public void setNumDerrotas(int numDerrotas) {
        this.numDerrotas = numDerrotas;
    }
    public int getNumEmpate() {
        return numEmpate;
    }
    public void setNumEmpate(int numEmpate) {
        this.numEmpate = numEmpate;
    }
    public void setNumVitorias(int numVitorias) {
        this.numVitorias = numVitorias;
    }
    public int getNumVitorias() {
        return numVitorias;
    }
    public void setSaldoGols(int saldoGols) {
        this.saldoGols = saldoGols;
    }
    public int getSaldoGols() {
        return saldoGols;
    }
/* *************************************************************************** */

/* METODOS */

public void showStatus(){

    System.out.println(
       "Nome : " + name + " - "  +
       "Numero de Jogos : " + numJogos +   " - " +
       "Sauldo de Gols : " + saldoGols +  " - "  +
       "Gols Marcados : " + golsMarcados +   " - " +
       "Gols Sofridos : " + golsSofridos +   " - " +
       "Numero de Vitorias : " + numVitorias +   " - " +
       "Numero de Derrotas : " + numDerrotas +   " - " +
       "Empates : " + numEmpate + "\n"
 
    );
}

};