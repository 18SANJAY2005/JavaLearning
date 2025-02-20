package Scanner;

import java.util.Scanner;

public class Atm {

public static void main(String[] args) {
Amount(3000);

}
public static void Amount(int balance){
Scanner sc=new Scanner(System.in);
int money=sc.nextInt();
if (money%100==0 && balance>=money)
{System.out.println("transaction successful");

}else {
System.out.println("insufficient balance");
}
sc.close();

}}
