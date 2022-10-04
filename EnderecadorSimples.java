
public class EnderecadorSimples {

    public String preparaEndereco(Quebrada queb){
        StringBuilder sb = new StringBuilder();
        sb.append(queb.logradouro);
        sb.append("\n");
        sb.append(queb.bairro);
        sb.append("\n");
        sb.append(queb.cidade);
        sb.append("\n" );
        sb.append(queb.uf);
        sb.append("\n");
        sb.append(queb.cep);
        return sb.toString();
           
    }
}
