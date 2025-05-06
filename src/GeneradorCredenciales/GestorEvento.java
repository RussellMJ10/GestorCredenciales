/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GeneradorCredenciales;

/**
 *
 * @author russe
 */
import java.util.ArrayList;

public class GestorEvento {
    private static GestorEvento instancia;
    private ArrayList<Credencial> credenciales;

    private GestorEvento() {
        credenciales = new ArrayList<>();
    }

    public static GestorEvento getInstancia() {
        if (instancia == null) {
            instancia = new GestorEvento();
        }
        return instancia;
    }

    public void agregarCredencial(Credencial c) {
        credenciales.add(c);
    }

    public void listarCredenciales() {
        for (Credencial c : credenciales) {
            c.mostrar();
        }
    }
}

