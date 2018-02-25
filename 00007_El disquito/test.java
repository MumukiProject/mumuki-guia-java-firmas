CentroDeAtencionAlCliente centro = new CentroDeAtencionAlCliente();

@Test
public void atender_a_un_cliente_basico() {
  Assert.assertEquals("Todos nuestros operadores están ocupados en este momento", centro.atenderLlamado(new ClienteBasico()));
}

@Test
public void atender_a_un_cliente_prometedor() {
  Assert.assertEquals("Si se comunica por una falla en el servicio, marque 1. Si se comunica por...", centro.atenderLlamado(new ClientePrometedor()));
}

@Test
public void atender_a_un_cliente_premium() {
  Assert.assertEquals("Uno de nuestros operadores lo atenderá al instante", centro.atenderLlamado(new ClientePremium()));
}