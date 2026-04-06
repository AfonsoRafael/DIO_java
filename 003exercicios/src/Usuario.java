public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        System.out.println("A TV esta ligada? "+ smartTv.ligada);
        System.out.println("Qual o canal? " + smartTv.canal);
        System.out.println("Qual o volume? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("A tv esta ligada? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Qual o volume? " + smartTv.volume);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        System.out.println("Qual o canal? " + smartTv.canal);
    }
}
