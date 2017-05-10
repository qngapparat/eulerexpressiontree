/**
 * Created by qngapparat on 10.05.17.
 */
public class EulerTour {

    public EulerTour(){

    }

    public static void inOrder(Node<?> node){
        if(node != null){
            if(!node.hasRight() && !node.hasLeft()){ //leaf node
                node.visit();
            }

            else{
                node.visit();
                inOrder(node.getLeft());
                node.visit();
                inOrder(node.getRight());
                node.visit();
            }
        }

    }


}
