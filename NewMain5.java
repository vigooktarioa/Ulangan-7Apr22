/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tes;

/**
 *
 * @author LENOVO
 */
public class NewMain5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 99999, 7, 8, 9, 10};
        int max = arr[0];
          for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
             max = arr[i];
            }
          }
        System.out.println(max);
    }
    
}
