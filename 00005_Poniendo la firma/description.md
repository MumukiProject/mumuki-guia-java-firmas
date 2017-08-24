Llegó la hora de decirte la verdad :scream:: las firmas en un lenguaje de objetos con tipado estático como Java se componen no sólo del nombre y aridad del método, sino también del tipo de los parámetros. Por ejemplo, si tenemos el siguiente código... 

```java
class CamionDeMudanzas {
  void cargar(Biblioteca unaBiblioteca) { // 1.
    // ...
  }
  void cargar(Mesa unaMesa, List<Silla> sillas) { // 2.
     // ...
  }
  void cargar(Colchon unColchon) { // 3.
    // ...
  }
}
```

...las firmas son las siguientes: 

1. `cargar(Biblioteca)`
2. `cargar(Mesa, List)`
3. `cargar(Colchon)`

> Veamos si queda claro: ¿Cuáles son las firmas de métodos de la clase `ClinicaDeMascotas`?
> (Si no te acordás de su código, mirá la ayuda :grin:).


