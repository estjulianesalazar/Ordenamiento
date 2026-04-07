/*25
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ordenamiento;

/**
 *
 * @author legon
 */
import java.util.Scanner;
import java.util.Random;

public class Ordenamiento {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.print("Ingrese el Tamano Del Arreglo");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for  (int i = 0;i < n; i++){
            
            arr[i] = rand.nextInt(100) - 50;
        }
        
        ordenar(arr);
        System.out.println(java.util.Arrays.toString(arr));
        
    }  
    private static void ordenar(int v[]) {
        //for (int i = 0; i < v.length-1; i++){
          //  for (int j = i+1; j < v.length ; j++){
             //   if(v[i] > v[j]){
                //    int w = v[j];
                //    v[j] = v[i];
                //    v[i] = w;
               // }
            //}
        //}
    //}
//}
        for (int i = 0; i < v.length -1; i++){
            int minIndex = i;
            
            for (int j = i + 1; j < v.length; j++){
                if(v[j] < v[minIndex]){
                    minIndex = j;
                }
            }
            
            int temp = v[i];
            v[i] = v[minIndex];
            v[minIndex]= temp;
        }
    }
}