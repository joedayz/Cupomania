package pe.farmaciasperuanas.cupoclinic.repository;

import org.springframework.data.repository.CrudRepository;
import pe.farmaciasperuanas.cupoclinic.model.Cupon;

import java.util.List;

public interface CuponRepository extends CrudRepository<Cupon, Integer > {

    List<Cupon> findByDni(String dni);
}
