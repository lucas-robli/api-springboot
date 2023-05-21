package med.voll.api.domain.Paciente;

import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(
        @NotNull
        Long id,
        String nome,
        String email,
        String telefone,
        String cpf,
        DadosEndereco endereco
) {
}
