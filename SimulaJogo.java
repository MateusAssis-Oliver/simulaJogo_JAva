public class SimulaJogo
{
    private Time A;
    private Time B;
	private int golstimeA;
    private int golstimeB;

    /* METODOS GET E SET */

    public int getGolstimeA() {
        return golstimeA;
    }
    public void setGolstimeA(int golstimeA) {
        this.golstimeA = golstimeA;
    }

    public int getGolstimeB() {
        return golstimeB;
    }
    public void setGolstimeB(int golstimeB) {
        this.golstimeB = golstimeB;
    }
    /*******************************************/

    public void simularJogo(Time A, Time B)
    {
        this.A = A;
        this.B = B;
    }

    public void computarJogo()
    {
        
    }

}