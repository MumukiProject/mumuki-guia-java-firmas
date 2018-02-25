@Test
public void un_ataque_electrico_no_es_super_efectivo_contra_un_monstruito_fuego() {
  Assert.assertFalse(ataqueElectrico.esSuperEfectivo(new MonstruitoFuego()));
}

@Test
public void un_ataque_electrico_no_es_super_efectivo_contra_un_monstruito_tierra() {
  Assert.assertFalse(ataqueElectrico.esSuperEfectivo(new MonstruitoTierra()));
}

@Test
public void un_ataque_electrico_es_super_efectivo_contra_un_monstruito_agua() {
  Assert.assertTrue(ataqueElectrico.esSuperEfectivo(new MonstruitoAgua()));
}