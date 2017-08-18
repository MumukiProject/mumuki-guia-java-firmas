class EjemploDeUso {
  static void main(String[] args) {
    Gato gardfield = new Gato();
    ClinicaDeMascotas laClinica = new ClinicaDeMascotas();
    laClinica.atender(gardfield, 5);
  }
}

@Test
public void se_puede_internar_durante_5_dias() {
  EjemploDeUso.main(new String[]{});
}