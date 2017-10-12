/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

/**
 *
 * @author Alumno
 */
public class variables {
    private double angulo;
    private double magnitud1;
    private double magnitud2;

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double x, double y) {
        this.angulo = Math.toDegrees(Math.atan2(y, x));
    }

    public double getMagnitud1() {
        return magnitud1;
    }

    public void setMagnitud1(double x1,double y1) {
        this.magnitud1 = Math.hypot(x1, y1);
    }

    public double getMagnitud2() {
        return magnitud2;
    }

    public void setMagnitud2(double x2,double y2) {
        this.magnitud2 = Math.hypot(x2, y2);
    }
    
}
