class Vestido {
  
}

class Enterito {
  
}

class Remera {
  String color;
  Remera(String unColor) {
    color = unColor;
  }
  
  String color() {
    return color;
  }
}

class Pantalon {
  boolean combinaCon(Remera unaRemera) {
    return unaRemera.color() == "rojo"
  }
}