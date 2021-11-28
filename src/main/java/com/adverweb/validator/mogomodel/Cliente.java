/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adverweb.validator.mogomodel;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Damian
 */
@Document(collection = "cliente")
public class Cliente {
    
@Id     
private String id;
private String nombre;
private String code;
private Date fecha_inicial;
private Date fecha_final;
private Date fefecha_notificacion;
private String acronimo;

    public Cliente(String id, String nombre, String code, Date fecha_inicial, Date fecha_final, Date fefecha_notificacion, String acronimo) {
        this.id = id;
        this.nombre = nombre;
        this.code = code;
        this.fecha_inicial = fecha_inicial;
        this.fecha_final = fecha_final;
        this.fefecha_notificacion = fefecha_notificacion;
        this.acronimo = acronimo;
    }

    
        public Cliente(String nombre, String code, Date fecha_inicial, Date fecha_final, Date fefecha_notificacion, String acronimo) {
        this.nombre = nombre;
        this.code = code;
        this.fecha_inicial = fecha_inicial;
        this.fecha_final = fecha_final;
        this.fefecha_notificacion = fefecha_notificacion;
        this.acronimo = acronimo;
    }

    public Cliente() {
    }
    
        
    
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getFecha_inicial() {
        return fecha_inicial;
    }

    public void setFecha_inicial(Date fecha_inicial) {
        this.fecha_inicial = fecha_inicial;
    }

    public Date getFecha_final() {
        return fecha_final;
    }

    public void setFecha_final(Date fecha_final) {
        this.fecha_final = fecha_final;
    }

    public Date getFefecha_notificacion() {
        return fefecha_notificacion;
    }

    public void setFefecha_notificacion(Date fefecha_notificacion) {
        this.fefecha_notificacion = fefecha_notificacion;
    }

    public String getAcronimo() {
        return acronimo;
    }

    public void setAcronimo(String acronimo) {
        this.acronimo = acronimo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", code=" + code + ", fecha_inicial=" + fecha_inicial + ", fecha_final=" + fecha_final + ", fefecha_notificacion=" + fefecha_notificacion + ", acronimo=" + acronimo + '}';
    }



}
