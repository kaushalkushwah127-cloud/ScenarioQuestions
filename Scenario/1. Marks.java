import java.util.*;
public class Marks {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        ArrayList <Integer> list = new ArrayList<>();
        for (int i=0; i<10; i++) list.add(sc.nextInt());
        System.out.print("Inserted Marks :");
        for (int i=0; i<10; i++) System.out.print(list.get(i)+" ");
        System.out.print("\nMarks at Even Index : ");
        for (int i=0; i<10; i+=2) System.out.print(list.get(i)+" ");
        System.out.print("\nEnter mark to Search : ");
        int y = sc.nextInt();
        if (list.contains(y)) System.out.print ("Element Found at Index : "+list.indexOf(y)+"\nEnter updated marks at index 3 ");
        else System.out.print("Mark not found \nEnter updated marks at index 3");
        int update=sc.nextInt();
        list.remove (3);
        list.add(3,update);
        System.out.print("Updated Marks :");
        for (int i=0; i<10; i++) System.out.print(list.get(i)+" ");
        list.remove(5);
        System.out.print("\nUpdated Marks after removing index 5 :");
        for (int i=0; i<list.size(); i++) System.out.print(list.get(i)+" ");
        System.out.print("\nTotal No. of Students are :"+list.size());
        System.out.print("\nHighest Marks :"+Collections.max(list)+"\nLowesr Marks :"+Collections.min(list));
    }
}
