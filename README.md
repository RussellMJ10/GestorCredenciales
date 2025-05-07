# 🪪 Generador de Credenciales de Evento  
**Estudiante:** Russell Madariaga – Patrones de Diseño (Sección 2)

---

🎯 Objetivo del Proyecto
El objetivo del proyecto es crear un sistema que permita generar credenciales personalizadas para un evento, utilizando patrones de diseño. En este caso, se aplican los patrones Prototype y Singleton.

Prototype: Este patrón permite clonar credenciales a partir de una plantilla base, para generar nuevas credenciales sin necesidad de crear una nueva desde cero.

Singleton: Se utiliza para gestionar de forma global la configuración del evento y las credenciales generadas. Asegura que solo exista una instancia del gestor de credenciales a lo largo de la ejecución del programa.

---

## 🚀 Cómo ejecutar

1. Clonar el repositorio:
```bash
git clone https://github.com/RussellMJ10/GeneradorCredenciales.git
cd GeneradorCredenciales
```

---

🧬 Patrón Prototype – Aplicación
En este proyecto, el patrón Prototype se aplica para clonar credenciales basadas en una plantilla existente.

Clonado de Credenciales
La clase Credencial implementa la interfaz Cloneable, lo que permite que las credenciales puedan ser clonadas de forma sencilla.
```bash
Credencial plantilla = new Credencial("Nombre Base", "Cargo Base", "12345678-9");
Credencial clon = plantilla.clone();  

clon.setNombre("Jose");
clon.setCargo("Director");
clon.setRut("18545932-K");
```
---

🔒 Patrón Singleton – Aplicación
La clase GestorCredenciales tiene un atributo estático que mantiene la única instancia del gestor. Se accede a ella mediante el método estático getInstancia().
```bash
public class GestorCredenciales {
    private static GestorCredenciales instancia;

    private GestorCredenciales() {
    }

    public static GestorCredenciales getInstancia() {
        if (instancia == null) {
            instancia = new GestorCredenciales();
        }
        return instancia;
    }

    public void agregar(Credencial credencial) {
    }
}
```
Acceder a la instancia del Singleton:
```bash
GestorCredenciales.getInstancia().agregar(nuevaCredencial);
```

---

🖥️ Menú por Consola
El sistema incluye un menú interactivo por consola, donde los usuarios pueden elegir entre agregar nuevas credenciales, ver las credenciales generadas o salir del programa.
```bash
--- MENÚ ---
1. Agregar nueva credencial
2. Ver credenciales generadas
3. Salir
```
---

📊 Diagrama de Clases (UML)

---

📸 Captura del Sistema Funcionando
![GestorCredenciales](https://github.com/user-attachments/assets/25126642-2445-4e80-bfef-16237ff9ef60)

