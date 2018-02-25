class Folleto {
  String idioma;
  
  Folleto(String queIdioma) {
    idioma = queIdioma;
  }
  
  String idioma() {
    return idioma;
  }
}

class Visitante {
  int pago;
  boolean tieneFolleto;
  Folleto folleto;
  
  void pagar(int unMonto) {
    pago = unMonto;
  }
  
  int pago() {
    return pago;
  }
  
  void recibir(Folleto unFolleto) {
    folleto = unFolleto;
    tieneFolleto = true;
  }
  
  boolean tieneFolleto() {
    return tieneFolleto;
  }
}

class VisitanteNacional extends Visitante {
}

class VisitanteExtranjero extends Visitante {
}