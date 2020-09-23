/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.ws.rs.cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * *
 *

 * @author Sandra
 */
public class ClienteSimpleGet {

    public static void main(String[] args) throws MalformedURLException, IOException {
        String contextURL = "http://localhost:8080/EjemploRS-war/";
        String resourcePath = "Empleado/";
        String requestPath = "3";
        String urlString = contextURL + resourcePath + requestPath;
        URL url = new URL(urlString);
        InputStream is = (InputStream) url.getContent();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
