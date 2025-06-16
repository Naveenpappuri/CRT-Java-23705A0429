public class Insertion{
    public static void main(String[] args){
        Linkedlist list = new Linkedlist();
        list.insertBeg(50);
        list.insertBeg(40);
        list.insertBeg(20);
        list.insertBeg(10);
        list.insertEnd(50);
        list.insertEnd(40);
        list.insertEnd(30);
        list.insertEnd(20);
        list.insertEnd(10);
        list.insert_pos(12,2);
        list.insert_pos(24,6);
        list.insert_pos(1,7);
        list.print();
        System.out.println(list.Length());
    }
    
    
}
//node class
class Node{
        int data;
        Node next;
        Node (int data){
            this.data = data;
            this.next = null;
        }
    }
    //linked list
class Linkedlist{
        Node head;
        Linkedlist(){
            this.head = null;
        }
    
    void insertBeg(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    void insertEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            newNode = null;
            return;
        }
        var temp =head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    void insert_pos(int data,int pos){
          int length_ =  Length();
          Node newNode = new Node(data);
          if(pos >= 0 && pos <= length_){
            if(pos == 0) insertBeg(data);
            else if(pos == length_) insertEnd(data);
            else{
                var temp = head;
                for(int i=1;i<pos;i++){
                    temp = temp.next;
                }
                newNode.next = temp.next;
                temp.next = newNode;
                
            }
            
          }
          else{
                System.out.println("Invalide position");
            }
    }
     void print(){
        var temp = head;
        while (temp.next != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.print("null\n");
    }
    int Length(){
        var temp = head;
        var length_ =0;
        while(temp.next != null){
            length_++;
            temp = temp.next;

        }
        return length_;
    }

    }
   