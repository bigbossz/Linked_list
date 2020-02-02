package Link;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DS-Española
 */
public class Link {

    Link Firstlink;
    Link Nextlink;
    String PlayerName;
    int age;
    int jerseynumber;
    String Team;
    String Position;

    public Link() {

    }

    public Link( String PlayerName, int age, int jerseynumber, String Team, String Position) {
        this.Firstlink = Firstlink;
        this.Nextlink = Nextlink; 
        this.PlayerName = PlayerName;
        this.age = age;
        this.jerseynumber = jerseynumber;
        this.Team = Team;
        this.Position = Position;
        
        
        
    }
    void DiplayData(){
        System.out.println("PlayerName:"+PlayerName);
        System.out.println("Age:"+age);
        System.out.println("Jersey#:"+jerseynumber);
        System.out.println("Team:"+Team);
        System.out.println("Position:"+Position);
    
    }

    

    
    }
    


