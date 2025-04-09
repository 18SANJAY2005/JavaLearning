package ArraysListProblems;

import java.util.ArrayList;

public class OrderDriver {
	public static void main(String[] args) {
      ArrayList<Order> or = new ArrayList<Order>();
      ArrayList<Order> list = new ArrayList<Order>();
      or.add(new Order(101,"ABC",100.00));
      or.add(new Order(102,"DEF",650.00));
      or.add(new Order(103,"GHI",200.00));
      or.add(new Order(104,"JKL",900.00));
      System.out.println("Before Remove");
      System.out.println(or);
      int keyAmount =500;
    
      for(Order s1:or) {
    	  if(keyAmount>s1.totalAmount) {
    		 list.add(s1);
    		 
    		 
    	  }
      }
      or.removeAll( list);
      System.out.println("After Remove");
      System.out.println(or);
}}
