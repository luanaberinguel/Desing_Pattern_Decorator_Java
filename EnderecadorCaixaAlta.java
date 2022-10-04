
public class EnderecadorCaixaAlta {

    EnderecadorSimples enderecador;

    public EnderecadorCaixaAlta(EnderecadorSimples enderecador){
        super();
        this.enderecador = enderecador;
    }

    public String preparaEndereco(Quebrada queb){
        return enderecador.preparaEndereco(queb).toUpperCase();
    }

}
