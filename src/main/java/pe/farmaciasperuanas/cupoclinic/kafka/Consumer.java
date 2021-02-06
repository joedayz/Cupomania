package pe.farmaciasperuanas.cupoclinic.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;
import pe.farmaciasperuanas.cupoclinic.model.Cupon;
import pe.farmaciasperuanas.cupoclinic.repository.CuponRepository;

import java.util.List;

@Component
public class Consumer {

    @Autowired
    private CuponRepository cuponRepository;

    @Autowired
    private Producer producer;

    @KafkaListener(topics = "${cupones.consulta.topic}")
    public void processMessage(String dni,
                               @Header(KafkaHeaders.RECEIVED_PARTITION_ID) List<Integer> partitions,
                               @Header(KafkaHeaders.RECEIVED_TOPIC) List<String> topics,
                               @Header(KafkaHeaders.OFFSET) List<Long> offsets){
        System.out.printf("%s-%d[%d] \"%s\"\n", topics.get(0),
                partitions.get(0),
                offsets.get(0),
                dni);

        List<Cupon> cupones = cuponRepository.findByDni(dni);

        for(Cupon cupon: cupones)
            producer.send(cupon);

    }
}
