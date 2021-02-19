package pe.farmaciasperuanas.cupoclinic.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cupon")
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


}
