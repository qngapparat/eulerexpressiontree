import java.util.*;

/**
 * Created by qngapparat on 03.05.17.
 */
public class TreeTraversal {

    public TreeTraversal(){

    }

    public static void BreathFirst(Node<?> node){

        Queue<Node<?>> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            Node<?> next = queue.remove();
            next.visit();
            if(next.hasLeft()){
                queue.add(next.getLeft());
            }

            if(next.hasRight()){
                queue.add(next.getRight());
            }
        }
    }

    public static void DepthFirst(Node<?> node){

        Deque<Node<?>> stack = new ArrayDeque<>();
        stack.push(node);
        while(!stack.isEmpty()){
            Node<?> next = stack.pop();
            if(!next.visited){
                next.setVisited(true);
                next.visit();

                if(next.hasRight()){
                    stack.push(next.getRight());
                }

                if(next.hasLeft()){
                    stack.push(next.getLeft());
                }
            }

        }


    }

}
