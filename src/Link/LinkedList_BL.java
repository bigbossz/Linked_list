package Link;

import Link.Link;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DS-Española
 */
public class LinkedList_BL {

    Link FL = null;

    public LinkedList_BL() {
        Link FL = null;
    }

    void AddLinked(String PlayerName, int age, int jerseynumber, String Team, String Position) {
        Link newlink = new Link(PlayerName, age, jerseynumber, Team, Position);
        newlink.Nextlink = FL;
        FL = newlink;
    }
 
        void deleteLink(int position) 
    { 
        // If linked list is empty 
        if (FL == null) 
            return; 
  
        // Store FL link 
        Link temp = FL; 
  
        // If FL needs to be removed 
        if (position == 0) 
        { 
            FL = temp.Nextlink;   // Change FL 
            
        } 
  
        // Find previous Link of the Link to be deleted 
        for (int i=0; temp!=null && i<position-1; i++) 
            temp = temp.Nextlink; 
  
        // If position is more than number of link 
        if (temp == null || temp.Nextlink == null) 
            return; 
  
        // Link temp->next is the Link to be deleted 
        // Store pointer to the next of Link to be deleted 
        Link next = temp.Nextlink.Nextlink; 
  
        temp.Nextlink = next;  // Unlink the deleted Link from list 
    } 
    void searchLink(int data) {  
        Link current = FL;  
        int i = 1; 
 
        if(FL == null) {  
            System.out.println("List is empty");  
        }  
        else {  
            while(current != null) {                  
                if(current.jerseynumber == data) {   
                    break;  
                }  
                i++;  
                current = current.Nextlink;  
            }  
        }  
        if(current!=null)  
             System.out.println("Element is present in the list at the position : " + i);  
        else  
             System.out.println("Element is not present in the list");  
    }  
    

    void DisplayLink() {

        Link Linked = FL;
        while (Linked != null) {
            Linked.DiplayData();
            Linked = Linked.Nextlink;
            System.out.println("---------");
        }

    }

}
