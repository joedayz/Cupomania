package pe.farmaciasperuanas.clientecupomania;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Consumer {


    @KafkaListener(topics = "${cupones.respuesta.topic}")
    public void processMessage(Cupon cupon,
                               @Header(KafkaHeaders.RECEIVED_PARTITION_ID) List<Integer> partitions,
                               @Header(KafkaHeaders.RECEIVED_TOPIC) List<String> topics,
                               @Header(KafkaHeaders.OFFSET) List<Long> offsets){

        System.out.println("*********Llego el cupo "+ cupon);

    }
}
