/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbinventarisjava;

/**
 *
 * @author ana
 */
public class polimer {
    void posisi(){
        System.out.println("posisi");
    }
    class depan extends polimer{
        void posisi(){
        System.out.println ("depan");
        }
    }    
    class belakang extends polimer{
        void posisi(){
            System.out.println("belakang");
        }
        
    }
    
}
