package org.loshuasostech.modelos;

import org.loshuasostech.helpers.ValidadorHoraFecha;

/**
 * @author Los Huasos TECH
 * @version 0.1
 * @since 01-07-2022
 */
public class Usuario {
  private String nombre;
  private String fechaNacimiento;
  private int run;

  public Usuario() {

  }

  public Usuario(String nombre, String fechaNacimiento, int run) {
    this.nombre = nombre;
    this.fechaNacimiento = fechaNacimiento;
    this.run = run;
  }

  public String getNombre() {
    return nombre;
  }

  /**
   * Define el nombre del usuario
   *
   * @param nombre Es una cadena entre 10 y 50 caracteres.
   * @throws IllegalArgumentException si el nombre no cumple con la condicion.
   */
  public void setNombre(String nombre) {
    if (nombre.length() < 10 || nombre.length() > 50) {
      throw new IllegalArgumentException
              ("Nombre debe contener al menos 10 caracteres y no mas de 50");
    } else {
      this.nombre = nombre;
    }

  }

  public String getFechaNacimiento() {


    return this.fechaNacimiento;
  }

  /**
   * Define la fecha de nacimiento del usuario
   *
   * @param fechaNacimiento corresponde a una fecha en formato DD/MM/AAAA
   * @throws IllegalArgumentException si la fecha  no cumple la condicion
   */
  public void setFechaNacimiento(String fechaNacimiento) {
    if (!ValidadorHoraFecha.fechaFormatoCorrecto(fechaNacimiento)) {
      throw new IllegalArgumentException
              ("Debe ingresar la fecha en formato DD/MM/AAAA");
    } else {
      this.fechaNacimiento = fechaNacimiento;
    }

  }

  public int getRun() {
    return run;
  }

  /**
   * Define el RUN para el usuario
   *
   * @param run corresponde a un numero menor a 99.999.999
   * @throws IllegalArgumentException si el numero no cumple la condicion.
   */
  public void setRun(int run) {
    if (run >= 99_999_999) {
      throw new IllegalArgumentException
              ("El RUN debe ser menor a 99.999.999");
    } else {
      this.run = run;
    }

  }

  @Override
  public String toString() {
    return ("Nombre: " + this.nombre +
            "\nFecha de nacimiento: " + this.fechaNacimiento +
            "\nRUN: " + this.run);
  }
}
