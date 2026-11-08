package org.example.visitor;

public class Enfermeiro implements PessoaHospital {

    private String coren;
    private String nome;
    private String turno;

    public Enfermeiro(String coren, String nome, String turno) {
        this.coren = coren;
        this.nome = nome;
        this.turno = turno;
    }

    public String getCoren() {
        return coren;
    }

    public String getNome() {
        return nome;
    }

    public String getTurno() {
        return turno;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirEnfermeiro(this);
    }

}
