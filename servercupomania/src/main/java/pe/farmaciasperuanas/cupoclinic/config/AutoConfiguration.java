package pe.farmaciasperuanas.cupoclinic.config;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = "pe.farmaciasperuanas.cupoclinic.entity")
@EnableJpaRepositories(basePackages = "pe.farmaciasperuanas.cupoclinic.repository")
@EnableAutoConfiguration
public class AutoConfiguration {
}
