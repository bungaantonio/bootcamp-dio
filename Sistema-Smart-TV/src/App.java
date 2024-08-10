public class App {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.estado);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("TV ligada? " + smartTv.estado);
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume: " + smartTv.volume);
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.canalSeguinte();
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.canalSeguinte();
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.trocaAleatoria(19);
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.desligar();
        System.out.println("TV ligada? " + smartTv.estado);

    }
}
