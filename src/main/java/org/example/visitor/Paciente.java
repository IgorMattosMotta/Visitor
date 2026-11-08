package org.example.visitor;

public class Paciente implements PessoaHospital {

    private int prontuario;
    private String nome;
    private int leito;

    public Paciente(int prontuario, String nome, int leito) {
        this.prontuario = prontuario;
        this.nome = nome;
        this.leito = leito;
    }

    public int getProntuario() {
        return prontuario;
    }

    public String getNome() {
        return nome;
    }

    public int getLeito() {
        return leito;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirPaciente(this);
    }

}
