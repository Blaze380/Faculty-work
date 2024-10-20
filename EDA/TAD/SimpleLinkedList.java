class SimpleLinkedList<T>{
    private  class  Node{
        public T data;
        public   Node nextNode;

        public  Node(){}

        public  Node(T data ){
            this.data= data;
        }
        public Node(T data, Node nextNode){
            this.data= data;
            this.nextNode= nextNode;
        }
        public  boolean  compareTo(Node obj){
            return  obj==this;
        }
    }

    public Node head, tail ;
    public  int nElements;
    public SimpleLinkedList(){
        head = new Node();
        tail = new Node(null,head);
    }
    public Node begin(){
        return  head ;
    }
    public  Node end(){
        return  tail;
    }
    public  Node next(int p){
       if(p>=nElements) throw  new IllegalTailCallException("Chamada de next para o final da lista");
       if(true)
        return p.next();
    }

}