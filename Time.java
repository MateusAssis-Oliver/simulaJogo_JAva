public class Time{

    private String name;
    private int pontuacao;
    private int numJogos;
    private int saldoGols;
    private int golsMarcados;
    private int golsSofridos;
    private int numVitorias;
    private int numDerrotas;
    private int numEmpate;
 
    /*Construtor*/
    Time(String nome){
        name = nome;
    }
    
    /* METODOS GTES E SETS */

    public String getName() {
        return name;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public int getNumJogos() {
        return numJogos;
    }
    public void setNumJogos() {
        numJogos++;
    }

    public int getGolsMarcados() {
        return golsMarcados;
    }
    public void setGolsMarcados(int golsMarcados) {
        this.golsMarcados += golsMarcados;
        saldoGols = golsMarcados - golsSofridos;
    }
    public int getGolsSofridos() {
        return golsSofridos;
    }
    public void setGolsSofridos(int golsSofridos) {
        this.golsSofridos += golsSofridos;
        saldoGols = golsMarcados - golsSofridos;
    }
    public int getNumDerrotas() {
        return numDerrotas;
    }
    public void setNumDerrotas() {
        numDerrotas++;
        pontuacao += 0;
    }
    public int getNumEmpate() {
        return numEmpate;
    }
    public void setNumEmpate() {
        numEmpate++;
        pontuacao += 1;
    }
    public int getNumVitorias() {
        return numVitorias;
    }
    public void setNumVitorias() {
        numVitorias++;
        pontuacao += 3;
    }
/* *************************************************************************** */

/* METODOS */

public String showStatus(){

    return
       "Nome: " + name + " - "  +
       "Numero de Jogos: " + numJogos +   " - " +
       "Sauldo de Gols: " + saldoGols +  " - "  +
       "Gols Marcados: " + golsMarcados +   " - " +
       "Gols Sofridos: " + golsSofridos +   " - " +
       "Numero Vitorias: " + numVitorias +   " - " +
       "Numero Derrotas: " + numDerrotas +   " - " +
       "Empates: " + numEmpate +
       "Pontuação: " + pontuacao + "\n";
 
}


};