package Day4;

import java.lang.classfile.components.ClassPrinter.ListNode;

public class Program1 {
         public static void main(String[] args) {
			int[] arr = {1,3,4,7,1,2,6};
		}
         class ListNode {
        	    int val;
        	    ListNode next;

        	    ListNode(int val) {
        	        this.val = val;
        	    }
        	}

         
         public  ListNode check(ListNode head) {
        	      ListNode fast = head;
        	      ListNode slow = head;
        	      ListNode temp = null;
        		 
        	      while(fast!=null && fast.next!=null) {
        	    	  fast=fast.next.next;
        	    	  temp=slow;
        	    	  slow=slow.next;
        	      }
        	      temp.next = temp.next.next;
        	      return head;
        	 }
         }

