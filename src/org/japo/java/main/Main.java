/* 
 * Copyright 2019 Elísabet Palomino .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Elísabet Palomino
 */
public class Main {

    //Objeto Scanner
    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        //Constantes
        final double PRECIO_BOLSA = 5.00;
        final int CARAMELOS_BOLSA = 100;
        final double CARAMELO_SUELTO = 0.07;
        final double IVA = 0.21;

        //variables
        double totalCaramelos;
        double bolsasCompletas;
        double caramelosSueltos;
        double importeBolsas;
        double importeSuelto;
        double importePrevio;
        double importeIva;
        double precioFinal;
        //char porcentaje='%';

        try {
            System.out.println("CARAMELOS PARA BAUTIZOS ");
            System.out.println("======================= ");
            System.out.println(" ");
            System.out.print("Cantidad de caramelos ...: ");
            totalCaramelos = SCN.nextDouble();

            System.out.println(" ");

            bolsasCompletas = totalCaramelos / CARAMELOS_BOLSA;
            System.out.printf("Bolsas completas ........: %.0f%n", bolsasCompletas - 1);

            caramelosSueltos = (bolsasCompletas - (int) bolsasCompletas) * CARAMELOS_BOLSA;
            System.out.printf("Caramelos sueltos .......: %.0f%n", caramelosSueltos);
            //revisar pareniesis       
            System.out.println(" ");

            importeBolsas = (int) bolsasCompletas * PRECIO_BOLSA;
            System.out.printf(Locale.ENGLISH, "Importe bolsas ..........: %.2f €%n", importeBolsas);

            importeSuelto = caramelosSueltos * CARAMELO_SUELTO;
            System.out.printf(Locale.ENGLISH, "Importe suelto ..........: %.2f €%n", importeSuelto);

            System.out.println(" ");

            importePrevio = importeBolsas + importeSuelto;
            System.out.printf(Locale.ENGLISH, "Importe previo ..........: %.2f €%n", importePrevio);

            System.out.println(" ");

            importeIva = importePrevio * IVA;
            System.out.printf(Locale.ENGLISH, "IVA ( 21%% ) .............: %.2f €%n", importeIva);
            System.out.println(" ");

            precioFinal = importePrevio + importeIva;
            System.out.printf(Locale.ENGLISH, "Importe PVP .............: %.2f €%n", precioFinal);

        } catch (Exception e) {

            System.out.println(">>> Entrada errónea ");

        } finally {

            SCN.nextLine();

        }

    }//main

}//class
