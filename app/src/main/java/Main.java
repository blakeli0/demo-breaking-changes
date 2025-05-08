import org.example.Human;
import org.example.libraryWrapper.Employer;

public class Main {
    public static void main(String[] args) {
        Employer employer = new Employer();
        employer.makeMoney();
        Human human = new Human();
        //doubleWork() only exists in v2
//        human.doubleWork();
    }
}
