

public class Time implements Comparable<Time>{

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
        pontuacao = 0;
        numJogos = 0;
        saldoGols = 0;
        golsMarcados = 0;
        golsSofridos = 0;
        numVitorias = 0;
        numDerrotas = 0;
        numEmpate = 0;
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
    }
    public int getGolsSofridos() {
        return golsSofridos;
    }
    public void setGolsSofridos(int golsSofridos) {
        this.golsSofridos += golsSofridos;
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
    
    public int getSaldoGols()
    {
        return saldoGols;
    }

    private void setSaldoGols()
    {
        saldoGols = golsMarcados - golsSofridos;
    }

    @Override
    public int compareTo(Time ptime) {
        if(ptime.getPontuacao() != getPontuacao())
            return Integer.compare(ptime.getPontuacao(), getPontuacao());
        return Integer.compare(ptime.getSaldoGols(), getSaldoGols());
    }
/* *************************************************************************** */

/* METODOS */

public String showStatus(){

    setSaldoGols();
    return
       "Nome: " + getName() + " - "  +
       "Numero de Jogos: " + getNumJogos() +   " - " +
       "Saldo de Gols: " + getSaldoGols() +  " - "  +
       "Gols Marcados: " + getGolsMarcados() +   " - " +
       "Gols Sofridos: " + getGolsSofridos() +   " - " +
       "Numero Vitorias: " + getNumVitorias() +   " - " +
       "Numero Derrotas: " + getNumDerrotas() +   " - " +
       "Empates: " + getNumEmpate() + " - " +
       "Pontuação: " + getPontuacao() + "\n";
 
}



};