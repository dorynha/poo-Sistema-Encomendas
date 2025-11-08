public class Encomendas{
    private int codigo;
    private String destinatario;
    private String endereco;
    private String status;

    public Encomendas(int codigo, String destinatario, String endereco, String status){
        this.codigo = codigo;
        this.destinatario = destinatario;
        this.endereco = endereco;
        this.status = status;
    }


public void exibirInfo(){
    System.out.println("Código da encomenda: " + codigo + "\nDestinatário: " + destinatario + "\nEndereço: " + endereco + "\nStatus da encomenda: " + status);
}


    //altera o status da encomenda.
public void atualizarStatus(String novoStatus){
    this.status = novoStatus;
} 

public int getCodigo(){
    return codigo;
}

public String getDestinatario(){
    return destinatario;
}

public String getEndereco(){
    return endereco;
}

public String getStatus(){
    return status;
}

public void setCodigo(int codigo){
    this.codigo = codigo;
}

public void setDestinatario(String destinatario){
    this.destinatario = destinatario;
}

public void setEndereco(String endereco){
    this.endereco = endereco;
}

public void setStatus(String status){
    this.status = status;
}

}