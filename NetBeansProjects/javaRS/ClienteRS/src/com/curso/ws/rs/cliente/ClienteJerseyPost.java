/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.ws.rs.cliente;

import com.curso.ws.rs.bean.Empleado;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * *
 *
 *
 * @author Sandra
 */
public class ClienteJerseyPost {

    public static void main(String[] args) {
        try {
            String contextURL = "http://localhost:8080/EjemploRS-war/";
            Client client = ClientBuilder.newClient();
            WebTarget webTarget= client.target(contextURL).path("Empleado/");
            
            Empleado empleado = new Empleado();
            empleado.setId(1);
            empleado.setNombre("Sandra Luz ");
            empleado.setApellidoPaterno("Morales");
            empleado.setApellidoMaterno("Guitron");
            empleado.setSueldo(10000.00);
            Gson gson= new Gson();
            
            Response response= webTarget.request(MediaType.APPLICATION_JSON_TYPE)
                    .post(Entity.json(gson.toJson(empleado)));
            System.out.println(response.getStatus());
            System.out.println(response.readEntity(String.class));
            
            
            
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
