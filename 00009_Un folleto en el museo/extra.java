class Folleto {
  string idioma;
  
  Folleto(queIdioma) {
    idioma = queIdioma;
  }
  
  string idioma() {
    return idioma;
  }
}

class Visitante {
  int pago;
  boolean tieneFolleto;
  Folleto folleto;
  
  void pagar(unMonto) {
    pago = unMonto;
  }
  
  int pago() {
    return pago;
  }
  
  void recibir(Folleto unFolleto) {
    folleto = unFolleto;
    tieneFolleto = true;
  }
  
  boolean tieneFolleto {
    return tieneFolleto;
  }
}

class VisitanteNacional extends Visitante {
}

class VisitanteExtranjero extends Visitante {
}