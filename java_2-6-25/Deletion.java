public class Deletion{
    public static void main(String[] args){
        Linkedlist list = new Linkedlist();
        list.insertBeg(12);
        list.insertBeg(13);
        list.insertBeg(14);
        list.insertBeg(15);
        list.insertBeg(16);
        list.insertBeg(17);
        list.deleteBeg();
        list.print_list();
    }
}
class Node {
    int data;
    Node next;
    Node (int data){
        this.data = data;
        this.next = null;
    }
}
class Linkedlist{
    Node head;
    Linkedlist(){
        this.head = null;
    }
    int deleteBeg(){
        if(head == null){
            System.out.println("There are no elements to delete");
            return -1;
        }
        int removedEle = head.data;
        head = head.next;
        return removedEle;
    }
    void insertBeg(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    void print_list(){
        
        var temp = head;
        while (temp.next != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.print("null\n");
    
    }
}