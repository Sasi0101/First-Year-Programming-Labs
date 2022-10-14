import java.util.ArrayList;
import java.util.Iterator;

public class UserGroup{
    ArrayList<User> users;
    public UserGroup(){
        users = new ArrayList<User>();
     }
    public ArrayList<User> getUsers(){
        return(users);
     }
    void addSampleData(){
        User user1 = new User("alma1", "user", "Almas Pite1");
        User user2 = new User("alma2", "user", "Almas Pite2");
        User user3 = new User("alma3", "admin", "Almas Pite3");
        User user4 = new User("alma4", "admin", "Almas Pite4");
        User user5 = new User("alma5", "editor", "Almas Pite5");
        User user6 = new User("alma6", "editor", "Almas Pite6");
        User user7 = new User("alma7", "user", "Almas Pite7");
        User user8 = new User("alma8", "user", "Almas Pite8");
        User user9 = new User("alma9", "admin", "Almas Pite9");
        User user10 = new User("alma10", "editor", "Almas Pite10");
        this.users.add(user1);
        this.users.add(user2);
        this.users.add(user3);
        this.users.add(user4);
        this.users.add(user5);
        this.users.add(user6);
        this.users.add(user7);
        this.users.add(user8);
        this.users.add(user9);
        this.users.add(user10);
    }
    User getUser(int returnNumber){
        return users.get(returnNumber);
    }
    public void printUsernames(){
        for(User x : users)
        {
            System.out.println(x.getUsername() + " " + x.getUserType());
        }
    }
    public void removeFirstUser(){
        users.remove(0);   
    }
    public void removeLastUser(){
        users.remove(users.size()-1);   
    }
    public void removeUser(String username){
        Iterator<User> it=users.iterator();
        while(it.hasNext()){
            User user = it.next();
                if(user.getUsername().equals(username)) 
                    it.remove();
        }
    }
    public Iterator<User> getUserIterator(){
        Iterator<User> it=users.iterator();
        return it;
    }
    public void add(User user){
        users.add(user);
    }
    public int size(){
     return this.users.size();   
    }
}