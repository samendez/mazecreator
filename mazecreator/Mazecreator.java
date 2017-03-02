/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mazecreator;

/**
 *
 * @author shanemendez
 */
public class Mazecreator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PrimMaze p = new PrimMaze(200,200);
        p.build();
    }
    
}
