/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Link;

/**
 *
 * @author DS-Española
 */
public class LinkMain {

    public static void main(String[] args) {
        LinkedList_BL bl = new LinkedList_BL();

        bl.AddLinked("Kobe Bryant", 38, 24, "Lakers", "Shooting Guard");
        bl.AddLinked("Michael Jordan", 44, 23, "Chicago", "Shooting Guard");
        bl.AddLinked("Lebron James", 34, 06, "Lakers", "Small Forward");
        bl.AddLinked("Stephen Curry", 28, 30, "GSW", "Point Guard");
        bl.AddLinked("Anthony Davis", 26, 3, "Lakers", "Center");
        
        bl.DisplayLink();
       // bl.deleteLink(0);
       // System.out.println("AFTER REMOVING");
       // bl.DisplayLink();
        bl.searchLink(3);

    }

}
