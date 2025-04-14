public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;  
    }
    public void desligar() {
        ligada = false;
    }
    public void aumentarVolume() {
        System.out.println("Aumentando o volume para: " + volume);
        //volume = volume + 1;
        volume++;
    }
    public void diminuirVolume() {
        System.out.println("Diminuindo o volume para: "+ volume);
        //volume = volume + 1;
        volume--;
    }
    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }
    public void aumentarCanal () {
        canal++;
        System.out.println("Mudando canal para: " + canal);
    }
    public void diminuirCanal (){
        canal--;
        System.out.println("Mudando canal para: " + canal);
    }

}