/**
 * SmartTv
 */
public class SmartTv {

    boolean estado = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        estado = true;
    }

    public void desligar() {
        estado = false;
    }

    public void aumentarVolume() {
        ++volume;
    }

    public void reduzirVolume() {
        --volume;
    }

    public void trocarSeguinte() {
        ++canal;
    }

    public int trocarAleatoriamente(int canal) {
        return this.canal = canal;
    }

}