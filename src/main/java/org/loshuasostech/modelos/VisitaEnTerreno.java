package org.loshuasostech.modelos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class VisitaEnTerreno {
  private int id;
  private String rut;
  private LocalDate dia;
  private LocalTime hora;
  private String lugar;
  private String comentarios;
  private List<Revision> revisiones;

  public VisitaEnTerreno(int id, String rut, LocalDate dia, LocalTime hora,
                         String lugar, String comentarios) {

    this.id = id;
    this.rut = rut;
    this.dia = dia;
    this.hora = hora;
    this.lugar = lugar;
    this.comentarios = comentarios;

    this.revisiones = new ArrayList<>();
  }

  public VisitaEnTerreno() {
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

  public LocalDate getDia() {
    return dia;
  }

  public void setDia(LocalDate dia) {
    this.dia = dia;
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

  public String getComentarios() {
    return comentarios;
  }

  public void setComentarios(String comentarios) {
    this.comentarios = comentarios;
  }

  @Override
  public String toString() {
    return ("Identificador visita: " + this.id +
            "\nRUT: " + this.rut +
            "\nDia: " + this.dia +
            "\nHora: " + this.hora +
            "\nLugar: " + this.lugar +
            "\nComentarios: " + this.comentarios);
  }
}
