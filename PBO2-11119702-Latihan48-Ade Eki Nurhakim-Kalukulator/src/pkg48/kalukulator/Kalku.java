/*Nama 	 : Ade Eki Nurhakim
NIM 	 : 10119702
Fakultas : Teknik Dan Ilmu Komputer
Prodi 	 : Teknik Informatika
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg48.kalukulator;

/**
 *
 * @author Ekiw
 */
public class Kalku {
    private double value1;
    private double value2;

    public double getValue1() {
        return value1;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public double getValue2() {
        return value2;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }
    public double add(){
        return value1+value2;
    }
    public double Minus(){
        return value1-value2;
    }
    public double Multiple(){
        return value1*value2;
    }
    public double Division(){
        return value1/value2;
    }
}
