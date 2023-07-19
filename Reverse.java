package Simple_reverse;
import java.util.*;
public class Reverse {

	public static void main(String[] args) {
			    Scanner sc = new Scanner(System.in);
			    System.out.println("Enter the string:");
		        String s = sc.next();
		        String rev = "";
		        for(int i = 0;i<s.length();i++){
		            rev = s.charAt(i)+rev;
		        }
		        System.out.println(rev);
			}
		}
	
