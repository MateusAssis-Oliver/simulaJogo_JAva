import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Campeonato{

    private String nome;
    private int quantmaxtimes = 10;
    private ArrayList<Time> times = new ArrayList<Time>();

    /*METODOS GET E SET*/
    public String getNome()
    {
        return nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public int getQuantMaxTimes()
    {
        return quantmaxtimes;
    }
    public void setQuantMaxTimes(int quantmaxtimes)
    {
        this.quantmaxtimes = quantmaxtimes;
    }
    /********************************************/

    public void cadastrarTimes(Time time)
    {
        if(times.size() <= quantmaxtimes)
        {
            times.add(time);
        }
    }

    private boolean verificarJogo(Time time1, Time time2)
    {
        return time1.percorreJogoPassado(time2);
    }

    public void criarJogo(Time time1, Time time2)
    {
        if(!verificarJogo(time1, time2))
        {
            SimulaJogo simulajogo = new SimulaJogo();
            simulajogo.simularJogo(time1,time2);
        }
    }

    public void imprimirTabela()
    {
        if(!times.isEmpty())
        {
            for(int i = 0;i < quantmaxtimes;i++)
            {
                times.get(i).showStatus();
            }
        }
    }

    public void computarPodio()
    {
        Collections.sort(times, Comparator.comparing(Time::getPontuacao));
        for(int i = 0; i < 3; i++)
        {
            System.out.println( i+1 + " " + times.get(i).getName() + " - ");
        }
    }

};