package med.voll.api.domain.consulta.validacoesCancelamentoConsulta;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.DadosCancelamentoConsulta;
import org.springframework.stereotype.Component;

@Component
public class ValidadorInformarMotivoCancelamento implements ValidadorCancelamentoDeConsulta {

    @Override
    public void validar(DadosCancelamentoConsulta dados) {
        if(dados.motivo() == null) {
            throw new ValidacaoException("O motivo do cancelamento deve ser informado!");
        }
    }
}
