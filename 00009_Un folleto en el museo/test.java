MuseoDeCienciasNaturales museo = new Museo();
VisitanteNacional visitanteNacional = new VisitanteNacional();
VisitanteExtranjero visitanteExtranjero = new VisitanteExtranjero();

@Test
public void un_visitante_nacional_recibe_un_folleto() {
  museo.cobrarEntrada(visitanteNacional);
  Assert.assertTrue(visitanteNacional.tieneFolleto());
}

@Test
public void el_folleto_que_recibe_un_visitante_nacional_esta_en_espaniol() {
  museo.cobrarEntrada(visitanteNacional);
  Assert.assertTrue("español", visitanteNacional.folleto.idioma());
}

@Test
public void un_visitante_extranjero_recibe_un_folleto() {
  museo.cobrarEntrada(visitanteExtranjero);
  Assert.assertTrue(visitanteExtranjero.tieneFolleto());
}

@Test
public void el_folleto_que_recibe_un_visitante_extranjero_esta_en_espaniol() {
  museo.cobrarEntrada(visitanteExtranjero);
  Assert.assertEquals("inglés", visitanteExtranjero.folleto.idioma());
}

@Test
public void un_visitante_nacional_paga_100_pesos_la_entrada() {
  museo.cobrarEntrada(visitanteNacional);
  Assert.assertEquals(100, visitanteNacional.pago());
}

@Test
public void un_visitante_extranjero_paga_100_pesos_la_entrada() {
  museo.cobrarEntrada(visitanteExtranjero);
  Assert.assertEquals(200, visitanteExtranjero.pago());
}