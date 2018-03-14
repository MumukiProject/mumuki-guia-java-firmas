¡Ahora realicemos algunas sobrecargas más!

Aprovechando que ya modelamos algunas llamadas, fuimos más allá y definimos un `CentroDeAtencionAlCliente`.

El nivel de maldad de este lugar es muy alto: priorizan la atención según el tipo de cliente :thumbsdown:. Si llama un `ClienteBasico`, suena una grabación que dice `"Todos nuestros operadores están ocupados en este momento"`. Si llama un `ClientePrometedor`, se escucha `"Si se comunica por una falla en el servicio, marque 1. Si se comunica por..."`.

Y si quien llama es un `ClientePremium`, el servicio es casi instantáneo: le dicen `"Uno de nuestros operadores lo atenderá al instante"`.

> Agregá las implementaciones de `atenderLlamado`, que devuelve un texto de tipo `String`. ¡Ya definimos a los tres tipos de cliente!
