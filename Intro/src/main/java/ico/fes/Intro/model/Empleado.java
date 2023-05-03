package ico.fes.Intro.model;

import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Empleado {
    private  int id;
    private  String nombre;
    private  double sueldo;
    private String departamento;
    private String fechaNacimiento;

}
