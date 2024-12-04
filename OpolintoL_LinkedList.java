import java.util.Scanner;
import java.util.InputMismatchException;
/**
 * Opolinto, Leo A.
 * 12/01/2024
 * Exception Handling Laboratory Challenge - Online Shopping Cart
 * CC2-1B
 */
class Node {
    String data;
    Node next;
    Node prev;
    boolean nowPlaying;

    public Node(String data, boolean nowPlaying) {
        this.data = data;
        this.nowPlaying = nowPlaying;
    }
}
public class OpolintoL_LinkedList{
    private Node head = null;
    
    public void append(String data, boolean nowPlaying) {
        Node newNode = new Node(data, nowPlaying);
        if (head == null) {
            head = newNode;
            newNode.next = newNode;
            newNode.prev = newNode;
        } else {
            Node tail = head.prev;
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = head;
            head.prev = newNode;
        }
    }
    public void display() {
        if (head == null) {
            return;
        }
        Node temp = head;
        do {
            if(temp.nowPlaying == true){
                System.out.println(temp.data + " (now playing!)");
            } else {
                System.out.println(temp.data + " ");
            }
            temp = temp.next;
        } while (temp != head);
    }
    public static void main (String[] args){
        Scanner gioScanner = new Scanner(System.in);
        OpolintoL_LinkedList cdll = new OpolintoL_LinkedList();
        System.out.println("This is your playlist right now:");
        cdll.append("Frank Ocean - Nike", false);
        cdll.append("21 Savage - Runnin", false);
        cdll.append("Jay-Z ft. Kanye West & Frank Ocean - No Church in the Wild", true);
        cdll.append("Tangzhou - no hard feelings", false);
        cdll.display();
        System.out.println("\nChoose an operation you would like to perform. \n1. Add Song\n2. Remove Song\n3. Next or Previous Song\n4. Display the current song and playlist\n5. Exit");
        while(true){
            try{
                int userChoice = gioScanner.nextInt();
                if(userChoice < 1 || userChoice > 5){
                    throw new InputMismatchException();
                }
                switch(userChoice){
                    case 1:
                        
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                }
            } catch (InputMismatchException e){
                System.out.println("System Error: Ra'stil, you have entered an invalid input. Please try again.");
                gioScanner.nextLine();
            }
        }
    }
}