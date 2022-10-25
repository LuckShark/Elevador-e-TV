package Questao2TV;

public class Televisao {
    private int canal;
    private int volume;

    public int getCanal() {return canal;}
    public void setCanal(int canal) {this.canal = canal;}

    public int getVolume() {return volume;}
    public void setVolume(int volume) {this.volume = volume;}

    public void aumentarSom(){
        volume += 1;
        System.out.println("Volume aumentado em 1 unidade");
    }
    public void diminuirSom(){
        volume -= 1;
        System.out.println("Volume diminuido em 1 unidade");
    }

    public void trocaCanalUp(){
        canal += 1;
        System.out.println("Canal trocado +1");
    }
    public void trocaCanalDown(){
        canal -= 1;
        System.out.println("Canal trocado -1");
    }
    public void escolherCanal(int canal){
        this.canal = canal;
        System.out.println("Canal escolhido: "+canal);
    }

    public void consultarInfo(){
        System.out.println("=======================");
        System.out.println("Canal atual: "+canal);
        System.out.println("Volume atual: "+volume);
        System.out.println("=======================");
    }

}
