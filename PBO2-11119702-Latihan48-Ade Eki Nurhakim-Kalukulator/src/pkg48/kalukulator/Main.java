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
public class Main {
    public static void main(String[] args) {
        Kalku k = new Kalku();
        System.out.println("Value 1 = "+k.getValue1());
        System.out.println("Value 2 = "+k.getValue2());
        System.out.println("Project Kalkulator");
        System.out.println("This Project shown you how to manage method in java");
        System.out.println("Result Add Is = "+k.add());
        System.out.println("Result Minus Is = "+k.Minus());
        System.out.println("Result Multiple I = "+k.Multiple());
        System.out.println("Result Division Is = "+k.Division());
        
    }
}
