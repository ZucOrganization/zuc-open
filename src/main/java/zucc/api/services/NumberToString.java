package zucc.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zucc.api.dtos.Extenso;
import zucc.api.services.exceptions.NumOutOfRangeException;
import zucc.api.utils.ConversorExtenso;
import zucc.api.utils.IConversorExtenso;

/**
 * Service utilizado para verificar erros e chamar a lógica de conversão.
 *
 * @author Antônio Lima Jr
 */
@Service
public class NumberToString {

  IConversorExtenso conversor;

  @Autowired
  public NumberToString(ConversorExtenso conversor) {
    this.conversor = conversor;
  }

  public Extenso conversionNumber(Integer num) {
    if (num > 99999 || num < -99999) {
      throw new NumOutOfRangeException("O numero deve estar entre -99999 e 99999 mas recebemos o valor " + num);
    }
    String numPorExtenso = conversor.convertToString(num);
    return new Extenso(numPorExtenso);
  }
}
