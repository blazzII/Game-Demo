
package game.demo;

import byui.cit260.GameDemo.model.Player;

/**
 *
 * @author Blazzard
 */

public class GameDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setUserName("Jason Blazzard");
        playerOne.setBestTime(0);
        playerOne.setAge(39);
       
        System.out.println(playerOne.toString());
    }
    
}
