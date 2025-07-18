package Pen;

import java.util.*;

public class Pen {
    
    String Brand;
    String Color;
    int Price;
    
    Pen(String Brand, String Color, int Price){
        this.Brand = Brand;
        this.Color = Color;
        this.Price = Price;
    }
    
    void ShowDetails() {
    	System.out.println();
    	System.out.println("------------------------");
    	System.out.println();
        System.out.println("Brand of the Pen : " + Brand);
        System.out.println("Color of the Pen : " + Color);
        System.out.println("Price of the Pen : " + Price);
        System.out.println();
        System.out.println("------------------------");
        System.out.println();
    }

}

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Pens : ");
        int N = sc.nextInt();
        sc.nextLine(); // consume leftover newline
        
        for(int i = 0; i < N; i++) {
            System.out.print("Enter the Brand of Pen : ");
            String Brand = sc.nextLine();
            
            System.out.print("Enter the Color of Pen : ");
            String Color = sc.nextLine();
            
            System.out.print("Enter the Price of Pen : ");
            int Price = sc.nextInt();
            sc.nextLine(); // consume leftover newline
            
            Pen pen = new Pen(Brand, Color, Price);
            pen.ShowDetails();
        }
        
        sc.close();
    }
}
