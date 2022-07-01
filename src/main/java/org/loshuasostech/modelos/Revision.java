package org.loshuasostech.modelos;

public class Revision {
  private int idRevision;
  private int idVisita;
  private String nombre;
  private String detalle;
  private int estado;

  public Revision(int idRevision, int idVisita, String nombre, String detalle,
                  int estado) {

    this.idRevision = idRevision;
    this.idVisita = idVisita;
    this.nombre = nombre;
    this.detalle = detalle;
    this.estado = estado;
  }

  public Revision() {
  }

  public int getIdRevision() {
    return idRevision;
  }

  public void setIdRevision(int idRevision) {
    this.idRevision = idRevision;
  }

  public int getIdVisita() {
    return idVisita;
  }

  public void setIdVisita(int idVisita) {
    this.idVisita = idVisita;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getDetalle() {
    return detalle;
  }

  public void setDetalle(String detalle) {
    this.detalle = detalle;
  }

  public int getEstado() {
    return estado;
  }

  public void setEstado(int estado) {
    this.estado = estado;
  }

  @Override
  public String toString() {
    return ("Identificador revision: " + this.idRevision +
            "\nIdentificador visita: " + this.idVisita +
            "\nNombre revision: " + this.nombre +
            "\nDetalle: " + this.detalle +
            "\nEstado: " + this.estado);
  }
}
