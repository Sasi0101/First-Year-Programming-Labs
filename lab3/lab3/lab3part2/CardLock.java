public class CardLock{
    SmartCard lastSmartCardSeen;
    boolean StudentsAllowed = false;
    boolean unlock=false;
    public SmartCard swipeCard(SmartCard cardName){
        lastSmartCardSeen = cardName;
        return lastSmartCardSeen;
    }
    public boolean isUnlocked(){
        if(StudentsAllowed == true) return true;
        else if (lastSmartCardSeen.isStaff() == true )return true;
        else return false;
    }
       public void toggleStudentAccess(){
        StudentsAllowed = !StudentsAllowed;
    }
    public SmartCard getLastCardSeen(){
        return lastSmartCardSeen;
    }
}