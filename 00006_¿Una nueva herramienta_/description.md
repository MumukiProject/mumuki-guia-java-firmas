Quizá notaste que muchos de los ejemplos y ejercicios de esta guía se podrían haber resuelto utilizando polimorfismo. ¿Cómo es esto?

En lugar de sobrecargar un método para que sus múltiples implementaciones reciban por parámetro distintos tipos de objeto, podemos aprovechar una interfaz (¡o superclase!) común y definir un único método.

Por ejemplo, el método `costoPorLlamar` calcula cuánto cuesta cada llamada dependiendo si la llamada es local, nacional o internacional, sobrecargando como hacíamos hasta ahora: :iphone:

```java
class Telefono {
  double costoPorLlamar(NumeroLocal numeroLocal, int segundos) {
    return (0.02 * segundos);
  }
  
  double costoPorLlamar(NumeroNacional numeroNacional, int segundos) {
    return (0.07 * segundos);
  }
  
  double costoPorLlamar(NumeroInternacional numeroInternacional, int segundos) {
    return (0.13 * segundos);
  }
}
```

> Implementá un único método `costoPorLlamar` que reciba un `Numero` y calcule el costo dependiendo la llamada.

> Las clases `NumeroLocal`, `NumeroNacional` y `NumeroInternacional` implementan la interfaz `Numero` y entienden el mensaje `costoPorSegundo`. ¡Podés verlas en la Biblioteca!