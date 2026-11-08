package org.example.visitor;

public class PessoaHospitalVisitor implements Visitor {

    public String exibir(PessoaHospital pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirPaciente(Paciente paciente) {
        return "Paciente{" +
                "prontuario=" + paciente.getProntuario() +
                ", nome='" + paciente.getNome() + '\'' +
                ", leito=" + paciente.getLeito() +
                '}';
    }

    @Override
    public String exibirMedico(Medico medico) {
        return "Medico{" +
                "crm='" + medico.getCrm() + '\'' +
                ", nome='" + medico.getNome() + '\'' +
                ", especialidade=" + medico.getNomeEspecialidade() +
                '}';
    }

    @Override
    public String exibirEnfermeiro(Enfermeiro enfermeiro) {
        return "Enfermeiro{" +
                "coren='" + enfermeiro.getCoren() + '\'' +
                ", nome='" + enfermeiro.getNome() + '\'' +
                ", turno='" + enfermeiro.getTurno() + '\'' +
                '}';
    }
}
