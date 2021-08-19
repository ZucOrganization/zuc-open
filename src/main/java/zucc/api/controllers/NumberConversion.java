package zucc.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import zucc.api.dtos.Extenso;
import zucc.api.services.NumberToString;

/**
 * End-Point para a conversão do número por extenso.
 *
 * @author Antônio Lima Jr
 */
@RestController
public class NumberConversion {

  @Autowired
  private NumberToString numberToString;

  @GetMapping("/{number}")
  public ResponseEntity<Extenso> ConversionNumber(@PathVariable Integer number) {
    return ResponseEntity.ok(numberToString.conversionNumber(number));
  }
}
