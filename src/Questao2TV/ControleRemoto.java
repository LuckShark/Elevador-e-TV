package Questao2TV;

public class ControleRemoto {
    public static void main(String[] args) {
        Televisao televisao = new Televisao();
        televisao.consultarInfo(); //começa sem nada
        televisao.aumentarSom();
        televisao.aumentarSom();
        televisao.aumentarSom();
        televisao.trocaCanalUp();
        televisao.trocaCanalUp();
        televisao.escolherCanal(13);
        televisao.trocaCanalDown();
        televisao.consultarInfo();
    }
}
