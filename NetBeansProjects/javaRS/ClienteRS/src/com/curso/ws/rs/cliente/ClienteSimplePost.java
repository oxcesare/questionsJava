/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.ws.rs.cliente;

import com.curso.ws.rs.bean.Empleado;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * *
 *
 *
 * @author Sandra
 */
public class ClienteSimplePost {

    public static void main(String[] args) {
        try {
            String contextURL = "http://localhost:8080/EjemploRS-war/";
            String resourcePath = "Empleado";
            String requestPath = "";
            String urlString = contextURL + resourcePath + requestPath;
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setAllowUserInteraction(true);
            connection.setDoOutput(true);
            connection.setDoInput(true);            
           
            connection.connect();
            OutputStream os = connection.getOutputStream();

            Empleado empleado = new Empleado();
            empleado.setId(1);
            empleado.setNombre("Sandra Luz ");
            empleado.setApellidoPaterno("Morales");
            empleado.setApellidoMaterno("Guitron");
            empleado.setSueldo(10000.00);
            PrintWriter writer = new PrintWriter(os);
            String json=new Gson().toJson(empleado);
            System.out.println(json);
            writer.print(json);
            writer.close();
            BufferedReader br
                    = new BufferedReader(
                            new InputStreamReader((InputStream) connection.getContent()));
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
