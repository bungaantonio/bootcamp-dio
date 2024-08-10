public class App {
    public static void main(String[] args) throws Exception {

        Calculadora calculadora = new Calculadora();
        System.out.println("Calculadora:");

        int a = 10;
        int b = 6;
        System.out.println("Soma: "+calculadora.somar(a, b));
        System.out.println("Subtração: "+calculadora.subtrair(a, b));
        System.out.println("Multiplicação: "+calculadora.multiplicar(a, b));
        System.out.println("Divisão: "+calculadora.dividir(a, b));

    }
}
