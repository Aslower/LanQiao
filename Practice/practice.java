import java.util.Scanner;

public class practice {
    public static void main(String[] args) {

        System.out.println("Scanner:System.in");
        Scanner sc = new Scanner(System.in);

        // if (sc.hasNextLine()) {
        //     String str = sc.nextLine();
        //     System.out.println("hhh: "+str);
        // }
        
        //The following also works
        // String st=sc.nextLine();
        // System.out.println("h:"+st);

        int sum=0;        
        while(sc.hasNextInt()){
            int i=sc.nextInt();
            sum+=i;
        }
        sc.close();
        System.out.println("sum:"+sum);
    }

}