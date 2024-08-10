public class Operadores {
    public static void main(String[] args) {
        boolean expressao = true;

        int a = 3;
        int b = 5;

        expressao = a != b ? false : true;

        if (expressao) {
            System.out.println("Estou dependendo de a e b");
        }else{
            System.out.println("O estado da variavel expressao mudou!");
        }
    }
}
