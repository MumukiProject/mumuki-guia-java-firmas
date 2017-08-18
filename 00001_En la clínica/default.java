class ClinicaDeMascotas {
  void atender(Gato unPaciente) {
    unPaciente.alimentar();
    unPaciente.peinar();
    unPaciente.cortarUnias();
  }
  
  void atener(Gato unPaciente, int dias) {
    atender(unPaciente);
  }
}