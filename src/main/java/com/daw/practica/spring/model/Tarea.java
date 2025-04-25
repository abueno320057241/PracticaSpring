package com.daw.practica.spring.model;

public class Tarea {
int id;
String descripcion;
boolean completado;

    public Tarea(int id, String descripcion, boolean completado) {
        this.id = id;
        this.descripcion = descripcion;
        this.completado = completado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }
}
