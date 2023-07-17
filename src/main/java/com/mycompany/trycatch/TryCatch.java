/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trycatch;

/**
 *
 * @author Pc Elias
 */
public class TryCatch {

    public static void main(String[] args) {
        
        try{
            int [] vetor = new int[3];
            vetor [4] = 1;
            System.out.println("Deu certo");
        } catch (Exception e){
            System.out.println("Deu erro!!");
        } finally{
            System.out.println("Fim do Try Catch!");
        }
        
        
    }
}
    
