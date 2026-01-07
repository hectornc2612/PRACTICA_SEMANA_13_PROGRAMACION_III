package com.hectornunez.primerproyectomaven;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonaTest {

    @Test
    void fromString_ShouldReturnPersona_WhenInputIsValid() {
        String input = "Juan,Garcia,25,juan@email.com";
        Persona persona = Persona.fromString(input);
        assertNotNull(persona);
        assertEquals("Juan", persona.getNombre());
        assertEquals("Garcia", persona.getApellido());
        assertEquals(25, persona.getEdad());
        assertEquals("juan@email.com", persona.getEmail());
    }

    @Test
    void fromString_ShouldThrowException_WhenInputIsNull() {
        String input = null;
        assertThrows(IllegalArgumentException.class, () -> Persona.fromString(input));
    }
}