@Test
public void se_puede_internar_un_perro() {
  ClinicaDeMascotas clinica = new ClinicaDeMascotas();
  clinica.atender(new Perro());
}

@Test
public void se_puede_internar_un_gato() {
  ClinicaDeMascotas clinica = new ClinicaDeMascotas();
  clinica.atender(new Gato());
}