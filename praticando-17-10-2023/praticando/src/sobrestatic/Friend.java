package sobrestatic;

import java.sql.SQLSyntaxErrorException;

public class Friend {
    String name;
    static int numbers;


    Friend(String name){
        this.name = name;
        this.numbers ++;
    }

    static void howManyFriends(){
        System.out.println("You have " + numbers + " friend(s)");
    }

}
