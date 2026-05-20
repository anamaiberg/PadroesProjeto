package br.edu.ifsc.criacional.builder;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario().Builder().withName("Joao").withTelefone("99777777").withDataNascimento("10/05/1992").build;
        usuario.print();
    }
}
