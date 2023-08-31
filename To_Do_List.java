//To-Do List: Using singly linked list be used to implement a simple to-do list, allowing users to add, remove, and mark tasks as complete.


class Task{
    String description;
    boolean isComplete;

    Task next;

    public Task(String description){
        this.description = description;
        this.isComplete = false;
        this.next = null;
    }
}

class ToDoList{
    Task head;

    public ToDoList(){
        this.head = null;
    }

    public void addTask(String description){
        Task newTask = new Task(description);

        if(head==null){
            head = newTask;
        } else {
            Task current = head;
            while (current.next !=null){
                current = current.next;
            }

            current = newTask;
        }
    }

    public void markTaskComplete(String description){
        Task current = head;

        while (current !=null){
            if (current.description.equalsIgnoreCase(description)){
                current.isComplete = true;
                break;
            }
            current = current.next;
        }
    }

    public  void removeTask(String description){

        if(head == null){
            return;
        }

        if(head.description.equalsIgnoreCase(description)){
            head = head.next;
            return;
        }

        Task current = head;

        while (current.next != null){
            if(current.next.description.equalsIgnoreCase(description)){
                current.next = current.next.next;
                break;
            }
            current = current.next;
        }


    }

    public  void printTask(){
        Task current = head;

        while (current != null){
            System.out.println(current.description + (current.isComplete ? " [Completed ]" : " "));
            current = current.next;

        }
    }

}

public class To_Do_List {
    public static void main(String[] args) {
        ToDoList todo = new ToDoList();

        todo.addTask("Buy groceries");
        todo.addTask("Finish homework");
        todo.addTask("Go for checkup");
        todo.addTask("Go for a run");

        todo.markTaskComplete("Finish homework");

        todo.removeTask("Buy groceries");

        todo.printTask();
    }
}
