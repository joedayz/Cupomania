package pe.farmaciasperuanas.cupoclinic.kafka;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import pe.farmaciasperuanas.cupoclinic.model.Cupon;

@Component
public class Producer {

    private final KafkaTemplate<String, Cupon> kafkaTemplate;

    @Value("${cupones.respuesta.topic}")
    private String topic;

    Producer(KafkaTemplate<String, Cupon> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }
    public void send(Cupon cupon){
        this.kafkaTemplate.send(topic, cupon);
        System.out.println("Sent cupon [" + cupon + "] to " + topic);
    }
}
