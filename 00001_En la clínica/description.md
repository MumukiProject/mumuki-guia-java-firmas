Natalia y Milagros escribieron el siguiente código:

```java
class ClinicaDeMascotas {
  void atender(Gato unPaciente) {
    unPaciente.alimentar();
    unPaciente.peinar();
    unPaciente.cortarUnias();
  }
}
```

Pero ahora quieren extenderlo para que también sea posible internar al minino durante varios días. Natalia sugirió agregar un método `internar`, que tome al paciente y la cantidad de días que se lo internará, pero Milagros escribió el código que está en el editor, y el siguiente programa de ejemplo:

```java
class EjemploDeUso {
  static void main(String[] args) {
    Gato garfield = new Gato();
    ClinicaDeMascotas laClinica = new ClinicaDeMascotas();
    laClinica.atender(garfield, 5);
  }
}
```


> ¿Funciona? ¡Averigualo enviando el código!

