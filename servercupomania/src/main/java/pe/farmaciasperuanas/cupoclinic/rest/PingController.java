package pe.farmaciasperuanas.cupoclinic.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

    @GetMapping(value="/ping")
    public String testGetJson() {
        return "Ping successfully....*";
    }

}
