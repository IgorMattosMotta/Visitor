package org.example.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaHospitalVisitorTest {

    @Test
    void deveExibirPaciente() {
        Paciente paciente = new Paciente(1, "Ana", 101);

        PessoaHospitalVisitor visitor = new PessoaHospitalVisitor();
        assertEquals("Paciente{prontuario=1, nome='Ana', leito=101}", visitor.exibir(paciente));
    }

    @Test
    void deveExibirMedico() {
        Medico medico = new Medico("12345-MG", "Carlos", new Especialidade("Cardiologia"));

        PessoaHospitalVisitor visitor = new PessoaHospitalVisitor();
        assertEquals("Medico{crm='12345-MG', nome='Carlos', especialidade=Cardiologia}", visitor.exibir(medico));
    }

    @Test
    void deveExibirEnfermeiro() {
        Enfermeiro enfermeiro = new Enfermeiro("98765-MG", "Julia", "Noturno");

        PessoaHospitalVisitor visitor = new PessoaHospitalVisitor();
        assertEquals("Enfermeiro{coren='98765-MG', nome='Julia', turno='Noturno'}", visitor.exibir(enfermeiro));
    }

}
