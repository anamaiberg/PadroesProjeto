package br.edu.ifsc.criacional.builder;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario.Builder().withNome("Joao").withTelefone("99777777").withDataNascimento("10/05/1992").withCPF("11111111111").build();
        usuario.print();

    }
}
