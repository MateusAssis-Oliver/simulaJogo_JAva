import java.util.Random;

public class SimulaJogo
{
    private Time A;
    private Time B;
	private int golstimeA;
    private int golstimeB;

    /********CONTRUTOR********/

    public SimulaJogo(Time A, Time B)
    {
        this.A = A;
        this.B = B;
    }

    /*************************/

    /* METODOS GET E SET */

    public Time getTimeA() {
        return A;
    }

    public Time getTimeB() {
        return B;
    }

    public int getGolstimeA() {
        return golstimeA;
    }

    public int getGolstimeB() {
        return golstimeB;
    }
    /*******************************************/

    public void simularJogo()
    {
        Random rand = new Random();
        golstimeA = rand.nextInt(8);
        golstimeB = rand.nextInt(8);
        computarJogo();
        Menu.printTela("Gols "+ A.getName() + " : " + golstimeA + "\n" +"Gols "+ B.getName() + " : " + golstimeB);
    }

    private void computarJogo()
    {
        if(golstimeA == golstimeB)
        {
            A.setGolsMarcados(golstimeA);
            A.setGolsSofridos(golstimeB);
            A.setNumJogos();
            A.setNumEmpate();

            B.setGolsMarcados(golstimeB);
            B.setGolsSofridos(golstimeA);
            B.setNumJogos();
            B.setNumEmpate();
        }
        else if(golstimeA > golstimeB)
        {
            A.setGolsMarcados(golstimeA);
            A.setGolsSofridos(golstimeB);
            A.setNumJogos();
            A.setNumVitorias();

            B.setGolsMarcados(golstimeB);
            B.setGolsSofridos(golstimeA);
            B.setNumJogos();
            B.setNumDerrotas();
        }
        else
        {
            B.setGolsMarcados(golstimeB);
            B.setGolsSofridos(golstimeA);
            B.setNumJogos();
            B.setNumVitorias();

            A.setGolsMarcados(golstimeA);
            A.setGolsSofridos(golstimeB);
            A.setNumJogos();
            A.setNumDerrotas();
        }
    }

}