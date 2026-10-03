import java.util.*;
public class WasteCollection3b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the weight of waste collected in kgs");
        double waste=sc.nextDouble();
        if(waste>100){
            System.out.println("Collection Target Achieved");
        }
        else{
            System.out.println("More Waste Collection Required");
        }
        
    }
}
