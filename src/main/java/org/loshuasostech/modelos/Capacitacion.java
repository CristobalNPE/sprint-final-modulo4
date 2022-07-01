package org.loshuasostech.modelos;

import java.time.LocalTime;

public class Capacitacion {
  private int id;
  private String rutCliente;
  private String dia;
  private LocalTime hora;
  private String lugar;
  private String duracion;
  private int cantidadAsistentes;

  public Capacitacion(int id, String rutCliente, String dia, LocalTime hora,
                      String lugar, String duracion, int cantidadAsistentes) {

    this.id = id;
    this.rutCliente = rutCliente;
    this.dia = dia;
    this.hora = hora;
    this.lugar = lugar;
    this.duracion = duracion;
    this.cantidadAsistentes = cantidadAsistentes;
  }

  public Capacitacion() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getRutCliente() {
    return rutCliente;
  }

  public void setRutCliente(String rutCliente) {
    this.rutCliente = rutCliente;
  }

  public String getDia() {
    return dia;
  }

  public void setDia(String dia) {
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

  public String getDuracion() {
    return duracion;
  }

  public void setDuracion(String duracion) {
    this.duracion = duracion;
  }

  public int getCantidadAsistentes() {
    return cantidadAsistentes;
  }

  public void setCantidadAsistentes(int cantidadAsistentes) {
    this.cantidadAsistentes = cantidadAsistentes;
  }


  @Override
  public String toString() {
    return ("Identificador accidente: " + this.id +
            "\nRUT Cliente: " + this.rutCliente +
            "\nDia: " + this.dia +
            "\nHora: " + this.hora +
            "\nLugar: " + this.lugar +
            "\nDuracion: " + this.duracion +
            "\nCantidad Asistentes: " + this.cantidadAsistentes);
  }
}
