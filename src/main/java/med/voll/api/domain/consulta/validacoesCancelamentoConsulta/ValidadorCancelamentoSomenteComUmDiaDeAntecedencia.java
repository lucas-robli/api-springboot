package med.voll.api.domain.consulta.validacoesCancelamentoConsulta;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.DadosCancelamentoConsulta;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ValidadorCancelamentoSomenteComUmDiaDeAntecedencia implements ValidadorCancelamentoDeConsulta {

    @Override
    public void validar(DadosCancelamentoConsulta dados) {
        var dataAtual = LocalDateTime.now();
        var anoIgual = dados.data().getYear() == dataAtual.getYear();
        var mesIgual = dados.data().getMonth() == dataAtual.getMonth();
        var diaIgual = dados.data().getDayOfYear() == dataAtual.getDayOfYear();

        if(anoIgual && mesIgual && diaIgual) {
            throw new ValidacaoException("O cancelamento deve ser realizado com um dia de antecedência!");
        }
    }
}
