class ClinicaDeMascotas {
  void atender(Gato unPaciente) {
    unPaciente.alimentar();
    unPaciente.peinar();
    unPaciente.cortarUnias();
  }
  
  void internar(Gato unPaciente, int dias) {
    IntStream
      .range(1, dias)
      .forEach(dia -> atender(unPaciente));
  }
}

