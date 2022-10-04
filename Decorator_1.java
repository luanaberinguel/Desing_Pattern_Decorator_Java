public class Decorator_1 {
    
public static void main(String[] args) {
    Quebrada queb = new Quebrada("Rua 4 Casa 123", "Centro", "São José", "RN", "50930-123");

    EnderecadorSimples enderecador = new EnderecadorSimples();
    EnderecadorCaixaAlta enderecadorCaixaAlta = new EnderecadorCaixaAlta(enderecador);
    
    String enderecoFormatado = enderecadorCaixaAlta.preparaEndereco(queb);
    System.out.println(enderecoFormatado);
    System.out.println("RUA: "+ queb.logradouro);
    System.out.println("BAIRRO: "+ queb.bairro);
    System.out.println("CIDADE: "+ queb.cidade);
    System.out.println("UF: "+ queb.uf);
    System.out.println("CEP: "+ queb.cep);
    }


}
