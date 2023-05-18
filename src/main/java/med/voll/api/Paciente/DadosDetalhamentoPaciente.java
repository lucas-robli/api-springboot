package med.voll.api.Paciente;

import med.voll.api.endereco.Endereco;
import med.voll.api.medico.DadosDetalhamentoMedico;

import java.util.Locale;

public record DadosDetalhamentoPaciente(
        Long id,
        String nome,
        String email,
        String telefone,
        String cpf,
        Boolean ativo,
        Endereco endereco
) {

    public DadosDetalhamentoPaciente(Paciente paciente) {
        this(
                paciente.getId(),
                paciente.getNome(),
                paciente.getEmail(),
                paciente.getTelefone(),
                paciente.getCpf(),
                paciente.getAtivo(),
                paciente.getEndereco()
        );
    }
}
