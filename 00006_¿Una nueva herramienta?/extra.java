interface Numero {
  double costoPorSegundo();
}

class NumeroLocal implements Numero {
  public double costoPorSegundo() {
    return 0.02;
  }
}

class NumeroNacional implements Numero {
  public double costoPorSegundo() {
    return 0.07;
  }
}

class NumeroInternacional implements Numero {
  public double costoPorSegundo() {
    return 0.13;
  }
}