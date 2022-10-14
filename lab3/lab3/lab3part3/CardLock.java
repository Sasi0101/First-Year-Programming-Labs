public class CardLock{
    SmartCard lastSmartCardSeen;
    boolean StudentsAllowed = false;
    boolean unlock=false;
    public SmartCard swipeCard(SmartCard cardName){
        lastSmartCardSeen = cardName;
        return lastSmartCardSeen;
    }
    public SmartCard getLastCardSeen(){
        return lastSmartCardSeen;
    }
    public boolean isUnlocked(){
        if(lastSmartCardSeen.isStaff() == true) return true;
        else if (StudentsAllowed == true )return true;
        else return false;
    }
       public void toggleStudentAccess(){
        StudentsAllowed = !StudentsAllowed;
    }
}