package org.loshuasostech.logic;

import org.loshuasostech.modelos.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Los Huasos TECH
 * @version 0.1
 * @since 01-07-2022
 */
public class Contenedor {

  private List<Asesoria> usuarios;
  private List<Capacitacion> capacitaciones;


  public Contenedor() {
    this.usuarios = new ArrayList<>();
    this.capacitaciones = new ArrayList<>();
  }

  /**
   * Recibe un objeto Cliente y lo almacena en la lista correspondiente
   *
   * @param cliente Es el objeto recibido.
   */
  public void almacenarCliente(Cliente cliente) {
    this.usuarios.add(cliente);
  }

  /**
   * Recibe un objeto Profesional y lo almacena en la lista correspondiente
   *
   * @param profesional Es el objeto recibido.
   */
  public void almacenarProfesional(Profesional profesional) {
    this.usuarios.add(profesional);
  }

  /**
   * Recibe un objeto Administrativo y lo almacena en la lista correspondiente
   *
   * @param administrativo Es el objeto recibido.
   */
  public void almacenarAdministrativo(Administrativo administrativo) {
    this.usuarios.add(administrativo);
  }

  /**
   * Recibe un objeto Capacitacion y lo almacena en la lista correspondiente
   *
   * @param capacitacion Es el objeto recibido.
   */
  public void almacenarCapacitacion(Capacitacion capacitacion) {
    this.capacitaciones.add(capacitacion);
  }

  /**
   * Elimina un usuario de la lista segun el RUN
   *
   * @param RUN Corresponde al RUN del usuario a eliminar
   */
  public boolean eliminarUsuario(int RUN) {
    //Se verifica que la lista no se encuentre vacia.
    if (!this.usuarios.isEmpty()) {
      for (Asesoria usuario : this.usuarios) {
        //Se realiza casteo para recuperar acceso a metodos get.
        Usuario u = (Usuario) usuario;
        if (u.getRun() == RUN) {
          usuarios.remove(u);
          return true;
        }
      }
    }
    return false;
  }

  /**
   * Muestra por pantalla la informacion basica de los usuarios en contenedor.
   */
  public void listarUsuarios() {

    for (Asesoria usuario : this.usuarios) {
      Usuario u = (Usuario) usuario;
      System.out.println("---------------------------");
      System.out.println("Nombre          : " + u.getNombre());
      System.out.println("RUT             : " + u.getRun());
      System.out.println("Fecha nacimiento: " + u.getFechaNacimiento());
    }
    System.out.println("---------------------------");
    System.out.println();
  }

  /**
   * Muestra por pantalla los usuarios que pertenezcan a un tipo especifico
   *
   * @param tipo Indica el tipo de usuario que se desea consultar.
   */
  public void listarUsuariosPorTipo(String tipo) {

    if (tipo.equalsIgnoreCase("cliente")) {
      for (Asesoria u : this.usuarios) {
        if (u instanceof Cliente) {
          System.out.println("---------------------------");
          System.out.println(u);
        }
      }
      System.out.println("---------------------------");
    }
    if (tipo.equalsIgnoreCase("administrativo")) {
      for (Asesoria u : this.usuarios) {
        if (u instanceof Administrativo) {
          System.out.println("---------------------------");
          System.out.println(u);
        }
      }
      System.out.println("---------------------------");
    }
    if (tipo.equalsIgnoreCase("profesional")) {
      for (Asesoria u : this.usuarios) {
        if (u instanceof Profesional) {
          System.out.println("---------------------------");
          System.out.println(u);
        }
      }
      System.out.println("---------------------------");
    }
  }

  /**
   * Muestra por pantalla las capacitaciones en el contenedor y sus clientes.
   */
  public void listarCapacitaciones() {
    for (Capacitacion c : this.capacitaciones) {
      System.out.println("===========================");
      System.out.println("ID Capacitacion : " + c.getId());
      System.out.println("===========================");
      System.out.println("Clientes: ");
      for (Asesoria usuario : this.usuarios) {
        Usuario u = (Usuario) usuario;
        if (u.getRun() == Integer.parseInt(c.getRutCliente())) {
          System.out.println(u);
          System.out.println("--------------------");
        }
      }
    }
  }
}
