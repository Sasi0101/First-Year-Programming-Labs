import java.util.Iterator;

public class Main{
    public static void main(String[] args){
        UserGroup myUserGroup = new UserGroup();
        myUserGroup.addSampleData();
        //myUserGroup.printUsernames();
        UserGroup administrators = new UserGroup();
        
        Iterator<User> it= myUserGroup.getUserIterator();
        while(it.hasNext()){
            User user = it.next();
            if(user.getUserType().equals("admin"))
                administrators.add(user);
        }
        administrators.printUsernames();
        administrators.getUser(administrators.size()-1).setUserType("user");
        myUserGroup.printUsernames();
        administrators.printUsernames();
    }
}