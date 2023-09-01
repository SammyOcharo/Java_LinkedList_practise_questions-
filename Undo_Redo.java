
class State{

    public String data;

    public State(String data){
        this.data = data;
    }

}

class Node{
    State state;
    Node previous;
    Node next;

    public Node(State state){
        this.state = state;
        this.previous = null;
        this.next = null;
    }

}

class UndoSystem{
    Node current;
    Node tail;

    public UndoSystem(Node current, Node tail){
        this.current = current;
        this.tail = tail;
    }
}
public class Undo_Redo {
}
