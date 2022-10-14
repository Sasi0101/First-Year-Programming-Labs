public class SmartCard{
    String ownerName;
    boolean staffStatus=false;
 public SmartCard(String inputName){
    ownerName=inputName;
    }
 public String getOwner(){
    return ownerName;
    }
 public boolean setStaff(boolean setstaffStatus){
     staffStatus = setstaffStatus;
     return staffStatus;
    }
 public boolean isStaff(){
    if(staffStatus == true) return true;
    else return false;
    }
}