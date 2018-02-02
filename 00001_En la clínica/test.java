static class EjemploDeUso {
  static void main(String[] args) {
    Gato garfield = new Gato();
    ClinicaDeMascotas laClinica = new ClinicaDeMascotas();
    laClinica.atender(garfield, 5);
  }
}

@Test
public void se_puede_internar_durante_5_dias() {
  EjemploDeUso.main(new String[]{});
}