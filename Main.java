import java.util.Scanner;
/**
 *Checks to see if to arrays are the exact same
 * @author Jackson
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //scanner for input
    Scanner input = new Scanner(System.in);

    //create an array for the first set of numbers
    int[] nums1 = new int[5];

    //ask the user for the first set of numbers
    System.out.println("Please enter the values for the first array:");

    //get numbers from the user and store them in array 1
    for(int i = 0; i < nums1.length; i++){
      nums1[i] = input.nextInt();
    }

    //create an array for the second set of numbers
    int[] nums2 = new int[5];

    //ask the user for the second set of numbers
    System.out.println("Please enter the values for the second array:");

    //get numbers from the user and store them in array 2
    for(int i = 0; i < nums2.length; i++){
      nums2[i] = input.nextInt();
    }
    
    //create boolean to tell if they are the same or not
    boolean arrayEqual = false;
    
    //check to see if the arrays are the same
    for(int i = 0; i < nums1.length; i++){
        if(nums1[i] != nums2[i]){  
          arrayEqual = false;
          break;
        }else{
          arrayEqual = true;
        }  
    }
     if(arrayEqual == true){
        System.out.println("These arrays are the same");
    }else{
      System.out.println("These arrays are not the same");
    }
  }
}
