package Produtos;

public class Bebida extends Produto{

    private int litragem;

    public int getLitragem() {
        return litragem;
    }

    public void setLitragem(int litragem) {
        this.litragem = litragem;
    }

    @Override
    void exibeInfos() {
        System.out.println("Litragem: " + getLitragem() + "ml");
        super.exibeInfos();
    }
}
