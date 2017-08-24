Nuestra clínica se expande, y ahora queremos aceptar perros :dog:: cuando atendemos a uno, lo alimentamos, lo hacemos jugar y correr.  

Natalia quiere resolver este problema de forma polimórfica, haciendo que los gatos y perros compartan una interfaz y entiendan un mensaje `cuidar`, pero Milagros propuso agregar otro método `atender`, pero que tome un perro: 

```java
void atender(Perro unPerro) {
  unPerro.alimentar();
  // etc...
}
```
> ¿Funcionará? Agregá a tu solución éste método y completalo. Nosotros ya implementamos la clase `Perro`, que entiende los mensajes `alimentar`, `jugar` y `correr`. 
