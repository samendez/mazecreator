/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mazecreator;

import java.util.ArrayList;

public class PrimMaze extends MazeBuilder {

    public PrimMaze(int rows, int cols) {
        super(rows, cols);
        if(cols % 2 == 0){
            cols+=1;
        }
        if(rows % 2 == 0){
            rows += 1;
        }
        this.fill(rows, cols);
    }


    @Override
    public void build() {
        build(this.getNode(1, 0),this.getNode(1, 1));
    }

    private void build(Node root, Node dest) {

        if (dest.visited()) {
            return;
        }
        this.traceTo(root, dest);
//        System.out.println(this + "\n");
        ArrayList<Integer[]> dirs = new ArrayList();
        dirs.add(new Integer[]{2, 0});
        dirs.add(new Integer[]{-2, 0});
        dirs.add(new Integer[]{0, 2});
        dirs.add(new Integer[]{0, -2});
        root = dest;
        while (!dirs.isEmpty()) {
            Integer[] dir = dirs.remove(random.nextInt(dirs.size()));
//            System.out.println(Arrays.toString(dir));
            try {
                build(root, this.neighbor(root, dir[0], dir[1]));
            } catch (IndexOutOfBoundsException e) {
            }
        }
    }

}
