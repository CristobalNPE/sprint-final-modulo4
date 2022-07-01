package org.loshuasostech.modelos;

import java.time.LocalDate;
import java.time.LocalTime;

public class Accidente {
  private int id;
  private String rut;
  private LocalDate diaAccidente;
  private LocalTime hora;
  private String lugar;
  private String origen;
  private String consecuencia;

  public Accidente(int id, String rut, LocalDate diaAccidente, LocalTime hora,
                   String lugar, String origen, String consecuencia) {

    this.id = id;
    this.rut = rut;
    this.diaAccidente = diaAccidente;
    this.hora = hora;
    this.lugar = lugar;
    this.origen = origen;
    this.consecuencia = consecuencia;
  }

  public Accidente() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getRut() {
    return rut;
  }

  public void setRut(String rut) {
    this.rut = rut;
  }

  public LocalDate getDiaAccidente() {
    return diaAccidente;
  }

  public void setDiaAccidente(LocalDate diaAccidente) {
    this.diaAccidente = diaAccidente;
  }

  public LocalTime getHora() {
    return hora;
  }

  public void setHora(LocalTime hora) {
    this.hora = hora;
  }

  public String getLugar() {
    return lugar;
  }

  public void setLugar(String lugar) {
    this.lugar = lugar;
  }

  public String getOrigen() {
    return origen;
  }

  public void setOrigen(String origen) {
    this.origen = origen;
  }

  public String getConsecuencia() {
    return consecuencia;
  }

  public void setConsecuencia(String consecuencia) {
    this.consecuencia = consecuencia;
  }

  @Override
  public String toString() {
    return ("Identificador accidente: " + this.id +
            "\nRUT: " + this.rut +
            "\nDia (accidente): " + this.diaAccidente +
            "\nHora: " + this.hora +
            "\nLugar: " + this.lugar +
            "\nOrigen :" + this.origen +
            "\nConsecuencias: " + this.consecuencia);
  }
}
