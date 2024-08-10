/**
 * <h1>Sistema SmartTv</h1>
 * O sistema SmartTv realiza as operações básica de uma TV
 * <p>
 * <b>Note:</b> Leia a documentação desta classe com atenção para estar a par do
 * seu funcionamento
 * 
 * @author bungadass
 * @version 1.0
 * @since 09/08/2024
 * 
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