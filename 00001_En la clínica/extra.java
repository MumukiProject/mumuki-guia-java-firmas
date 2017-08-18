class EjemploDeUso {
  static main(String[] args) {
    Gato gardfield = new Gato();
    ClinicaDeMascotas laClinica = new ClinicaDeMascotas();
    laClinica.atender(gardfield, 5);
  }
}