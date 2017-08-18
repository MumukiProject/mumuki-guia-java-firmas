class Gato {
  void alimentar() {
    
  }
  void peinar() {
    
  }
  void cotarUnias() {
    
  }
}

@Test
public void se_puede_internar_durante_5_dias() {
  Gato gardfield = new Gato();
  new ClinicaDeMascotas().atender(gardfield, 5);
}