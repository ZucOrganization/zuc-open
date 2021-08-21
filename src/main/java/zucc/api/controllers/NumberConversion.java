package zucc.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * End-Point para a conversão do número por extenso.
 *
 * @author Antônio Lima Jr
 */
@RestController
public class NumberConversion {

  @GetMapping("/{number}")
  public ResponseEntity<String> ConversionNumber(@PathVariable Integer number) {
    return ResponseEntity.ok("Ola mundo");
  }
}
