package org.example.visitor;

public class Medico implements PessoaHospital {

    private String crm;
    private String nome;
    private Especialidade especialidade;

    public Medico(String crm, String nome, Especialidade especialidade) {
        this.crm = crm;
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeEspecialidade() {
        return this.especialidade.getNome();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirMedico(this);
    }

}
