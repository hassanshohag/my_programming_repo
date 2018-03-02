/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factorial;

/**
 *
 * @author mint-t60-shohag
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int input = Integer.parseInt(args[0]);
        double result = Factorial(input);
        System.out.println(result);
    }
    
    public static double Factorial(int x){
        if (x < 0)
            return 0.0;
        double fact = 1.0;
        while(x>1) {
            fact = fact * x;
            x = x - 1;
        }
        return fact;
    }
}
