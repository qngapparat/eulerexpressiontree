/**
 * Created by qngapparat on 03.05.17.
 */
public class Main {

    public static void main(String[] args) {

        Node<Integer> one = new Node<Integer>(1);
        Node<Integer> two = new Node<Integer>(2);
        Node<Integer> three = new Node<Integer>(3);
        Node<Integer> four = new Node<Integer>(4);
        Node<Integer> five = new Node<Integer>(5);
        Node<Integer> six = new Node<Integer>(6);
        Node<Integer> seven = new Node<Integer>(7);
        Node<Integer> eight = new Node<Integer>(8);
        Node<Integer> nine = new Node<Integer>(9);

        one.setLeft(two);
        one.setRight(three);
        two.setLeft(four);
        two.setRight(five);
        three.setLeft(six);
        four.setLeft(seven);
        six.setLeft(eight);
        six.setRight(nine);


        System.out.println("The tree so far (in breadth idk):");
        TreeTraversal.BreathFirst(one);
        System.out.println("The tree so far (in depth):");
        TreeTraversal.DepthFirst(one);
        System.out.println("euler tour lmaoo:");
        EulerTour.inOrder(one);


    }


}
