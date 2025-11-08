public class Transportadora{
    private Encomendas[] encomendas;
    private int quantidade;

    public Transportadora(Encomendas[] encomenda, int quantidade){
        encomendas = new Encomendas[10];
        quantidade = 0;
    }

public void adicionarEncomenda(Encomendas encomenda){
    if (quantidade < encomendas.length){
        encomendas[quantidade] = encomenda;
        quantidade ++;
    }
}

public void listarEncomendas(){

} //exibe todas as encomendas cadastradas.


public Encomendas buscarPorCodigo(int codigo){

}
}