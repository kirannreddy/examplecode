import java.util.*;
class P1{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the character");
        char c = sc.next().charAt(0);
        switch(c){
            case 'A':
            System.out.println("Action movie fan \n");
            break;
            case 'a':
            System.out.println("Action movie fan \n");
            break;
            case 'C':
            System.out.println("Comedy movie fan \n");
            break;
            case 'c':
            System.out.println("Comedy movie fan \n");
            break;
            case 'D':
            System.out.println("Drama movie fan \n");
            break;
            case 'd':
            System.out.println("Drama movie fan \n");
            break;
            default:
            System.out.println("Invalid choice \n");
        }
    }
}
        