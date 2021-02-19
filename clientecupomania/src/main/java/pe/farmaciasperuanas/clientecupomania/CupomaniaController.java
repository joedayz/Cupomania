package pe.farmaciasperuanas.clientecupomania;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CupomaniaController {

    private static Logger log = LoggerFactory.getLogger("logentries");
    private final KafkaTemplate<String, String> kafkaTemplate;

    @Value("${cupones.consulta.topic}")
    private String topic;

    CupomaniaController(KafkaTemplate<String, String> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }


    @PostMapping("/cuponesByDni")
    public ResponseEntity<?> publishMessage(@RequestParam("dni") String dni){

        log.info("Getting cupones for dni " + dni);

        this.kafkaTemplate.send(topic, dni);


        return new ResponseEntity<>(HttpStatus.OK);
    }
}
