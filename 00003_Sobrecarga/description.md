Esta idea de definir varios métodos con el mismo nombre (pero diferente firma, claro :smile:) tiene un nombre: _sobrecarga_. Por ejemplo, en el siguiente código...

```java
class CamionDeMudanzas {
  void cargar(Biblioteca unaBiblioteca) {
     // ...
  }
  
  void cargar(Mesa unaMesa, List<Silla> sillas) {
     // ...
  }
}
```

...decimos que el método `cargar` está _sobrecargado_ (qué gran juego de palabras, ¿no? :stuck_out_tongue:). 

> Ahora es tu turno: ¿cuál (¡o cuáles!) de los métodos de la clase `Impresora` están sobrecargados?

```java
class Impresora {
  void imprimir(Documento unDocumento) {
     // ...
  }
  
  void cambiarCartucho(CartuchoNegro cartucho) {
     // ...
  }
  
  void cambiarCartucho(CartuchoColor cian, CartuchoColor amarillo, CartuchoColor magenta) {
     // ...
  }
  
  void agregarHojasA4(List<HojaA4>) {
     // ...
  }
  
  void agregarHojasOficio(List<HojaOficio>) {
     // ...
  }
}
```