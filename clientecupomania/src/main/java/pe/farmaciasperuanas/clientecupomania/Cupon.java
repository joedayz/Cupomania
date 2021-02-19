package pe.farmaciasperuanas.clientecupomania;

import java.io.Serializable;

public class Cupon implements Serializable {

    private Integer id;
    private String dni;
    private String cupon;
    private String codigoCampana;
    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
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
