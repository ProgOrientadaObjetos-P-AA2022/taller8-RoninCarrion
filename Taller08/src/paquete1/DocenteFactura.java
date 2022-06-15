/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class DocenteFactura extends Docente {

    private double valorSueldo;
    private double valorHoraExtra;
    private double numeroHorasExtra;
    private double sueldoFinal;

    public void establecerValorSueldo(double a) {
        valorSueldo = a;
    }

    public void establecerValorHoraExtra(double a) {
        valorHoraExtra = a;
    }

    public void establecerNumeroHorasExtra(double a) {
        numeroHorasExtra = a;
    }

    public void establecerSueldoTotal() {
        sueldoFinal = valorSueldo + (valorHoraExtra * numeroHorasExtra);
    }

    public double obtenerValorSueldo() {
        return valorSueldo;
    }

    public double obtenerValorHoraExtra() {
        return valorHoraExtra;
    }

    public double obtenerNumeroHorasExtra() {
        return numeroHorasExtra;
    }

    public double obtenerSueldoTotal() {
        return sueldoFinal;
    }

    @Override
    public String toString() {
    String reporte;
 
    reporte = String.format("\t\t--REPORTE DOCENTES--\n"
            + ">>> Nombre Docente: %s\n"
            + ">>> Identificación Docente: %s\n"
            + ">>> Valor del sueldo: %.2f\n"
            + ">>> Valor Hora Extra: %.2f\n"
            + ">>> Número Extra de Horas trabajadas: %.2f\n"
            + ">>> Valor Total del Sueldo: %.2f\n"
            , obtenerNombre()
            , obtenerCedula()
            , obtenerValorSueldo()
            , obtenerValorHoraExtra()
            , obtenerNumeroHorasExtra()
            , obtenerSueldoTotal());
        return reporte;
    }
    

}
