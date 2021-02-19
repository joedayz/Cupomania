package pe.farmaciasperuanas.clientecupomania;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Deserializer;

public class CuponDeserializer implements Deserializer<Cupon> {

    @Override
    public Cupon deserialize(String arg0, byte[] devBytes) {
        ObjectMapper mapper = new ObjectMapper();
        Cupon cupon = null;
        try {
            cupon = mapper.readValue(devBytes, Cupon.class);
        } catch (Exception e) {

            e.printStackTrace();
        }
        return cupon;
    }



}