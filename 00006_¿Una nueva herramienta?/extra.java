interface Numero {
  double costoPorLlamar();
}

class NumeroLocal implements Numero {
  public double costoPorLlamar() {
    return 0.02;
  }
}

class NumeroNacional implements Numero {
  public double costoPorLlamar() {
    return 0.07;
  }
}

class NumeroInternacional implements Numero {
  public double costoPorLlamar() {
    return 0.13;
  }
}