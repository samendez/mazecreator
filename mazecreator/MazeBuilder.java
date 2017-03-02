/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mazecreator;

import java.util.Random;

/**
 *
 * @author shanemendez
 */
public abstract class MazeBuilder extends Maze {

    protected Random random = new Random();

    public MazeBuilder(int rows, int cols) {
        long seed = new Random().nextLong();
        random.setSeed(seed);
        System.out.println(seed);
    }

    public abstract void build();
}
