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
public class Node {
    private boolean path = false;
    private boolean visited = false;
     String repr = "0";
    public int x,y;
    public Node(boolean path, int x, int y) {
        this.path = path;
        this.x = x;
        this.y = y;
//        this.repr = " ("+x+","+y+") ";
    }
    public void visit(){
        this.visited = true;
    }
    public void pave(){
        this.repr = " ";
        this.path = true;
    }
    public boolean visited(){
        return this.visited;
    }
    public String toString(){
        return repr;
    }
    public String loc(){
        return "("+x+","+y+")";
    }

    public boolean isPaved() {
        return path;
    }
    
}
