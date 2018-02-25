NumeroLocal numeroLocal = new NumeroLocal();
NumeroNacional numeroNacional = new NumeroNacional();
NumeroInternacional numeroInternacional = new NumeroInternacional();
Telefono telefono = new Telefono();

@Test
public void el_costo_de_una_llamada_local_es_de_dos_centavos() {
  Assert.assertEquals(2, telefono.costoPorLlamar(numeroLocal, 100), 0);
}

@Test
public void el_costo_de_una_llamada_nacional_es_de_siete_centavos() {
  Assert.assertEquals(7, telefono.costoPorLlamar(numeroNacional, 100), 0);
}

@Test
public void el_costo_de_una_llamada_internnacional_es_de_trece_centavos() {
  Assert.assertEquals(13, telefono.costoPorLlamar(numeroInternacional, 100), 0);
}