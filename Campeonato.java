import java.util.ArrayList;
import java.util.Collections;

public class Campeonato{

    private String nome;
    private int quantmaxtimes;
    private ArrayList<Time> times;
    private ArrayList<SimulaJogo> jogospassados;

    /*CONTRUTOR*/

    public Campeonato(String nome)
    {
        this.nome = nome;
        quantmaxtimes = 10;
        times = new ArrayList<Time>();
        jogospassados = new ArrayList<SimulaJogo>();
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

    private int getIndexOf(Time time)
    {
        for(int i = 0; i < times.size();i++)
        {
            if(time.getName().equals(times.get(i).getName()))
            {
                return i;
            }
        }
        return -1;
    }
    /********************************************/

    public void cadastrarTimes(Time time)
    {
        if(getIndexOf(time) == -1)
        {
            if(times.size() <= quantmaxtimes)
            {
                times.add(time);
            }
        }
        else
            Menu.printErro("Time ja resgistrado");
    }

    private boolean verificarJogo(SimulaJogo jogo)
    {
        if(jogospassados.size() > 0)
        {
            for(int i = 0; i < jogospassados.size(); i++)
            {
                if((jogo.getTimeA().getName().equals(jogospassados.get(i).getTimeA().getName()) || jogo.getTimeA().getName().equals(jogospassados.get(i).getTimeB().getName())) &&
                (jogo.getTimeB().getName().equals(jogospassados.get(i).getTimeA().getName()) || jogo.getTimeB().getName().equals(jogospassados.get(i).getTimeB().getName())))
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
            int indext1 = getIndexOf(time1);
            int indext2 = getIndexOf(time2);
            if(indext1 >=0 && indext2 >=0)
            {
                SimulaJogo jogo = new SimulaJogo(times.get(indext1), times.get(indext2));
                if(!verificarJogo(jogo))
                {
                    jogo.simularJogo();
                    jogospassados.add(jogo);
                }
                else
                    Menu.printErro("Impossivel simular jogo");
            }
            else
                Menu.printErro("Um dos times não foi cadastrado");
        }
        else
            Menu.printErro("Não existe times suficiente");
    }

    public void imprimirTabela()
    {
        if(!times.isEmpty())
        {
            String tabela = new String();
            organizarTabela();
            for(int i = 0;i < times.size();i++)
            {
                tabela += i+1 + " | " + times.get(i).showStatus();
            }
            Menu.printTabela(tabela);
        }
        else
            Menu.printErro("Não existe times no compeonato");
    }

    private void organizarTabela()
    {
        Collections.sort(times);
    }

    

};