package org.loshuasostech.modelos;

import java.time.LocalDate;

public class Administrativo extends Usuario {

  private String area;
  private String expPrevia;

  public Administrativo(String nombre, LocalDate fechaNacimiento, int run,
                        String area, String expPrevia) {

    super(nombre, fechaNacimiento, run);
    this.area = area;
    this.expPrevia = expPrevia;
  }

  public Administrativo() {
  }

  public String getArea() {
    return area;
  }

  public void setArea(String area) {
    this.area = area;
  }

  public String getExpPrevia() {
    return expPrevia;
  }

  public void setExpPrevia(String expPrevia) {
    this.expPrevia = expPrevia;
  }

  @Override
  public String toString() {
    return (super.toString() +
            "\nArea :" + this.area +
            "\nExperiencia Previa: " + this.expPrevia);
  }
}
