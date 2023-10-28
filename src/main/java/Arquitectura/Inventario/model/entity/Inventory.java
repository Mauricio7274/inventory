package Arquitectura.Inventario.model.entity;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
<<<<<<< HEAD

=======
import java.util.Date;
>>>>>>> origin/develoment

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Builder
@Table(name = "productos")
public class Inventory implements Serializable{
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "cantidad")
<<<<<<< HEAD
    private Integer cantidad;
=======
    private String cantidad;
>>>>>>> origin/develoment

}
