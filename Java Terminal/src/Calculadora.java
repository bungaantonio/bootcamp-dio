/**
 * <h1>Calculadora</h1>
 * A classe <b>Calculadora</b> realiza operações matemáticas básicas entre números inteiros,
 * incluindo soma, subtração, multiplicação e divisão.
 * <p>
 * <b>Note:</b> Esta classe foi desenvolvida para fins educacionais e é uma ferramenta simples
 * para operações aritméticas. Consulte a documentação dos métodos para entender como utilizá-los.
 * </p>
 * 
 * @author bungadass
 * @version 1.0
 * @since 09/08/2024
 */
public class Calculadora {

    /**
     * Realiza a soma de dois números inteiros.
     *
     * @param num1 o primeiro número a ser somado
     * @param num2 o segundo número a ser somado
     * @return o resultado da soma de num1 e num2
     */
    public int somar(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * Realiza a subtração entre dois números inteiros.
     *
     * @param num1 o número a ser subtraído
     * @param num2 o número a ser subtraído de num1
     * @return o resultado da subtração de num1 menos num2
     */
    public int subtrair(int num1, int num2) {
        return num1 - num2;
    }

    /**
     * Realiza a multiplicação de dois números inteiros.
     *
     * @param num1 o primeiro número a ser multiplicado
     * @param num2 o segundo número a ser multiplicado
     * @return o resultado da multiplicação de num1 e num2
     */
    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    /**
     * Realiza a divisão entre dois números inteiros.
     * <p>
     * <b>Note:</b> Se num2 for 0, este método lançará uma 
     * {@link ArithmeticException} para indicar divisão por zero.
     * </p>
     *
     * @param num1 o dividendo
     * @param num2 o divisor
     * @return o resultado da divisão de num1 por num2
     * @throws ArithmeticException se num2 for igual a 0
     */
    public double dividir(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return (double) num1 / num2;
    }
}
