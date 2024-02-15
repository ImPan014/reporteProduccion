package com.mycompany.app;

import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {

    private final String messageTraspasos = "[\n" +
                    "    {\"id\": 1, \"tienda\": \"Tienda A\", \"proceso\": 2020, \"usuarios\": 150},\n" +
                    "    {\"id\": 2, \"tienda\": \"Tienda B\", \"proceso\": 2020, \"usuarios\": 120},\n" +
                    "    {\"id\": 3, \"tienda\": \"Tienda C\", \"proceso\": 2020, \"usuarios\": 200},\n" +
                    "    {\"id\": 4, \"tienda\": \"Tienda D\", \"proceso\": 2020, \"usuarios\": 180},\n" +
                    "    {\"id\": 5, \"tienda\": \"Tienda E\", \"proceso\": 2020, \"usuarios\": 220},\n" +
                    "    {\"id\": 6, \"tienda\": \"Tienda F\", \"proceso\": 2020, \"usuarios\": 170},\n" +
                    "    {\"id\": 7, \"tienda\": \"Tienda G\", \"proceso\": 2020, \"usuarios\": 190},\n" +
                    "    {\"id\": 8, \"tienda\": \"Tienda H\", \"proceso\": 2020, \"usuarios\": 160},\n" +
                    "    {\"id\": 9, \"tienda\": \"Tienda I\", \"proceso\": 2020, \"usuarios\": 140},\n" +
                    "    {\"id\": 10, \"tienda\": \"Tienda J\", \"proceso\": 2020, \"usuarios\": 210},\n" +
                    "    {\"id\": 11, \"tienda\": \"Tienda K\", \"proceso\": 2020, \"usuarios\": 230},\n" +
                    "    {\"id\": 12, \"tienda\": \"Tienda L\", \"proceso\": 2020, \"usuarios\": 250},\n" +
                    "    {\"id\": 13, \"tienda\": \"Tienda M\", \"proceso\": 2020, \"usuarios\": 270},\n" +
                    "    {\"id\": 14, \"tienda\": \"Tienda N\", \"proceso\": 2020, \"usuarios\": 240},\n" +
                    "    {\"id\": 15, \"tienda\": \"Tienda O\", \"proceso\": 2020, \"usuarios\": 260},\n" +
                    "    {\"id\": 16, \"tienda\": \"Tienda P\", \"proceso\": 2020, \"usuarios\": 280},\n" +
                    "    {\"id\": 17, \"tienda\": \"Tienda Q\", \"proceso\": 2020, \"usuarios\": 290},\n" +
                    "    {\"id\": 18, \"tienda\": \"Tienda R\", \"proceso\": 2020, \"usuarios\": 300},\n" +
                    "    {\"id\": 19, \"tienda\": \"Tienda S\", \"proceso\": 2020, \"usuarios\": 310},\n" +
                    "    {\"id\": 20, \"tienda\": \"Tienda T\", \"proceso\": 2020, \"usuarios\": 320}\n" +
                    "]";

    private final String messageAfiliaciones ="[\n" +
                    "    {\"id\": 1, \"tienda\": \"Tienda A\", \"proceso\": 2010, \"usuarios\": 150},\n" +
                    "    {\"id\": 2, \"tienda\": \"Tienda B\", \"proceso\": 2010, \"usuarios\": 120},\n" +
                    "    {\"id\": 3, \"tienda\": \"Tienda C\", \"proceso\": 2010, \"usuarios\": 200},\n" +
                    "    {\"id\": 4, \"tienda\": \"Tienda D\", \"proceso\": 2010, \"usuarios\": 180},\n" +
                    "    {\"id\": 5, \"tienda\": \"Tienda E\", \"proceso\": 2010, \"usuarios\": 220},\n" +
                    "    {\"id\": 6, \"tienda\": \"Tienda F\", \"proceso\": 2010, \"usuarios\": 170},\n" +
                    "    {\"id\": 7, \"tienda\": \"Tienda G\", \"proceso\": 2010, \"usuarios\": 190},\n" +
                    "    {\"id\": 8, \"tienda\": \"Tienda H\", \"proceso\": 2010, \"usuarios\": 160},\n" +
                    "    {\"id\": 9, \"tienda\": \"Tienda I\", \"proceso\": 2010, \"usuarios\": 140},\n" +
                    "]";

     private final String messageRetiros ="[\n" +
                    "    {\"id\": 1, \"tienda\": \"Tienda A\", \"proceso\": 3100, \"usuarios\": 500},\n" +
                    "    {\"id\": 2, \"tienda\": \"Tienda B\", \"proceso\": 3100, \"usuarios\": 2},\n" +
                    "    {\"id\": 3, \"tienda\": \"Tienda C\", \"proceso\": 3100, \"usuarios\": 20},\n" +
                    "]";


    public App() {}
    
    
    public static void main(String[] args) {
    if (args.length > 0) {
        String input = args[0];
        System.out.println(input);
        //String json = generateJSON(input);
        System.out.println(new App().generateJSON(input));
    } else {
        System.out.println("Debe proporcionar un argumento.");
    }
}

    private final String generateJSON(String input) {
        // Suponiendo que la entrada es un valor simple para los fines de demostración
        if (input.equals("Traspasos")) {
            return messageTraspasos;
        } else if (input.equals("Afiliaciones")) {
            return messageAfiliaciones
        } else if (input.equals("Retiros")) {
            return messageRetiros;
        }else{
            return "Adios mundo";
        }
    }
}
