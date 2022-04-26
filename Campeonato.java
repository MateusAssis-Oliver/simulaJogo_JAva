import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Campeonato{

    private String nome;
    private int quantmaxtimes = 10;
    private ArrayList<Time> times = new ArrayList<Time>();
    private ArrayList<SimulaJogo> jogospassados = new ArrayList<SimulaJogo>();

    /*CONTRUTOR*/

    public Campeonato(String nome)
    {
        this.nome = nome;
    }

    /************************/

    /*METODOS GET E SET*/
    public String getNome()
    {
        return nome;
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

    private boolean verificarJogo(SimulaJogo jogo)
    {
        if(jogospassados.size() > 0)
        {
            for(int i = 0; i < jogospassados.size();i++)
            {
                if(jogo.getTimeA() == jogospassados.get(i).getTimeA() || jogo.getTimeA() == jogospassados.get(i).getTimeB() &&
                jogo.getTimeB() == jogospassados.get(i).getTimeA() || jogo.getTimeB() == jogospassados.get(i).getTimeB())
                {
                    return true;
                }
                
            }
            return false;
        }
        else
            return false;
    }

    public void criarJogo(Time time1, Time time2)
    {
        if(times.size() >= 2)
        {
            SimulaJogo jogo = new SimulaJogo(time1, time2);


            if(!verificarJogo(jogo))
            {
                jogo.simularJogo();
                jogospassados.add(jogo);
            }
            else
            {
                if(jogospassados.size() == 0)
                    Menu.printErro("Impossivel simular jogo");
                else
                    Menu.printErro("Jogo ja aconteceu");
            }
        }
        else
            Menu.printErro("Não existe times suficiente");
    }

    public void imprimirTabela()
    {
        if(!times.isEmpty())
        {
            String [] tabela = new String[quantmaxtimes];
            organizarTabela();
            for(int i = 0;i < quantmaxtimes;i++)
            {
                tabela[i] = i+1 + times.get(i).showStatus();
            }
            Menu.printTabela(tabela);
        }
        else
            Menu.printErro("Não existe times no compeonato");
    }

    private void organizarTabela()
    {
        Collections.sort(times, Comparator.comparing(  Time::getPontuacao ));
    }

};