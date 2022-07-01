package org.loshuasostech.modelos;

import java.time.LocalDate;


public class Usuario {
  private String nombre;
  private LocalDate fechaNacimiento;
  private int run;

  public Usuario() {

  }

  public Usuario(String nombre, LocalDate fechaNacimiento, int run) {
    this.nombre = nombre;
    this.fechaNacimiento = fechaNacimiento;
    this.run = run;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public LocalDate getFechaNacimiento() {
    return fechaNacimiento;
  }

  public void setFechaNacimiento(LocalDate fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }

  public int getRun() {
    return run;
  }

  public void setRun(int run) {
    this.run = run;
  }

  @Override
  public String toString() {
    return ("Nombre: " + this.nombre +
            "\nFecha de nacimiento: " + this.fechaNacimiento +
            "\nRUN: " + this.run);
  }
}
