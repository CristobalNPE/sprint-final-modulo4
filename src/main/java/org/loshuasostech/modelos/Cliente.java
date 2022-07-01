package org.loshuasostech.modelos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente extends Usuario {

  private String apellidos;
  private String telefono;
  private String afp;
  private int sistemaSalud;
  private String direccion;
  private String comuna;
  private int edad;

  private List<Capacitacion> capacitaciones;
  private List<Accidente> accidentes;
  private List<VisitaEnTerreno> visitas;

  public Cliente(String nombre, LocalDate fechaNacimiento, int run,
                 String apellidos, String telefono, String afp, int sistemaSalud,
                 String direccion, String comuna, int edad) {

    super(nombre, fechaNacimiento, run);
    this.apellidos = apellidos;
    this.telefono = telefono;
    this.afp = afp;
    this.sistemaSalud = sistemaSalud;
    this.direccion = direccion;
    this.comuna = comuna;
    this.edad = edad;

    this.capacitaciones = new ArrayList<>();
    this.visitas = new ArrayList<>();
    this.accidentes = new ArrayList<>();

  }

  public Cliente() {
  }

  public String getApellidos() {
    return apellidos;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String getAfp() {
    return afp;
  }

  public void setAfp(String afp) {
    this.afp = afp;
  }

  public int getSistemaSalud() {
    return sistemaSalud;
  }

  public void setSistemaSalud(int sistemaSalud) {
    this.sistemaSalud = sistemaSalud;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public String getComuna() {
    return comuna;
  }

  public void setComuna(String comuna) {
    this.comuna = comuna;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  @Override
  public String toString() {
    return (super.toString() +
            "\nApellidos: " + this.apellidos +
            "\nTelefono: " + this.telefono +
            "\nAFP: " + this.afp +
            "\nSistema de salud: " + this.sistemaSalud +
            "\nDireccion: " + this.direccion +
            "\nComuna: " + this.comuna +
            "\nEdad: " + this.edad);
  }
}
