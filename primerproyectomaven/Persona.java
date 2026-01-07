package com.hectornunez.primerproyectomaven;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String email;

    public Persona(String nombre, String apellido, int edad, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.email = email;
    }

    // Método Factory pedido en el ejercicio
    public static Persona fromString(String input) {
        if (input == null) {
            throw new IllegalArgumentException("El input no puede ser null");
        }
        
        String[] datos = input.split(",");
        if (datos.length != 4) {
            throw new IllegalArgumentException("Formato inválido");
        }

        String nombre = datos[0].trim();
        String apellido = datos[1].trim();
        int edad = Integer.parseInt(datos[2].trim());
        String email = datos[3].trim();

        return new Persona(nombre, apellido, edad, email);
    }

    // Getters
    public String getNombre() { 
        return nombre; 
    }

    public String getApellido() { 
        return apellido; 
    }

    public int getEdad() { 
        return edad; 
    }

    public String getEmail() { 
        return email; 
    }
}