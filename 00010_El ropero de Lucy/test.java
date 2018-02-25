RoperoDeLucy ropero = new RoperoDeLucy();
Enterito enterito = new Enterito();
Vestido vestido = new Vestido();
Pantalon pantalon = new Pantalon();
Remera remeraAmarilla = new Remera("amarilla");
Remera remeraRoja = new Remera("rojo");

@Test
public void un_vestido_nunca_le_queda_bien() {
  Assert.assertFalse(ropero.leQuedaBien(vestido));
}

@Test
public void un_enterito_le_queda_bien_siempre() {
  Assert.assertTrue(ropero.leQuedaBien(enterito));
}

@Test
public void un_pantalon_y_una_remera_quedan_bien_dependiendo_de_sus_colores() {
  Assert.assertFalse(ropero.leQuedaBien(pantalon, remeraAmarilla));
  Assert.assertTrue(ropero.leQuedaBien(pantalon, remeraRoja));
}