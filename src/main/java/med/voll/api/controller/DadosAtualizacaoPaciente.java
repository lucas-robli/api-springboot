package med.voll.api.controller;

import jakarta.persistence.Embedded;
import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.DadosEndereco;
import med.voll.api.endereco.Endereco;

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
