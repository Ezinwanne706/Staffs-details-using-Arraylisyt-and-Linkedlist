import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
     Redstaffs staff1 = new Redstaffs(1, 25, "Emmanuel Sam", "emmanuel.ezinwanne@redtechlimited.com");
     Redstaffs staff2 = new Redstaffs(2, 23, "Evangelist Sam", "evangelist.sam@unicap.com");
     Redstaffs staff3 = new Redstaffs(3, 19, "Sam Grace", "graceigweola@gmail.com");
     Redstaffs staff4 = new Redstaffs(4, 25, "Sam samuel", "samuelnnamdi@gmail.com"); 
     LinkedList<Redstaffs> redstaffs = new LinkedList<>();
     redstaffs.add(staff1);
     redstaffs.add(staff2);
     redstaffs.add(staff3);
     System.out.println(redstaffs);
    }   
}
