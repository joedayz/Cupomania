package pe.farmaciasperuanas.cupoclinic.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Cupon implements Serializable {
    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "dni", nullable=false, length=8)
    private String dni;

    @Column(name = "cupon", nullable=false, length=30)
    private String cupon;

    @Column(name = "codigo_campana", nullable=false, length=10)
    private String codigoCampana;

    @Column(name = "status", nullable=false, length=1)
    private String status;

    public long getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCupon() {
        return cupon;
    }

    public void setCupon(String cupon) {
        this.cupon = cupon;
    }

    public String getCodigoCampana() {
        return codigoCampana;
    }

    public void setCodigoCampana(String codigoCampana) {
        this.codigoCampana = codigoCampana;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "Cupon{" +
                "id=" + id +
                ", dni='" + dni + '\'' +
                ", cupon='" + cupon + '\'' +
                ", codigoCampana='" + codigoCampana + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
