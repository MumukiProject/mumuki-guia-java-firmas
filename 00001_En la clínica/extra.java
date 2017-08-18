class EjemploDeUso {
  static void main(String[] args) {
    Gato gardfield = new Gato();
    ClinicaDeMascotas laClinica = new ClinicaDeMascotas();
    laClinica.atender(gardfield, 5);
  }
}