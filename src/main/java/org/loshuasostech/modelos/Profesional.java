package org.loshuasostech.modelos;

import java.time.LocalDate;

public class Profesional extends Usuario {

  private String titulo;
  private LocalDate fechaIngreso;

  public Profesional(String nombre, LocalDate fechaNacimiento, int run,
                     String titulo, LocalDate fechaIngreso) {

    super(nombre, fechaNacimiento, run);
    this.titulo = titulo;
    this.fechaIngreso = fechaIngreso;
  }

  public Profesional() {
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public LocalDate getFechaIngreso() {
    return fechaIngreso;
  }

  public void setFechaIngreso(LocalDate fechaIngreso) {
    this.fechaIngreso = fechaIngreso;
  }

  @Override
  public String toString() {
    return (super.toString() +
            "\nTitulo: " + this.titulo +
            "\nFecha de ingreso: " + this.fechaIngreso);
  }
}
