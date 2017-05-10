/**
 * Created by qngapparat on 03.05.17.
 */ //T, the kind of data this ADT holds can be chosen upon
 // generation

public class Node<T extends Object> {

    //variables
        private T value;
        protected Node<T> left;
        protected Node<T> right;
        protected boolean visited = false;

    //constructor
        Node(T value){
            this.value = value;
        }

    //methods
        public void visit(){
            System.out.println(this.value);
        }

        public void setLeft(Node<T> left){
            this.left = left;
        }

        public void setRight(Node<T> right){
            this.right = right;
        }

        public Node<T> getLeft(){
            return this.left;
        }

        public Node<T> getRight(){
            return this.right;
        }

        public boolean hasLeft(){
            return(this.left != null);
        }

        public boolean hasRight() {
            return(this.right != null);
        }

        public boolean visited(){
            return this.visited;
        }

        public void setVisited(boolean bool){

            this.visited = bool;
            return;
        }

}
