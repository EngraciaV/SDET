package Class8;

import com.sun.source.tree.WhileLoopTree;

public class E11NestedLoops {
    public static void main(String[] args) {

        for (int j = 0; j < 4; j++) {
            int num = 2;
            while (num <= 10) {
                System.out.print(num + " ");
                num += 2;
            }
            System.out.println();
        }
    }
}
