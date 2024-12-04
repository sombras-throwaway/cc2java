package Activities;

import java.util.Scanner;
import java.util.InputMismatchException;
/**
 * Opolinto, Leo A.
 * 12/01/2024
 * Circular Doubly Linked List - Music Playlist
 * CC2-1B
 */
class Node {//creates the class Node, which has both the string data containing the song and a boolean nowPlaying to track the song that is currently playing
    String data;
    Node next;
    Node prev;
    boolean nowPlaying;

    public Node(String data, boolean nowPlaying) {//function for creating the node which then inherits the values of data and nowPlaying at creation
        this.data = data;
        this.nowPlaying = nowPlaying;
    }
}
public class OpolintoL_LinkedList{
    private Node head = null;//sets the current head of the list to be empty
    
    public void append(String data, boolean nowPlaying) {//append function that takes 2 values: the song name and whether it is playing or not. for how the program handles the current song playing, by default it is set to false unless predefined
        Node newNode = new Node(data, nowPlaying);
        if (head == null) {//if the list is still empty, it sets newNode as the only element so far which is why both its previous and next nodes are itself
            head = newNode;
            newNode.next = newNode;
            newNode.prev = newNode;
        } else {//if the list has more than one element, it creates a Node tail which contains the node previous to the head and then uses it to chain all of the elements together such that if a user traverses to the end of the list they will then arrive back at the start and vice versa
            Node tail = head.prev;
            tail.next = newNode;//since it is setting the next element to itself as newNode and it is the node previous to head, it is basically making an element in the middle of them
            newNode.prev = tail;//same concept and purpose as how tail works, but it basically makes itself be in the middle of the tail and head elements
            newNode.next = head;
            head.prev = newNode;
        }
    }
    public int findIndex(String targetSong) {//takes a string targetsong which contains which song the user wants to remove and returns the node's index
        if (head == null) {
            return -1;
        }
        Node temp = head;//nodes such as temp and later current act as pointers and not actual nodes, we can use them to point to specific places in the list and then subsequently their next and previous values
        int index = 0;
        do {
            if (temp.data.equals(targetSong)) {//checks if data at the node matches the targetSong entered by the user
                return index;
            }
            temp = temp.next;
            index++;
        } while (temp != head);//using a do-while loop, we can evaluate the do at least once without skipping, meaning we can start the search at the head node
        return -1;
    }
    public void removeAt(int index) {//takes an integer index from the function findIndex and then deletes the node at that index
        if (head == null) {//self explanatory, immediately returns when it detects that the head node is null
            System.out.println("The playlist is empty.");
            return;
        }
        Node temp = head;//creates a temporary node that uses the head node
        int currentIndex = 0;
        do {
            if (currentIndex == index) {
                if (temp == head && temp.next == head) {//checks if there's only one element in the list
                    head = null;
                } else {
                    temp.prev.next = temp.next;//makes temp cycle through the nodes by 1 node each.  temps previous' next node will become temp's next node
                    temp.next.prev = temp.prev;
                    if (temp == head) {
                        head = temp.next;
                    }
                }
                System.out.println("Song removed successfully!");
                return;
            }
            temp = temp.next;//makes temp its next node, which has been cycled through from the code above
            currentIndex++;//increments the currentIndex variable. we use currentIndex because we cannot use a for loop unlike in arrays
        } while (temp != head);//same purpose as the findIndex function
    }

    public void display() {//displays the playlist
        if (head == null) {
            return;
        }
        Node temp = head;
        do {
            if(temp.nowPlaying == true){//detects if the current node is playing or not via the nowPlaying boolean
                System.out.println(temp.data + " (now playing!)");
            } else {
                System.out.println(temp.data + " ");
            }
            temp = temp.next;
        } while (temp != head);
    }
    public static void main (String[] args){
        Scanner gioScanner = new Scanner(System.in);
        OpolintoL_LinkedList gioSpotify = new OpolintoL_LinkedList();
        System.out.println("This is your playlist right now:");//generates a few default nodes via the append function as a default playlist for gioSpotify
        gioSpotify.append("Frank Ocean - Nike", false);
        gioSpotify.append("21 Savage - Runnin", false);
        gioSpotify.append("Jay-Z ft. Kanye West & Frank Ocean - No Church in the Wild", true);//because of the way the user is meant to select the currently playing song, only one node can have a true nowPlaying boolean value at a time
        gioSpotify.append("Tangzhou - no hard feelings", false);
        gioSpotify.append("Tyla - Water", false);
        gioSpotify.display();//outputs the default playlist
        while(true){
            try{
                System.out.println("\nChoose an operation you would like to perform. \n1. Add Song\n2. Remove Song\n3. Next or Previous Song\n4. Display the current song and playlist\n5. Exit");
                int userChoice = gioScanner.nextInt();
                if(userChoice < 1 || userChoice > 5){
                    throw new InputMismatchException();//catch an inputmismatchexception at will if the user enters a number that is not within the options
                }
                switch(userChoice){//evaluates the user's input to determine their desired function
                    case 1://add song given title
                        gioScanner.nextLine();
                        System.out.print("Enter the song you would like to add. ");
                        gioSpotify.append(gioScanner.nextLine(), false);//nowPlaying is false because the user is not meant to add and then make a song play immediately all at once
                        System.out.println("Song added successfully!");
                        break;
                    case 2:
                        gioScanner.nextLine();
                        System.out.print("Enter the song you would like to remove. ");
                        gioSpotify.removeAt(gioSpotify.findIndex(gioScanner.nextLine()));//runs the removeAt function given the index returned by findIndex using the song title inputted by the user. it must be exact both in case and in spacing
                        System.out.println("Song removed successfully!");
                        break;
                    case 3:
                        System.out.println("Choose an option:\n1. Play next song\n2. Play previous song");//lets the user choose if they want to play the next or previous song.
                        int nextOrPrev = gioScanner.nextInt();
                        if (gioSpotify.head == null) {
                            System.out.println("The playlist is empty.");
                            break;
                        }
                        Node current = gioSpotify.head;//makes a current node which then stores the node that has the true nowPlaying boolean
                        do {
                            if (current.nowPlaying) {//checks if the node the current node contains has a true nowPlaying value
                                current.nowPlaying = false; //sets the current node's nowPlaying value to false
                                if (nextOrPrev == 1) {
                                    current = current.next; //sets current node to the next song
                                } else if (nextOrPrev == 2) {
                                    current = current.prev; //sets current node to the previous song
                                } else {
                                    System.out.println("Invalid choice. Please try again.");
                                    break;
                                }
                                current.nowPlaying = true; // Set new current song as "now playing"
                                System.out.println("Now playing: " + current.data);
                                break;
                            }
                            current = current.next;//makes current point to the next node
                        } while (current != gioSpotify.head);
                        break;
                    case 4:
                        System.out.println("This is your playlist right now:");
                        gioSpotify.display();
                        break;
                    case 5:
                        System.out.println("Thank you for using the program.");
                        System.exit(0);
                }
            } catch (InputMismatchException e){
                System.out.println("System Error: Ra'stil, you have entered an invalid input. Please try again.");
                gioScanner.nextLine();
            }
        }
    }
}
