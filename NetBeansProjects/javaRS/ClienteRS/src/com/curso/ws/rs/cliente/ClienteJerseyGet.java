/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.ws.rs.cliente;

import com.curso.ws.rs.bean.Empleado;
import com.google.gson.Gson;

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
public class ClienteJerseyGet {

    public static void main(String[] args) {
        try {
            String contextURL = "http://localhost:8080/EjemploRS-war/";
            Client client = ClientBuilder.newClient();
            WebTarget webTarget = client.target(contextURL).path("Empleado/").path("3");
            Gson gson = new Gson();
            Response response = webTarget.request(MediaType.APPLICATION_JSON_TYPE).get();
             
            System.out.println(response.getStatus());
            String respuesta= response.readEntity(String.class);
            System.out.println(respuesta);
            Empleado empleado = gson.fromJson(respuesta, Empleado.class);
            System.out.println(empleado.getId());
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
