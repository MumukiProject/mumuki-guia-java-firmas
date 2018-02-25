Para terminar, Lucy necesita ayuda para vestirse. Tiene un `Ropero` que le dice si cierta ropa `leQuedaBien`.

Por ejemplo, a ella no le gustan los vestidos, por lo que nunca le queda bien. Pero sí le encantan los enteritos, que le quedan bien en todos los casos.

Por otro lado, puede ponerse un pantalón y una remera. En ese caso depende de si una prenda combina con la otra, teniendo en cuenta sus colores.

> Agregá el método `leQuedaBien` en la clase `RoperoDeLucy`. Ya definimos por vos las clases `Vestido`, `Enterito`, `Pantalon` y `Remera`. En particular, el `Pantalon` sabe responder al mensaje `combinaCon`, que recibe otra `Remera`.

> Algunos ejemplos de consultas son:
>
> ```java
> ム ropero.leQuedaBien(vestidoLargo);
> ム ropero.leQuedaBien(enteritoDeSeda);
> ム ropero.leQuedaBien(pantalonLargo, remeraMangaCorta);
> ```