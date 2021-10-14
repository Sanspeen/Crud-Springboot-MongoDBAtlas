package com.example.PersonasMongoDB.colecciones;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document //@Document - Permite identificar a la clase como un documento dentro de una colección en una base de datos mongo, de esta manera las instancias de esta clase serán los documentos que integren una colección determinada. Por defecto el nombre de la colección será el nombre de la clase.
public class Empleado {
    @Id
    private String id;
    private String nombre;
    private String rol;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
