package Questao1Elevador;
//A classe deve armazenar o andar atual (térreo = 0),
// total de andares no prédio (desconsiderando o térreo),
// capacidade do elevador e quantas pessoas estão presentes nele.
public class Elevador {
    private int andarAtual;
    private int totalAnd;
    private int capacidade;
    private int qtdPessoas;


    public int getTotalAnd() {return totalAnd;}
    public void setTotalAnd(int totalAnd) {this.totalAnd = totalAnd;}

    public int getAndarAtual() {return andarAtual;}
    public void setAndarAtual(int andarAtual) {this.andarAtual = andarAtual;}

    public int getCapacidade() {return capacidade;}
    public void setCapacidade(int capacidade) {this.capacidade = capacidade;}

    public int getQtdPessoas() {return qtdPessoas;}
    public void setQtdPessoas(int qtdPessoas) {this.qtdPessoas = qtdPessoas;}

    public void inicializa(int capacidade, int totalAnd){
        this.capacidade = capacidade;
        this.totalAnd = totalAnd;
    }

    public void entra(){
        if (qtdPessoas < capacidade){
            qtdPessoas += 1;
            System.out.println("Uma pessoa entrou");
            System.out.println("Quantidade: "+qtdPessoas+" pessoa(s)");
        } else {
            System.out.println("Capacidade MÁXIMA!");
        }

    }

    public void sai(){
        if(qtdPessoas !=0){
            qtdPessoas -= 1;
            System.out.println("Uma pessoa saiu");
            System.out.println("Quantidade: "+qtdPessoas+" pessoas");
        } else {
            System.out.println("Elevador vazio");
        }
    }

    public void sobe(){
        if(andarAtual < totalAnd){
            andarAtual += 1;
            System.out.println("Subiu 1 andar");
            System.out.println("Andar atual:"+andarAtual+"º andar");
        } else {
            System.out.println("Último andar!");
        }

    }

    public void desce(){
        if (andarAtual > 0){ //No meu prédio, 0 é o térreo, apliquei aqui
            andarAtual -= 1;
            System.out.println("Desceu 1 andar");
            System.out.println("Andar atual:"+andarAtual+"º andar");
        } else {
            System.out.println("Não é possível descer mais");
        }

    }

}
