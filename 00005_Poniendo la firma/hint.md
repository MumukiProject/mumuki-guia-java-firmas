Por si no te acordás la definición, es ésta: 

```java
class ClinicaDeMascotas {
  void atender(Gato unPaciente) {
    unPaciente.alimentar();
    unPaciente.peinar();
    unPaciente.cortarUnias();
  }
  
  void atender(Perro unPaciente) {
    unPaciente.alimentar();
    unPaciente.jugar();
    unPaciente.correr();
  }
  
  void internar(Gato unPaciente, int dias) {
    IntStream
      .range(1, dias)
      .forEach(dia -> atender(unPaciente));
  }
}
```