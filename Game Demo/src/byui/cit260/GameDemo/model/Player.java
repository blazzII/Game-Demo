package byui.cit260.GameDemo.model;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Blazzard
 */
public class Player implements Serializable{
    private String userName;
    private double bestTime;
    private int age;

    public Player() {
    }
    
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public double getBestTime() {
        return bestTime;
    }

    public void setBestTime(double bestTime) {
        this.bestTime = bestTime;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.userName);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.bestTime) ^ (Double.doubleToLongBits(this.bestTime) >>> 32));
        hash = 97 * hash + this.age;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "userName=" + userName + ", bestTime=" + bestTime + ", age=" + age + '}';
    }

    
    
    
}
