/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mazecreator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author shanemendez
 */
public class Maze {

    Node[][] maze; //true if path
    private int width,height;
    public void fill(int rows, int cols){
        maze = new Node[cols][rows];
        this.width = rows;
        this.height = cols;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                maze[j][i] = new Node(false, i, j);
            }
        }
    }
    public void traceTo(Node root, Node dest) {
        traceTo(root, dest, (int) Math.signum(dest.x - root.x), (int) Math.signum(dest.y - root.y));
    }

    public void traceTo(Node root, Node dest, int dx, int dy) {
        root.visit();
        root.pave();
//        System.out.println(this + "\n");
        if (root == dest) {
            return;
        }
        root = this.neighbor(root, dx, dy);
        traceTo(root, dest, dx, dy);
    }

    public Node neighbor(Node home, int horiz, int vert) {
        Node n = this.getNode(home.x + horiz, home.y + vert);
//        System.out.println(home.loc() + " " + n.loc());
        return n;  // -vert makes down negative
    }

    public Node getNode(int x, int y) {
        return this.maze[y][x];
    }

    public String toString() {
        String m = "";
        for (int i = 0; i < maze.length - 1; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                m += maze[i][j];
            }
            m += "\n";
        }
        //do this so the last row doesnt have a new line after
        for (int j = 0; j < maze[0].length; j++) {
            m += maze[maze.length - 1][j];
        }
        return m;
    }

    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

}
