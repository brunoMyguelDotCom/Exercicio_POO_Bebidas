import Produtos.bebiveis.Cerveja;

public class Teste {
    public static void main(String[] args) {
        Cerveja cerveja_01 = new Cerveja();

        cerveja_01.setNome("Heineken - Long Neck");
        cerveja_01.setTipo("Cerveja");
        cerveja_01.setMarca("Heineken");
        cerveja_01.setEhAlcolico(true);
        cerveja_01.setLitragem(330);
        cerveja_01.setCustoCompra(1.65);

        cerveja_01.exibeInfos();
    }

    public static void main_2(String[] args) {
        System.out.println("teste");
    }
}