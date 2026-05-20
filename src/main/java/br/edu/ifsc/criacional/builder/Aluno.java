package br.edu.ifsc.criacional.builder;
import lombok.*;

@Builder
@Data
public class Aluno {
    private String nome;
    private int codigo;
    private String cpf;

    public static void main(String[] args) {
        Aluno aluno = Aluno.builder().nome("Jose").codigo(123).cpf("7521545545").build();
        System.out.println(aluno);
        System.out.println(aluno.getNome());
        System.out.println(aluno.getCodigo());
        System.out.println(aluno.getCpf());
        System.out.println(aluno);
    }
}
