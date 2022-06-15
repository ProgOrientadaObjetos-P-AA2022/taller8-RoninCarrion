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
public class DocenteNombramiento extends Docente {

    private double valorFactura;
    private double ivaDescuento;
    private double valorCancelar;

    public void establecerValorFactura(double a) {
        valorFactura = a;
    }

    public void establecerIvaDescuento(double a) {
        ivaDescuento = a;
    }

    public void establecerValorCancelar() {
        valorCancelar = valorFactura - ((valorFactura * ivaDescuento)/100);
    }

    public double obtenerValorFactura() {
        return valorFactura;
    }

    public double obtenerIvaDescuento() {
        return ivaDescuento;
    }

    public double obtenerValorCancelar() {
        return valorCancelar;
    }
    
        @Override
    public String toString() {
    String reporte;
 
    reporte = String.format("\t\t--REPORTE DOCENTES--\n"
            + ">>> Nombre Docente: %s\n"
            + ">>> Identificación Docente: %s\n"
            + ">>> Valor de la Factura: %.2f\n"
            + ">>> Valor del Iva Descuento: %.2f\n"
            + ">>> Valor total a Cancelar: %.2f\n"
            , obtenerNombre()
            , obtenerCedula()
            , obtenerValorFactura()
            , obtenerIvaDescuento()
            , obtenerValorCancelar());
        return reporte;
    }

}
