public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.mudarCanal(10);
        System.out.println ("Canal atual: " + smartTv.canal);
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        
        System.out.println ("Volume atual: " + smartTv.volume);
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
    
        System.out.println ("Volume atual: " + smartTv.volume);
        System.out.println ("TV está ligada? " + smartTv.ligada);
       
        

        smartTv.ligar();
        System.out.println ("Novo status - A TV está ligada? " + smartTv.ligada);
        System.out.println("Novo comando!");
        smartTv.desligar();
        System.out.println("Novo status - A TV está ligada? " + smartTv.ligada);
        System.out.println("FIM");
    
    }
}
