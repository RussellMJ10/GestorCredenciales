/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GeneradorCredenciales;

/**
 *
 * @author russe
 */
public class Credencial implements Cloneable {
    private String nombre;
    private String cargo;
    private String rut;

    public Credencial(String nombre, String cargo, String rut) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.rut = rut;
    }

    public Credencial clonar() {
        try {
            return (Credencial) this.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre + " | Cargo: " + cargo + " | RUT: " + rut);
    }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setCargo(String cargo) { this.cargo = cargo; }
    public void setRut(String rut) { this.rut = rut; }
}

