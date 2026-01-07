package com.midominio.primerproyectomaven;

import com.google.gson.Gson;

public class App {
    public static void main(String[] args) {
        
        Persona p = new Persona("Pepe", 25);
        
        Gson gson = new Gson();
        String json = gson.toJson(p);
        
        System.out.println("--- PRUEBA MAVEN + GSON ---");
        System.out.println("JSON generado: " + json);
    }
}