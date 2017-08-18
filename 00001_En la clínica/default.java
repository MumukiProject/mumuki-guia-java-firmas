class ClinicaDeMascotas {
  void atender(Gato unPaciente) {
    unPaciente.alimentar();
    unPaciente.peinar();
    unPaciente.cortarUnias();
  }
  
  void atender(Gato unPaciente, int dias) {
    atender(unPaciente);
  }
}

