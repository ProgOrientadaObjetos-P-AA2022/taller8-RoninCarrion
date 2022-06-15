/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;
import paquete1.DocenteFactura;
import paquete1.DocenteNombramiento;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String mensaje;
        a.useLocale(Locale.US);
        System.out.println("EL SIGUIENTE PROGRAMA REGISTRARÁ DATOS DE DOCENTES");
        System.out.println("Ingrese [1]Para ingresar datos de un Docente "
                + "con Nombramiento\n"
                + "Ingrese [2] Para ingresar datos de un Docente Factura");
        String option = a.nextLine();
        // ------------------------------------------------
        if (!option.equals("1") && !option.equals("2")) {
            System.out.println("Ingresa valores válidos");
            // System.exit(0);
        } else {
            System.out.println("Ingrese el nombre del Docente: ");
            String nombre = a.nextLine();

            System.out.println("Ingrese la identificación del Docente: ");
            String id = a.nextLine();
            switch (option) {
                case "1":
                    mensaje = docenteNombramiento(nombre, id);
                    System.out.println(mensaje);
                    break;

                case "2":
                    mensaje = docenteFactura(nombre, id);
                    System.out.println(mensaje);
                    break;
                default:
                    System.out.println("Algo ha ocurrido...");
                    break;
            }
        }
    }

    public static String docenteNombramiento(String a, String b) {
        DocenteNombramiento d = new DocenteNombramiento();
        Scanner z = new Scanner(System.in);
        String cadena;
        System.out.println("~Ingrese el valor de la Factura del Docente: ");
        double valorFactura = z.nextDouble();
        System.out.println("~Ingrese el valor del Iva en el siguiente formato\n"
                + "[12 o 12.5], es decir como números enteros o decimales,\n"
                + " sin el porcentaje[%]");
        double iva = z.nextDouble();
        d.establecerNombre(a);
        d.establecerCedula(b);
        d.establecerIvaDescuento(iva);
        d.establecerValorFactura(valorFactura);
        d.establecerValorCancelar();
        cadena = String.format("%s", d);
        return cadena;
    }

    public static String docenteFactura(String a, String b) {
        DocenteFactura d = new DocenteFactura();
        Scanner z = new Scanner(System.in);
        String cadena;
        System.out.println("~Ingrese el valor del sueldo del Docente: ");
        double sueldo = z.nextDouble();
        System.out.println("~Ingrese el número de horas extras trabajadas por "
                + "el docente: ");
        double numHoras = z.nextDouble();
        System.out.println("~Ingrese el valor de cada hora extra trabajada: ");
        double valorHoraExtra = z.nextDouble();
        d.establecerNombre(a);
        d.establecerCedula(b);
        d.establecerValorSueldo(sueldo);
        d.establecerNumeroHorasExtra(numHoras);
        d.establecerValorHoraExtra(valorHoraExtra);
        d.establecerSueldoTotal();
        cadena = String.format("%s", d);
        return cadena;
    }
}
