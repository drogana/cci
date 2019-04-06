/**
 *
 * @author Dragon
 */

public class cci_chapter1_ex1 {

    /**
     * This solution is for 1.1 CTCI;
     * It ill traverse the list once in the first loop, but
     * then a constantly smaller number of traversals as
     * one approaches the end of the list of chars (String).
     * 
     */
    
    //built a wrapper class for code re-use purposes.
    public static void runtest(String s){
        long startTime = System.nanoTime();
        String a = String.valueOf(cci_chapter1_ex1.IsUnique(s));
        System.out.print("Test produces:" + a + "\t");
        System.out.print("Time Spent: "+(((System.nanoTime()) - startTime)/1000)+" ms\n");
    }
    
    //built this wrapper class to allow String inputs.
    public static boolean IsUnique(String y){
        char[] tempchars = y.toCharArray();
        return (IsUnique(tempchars));
    }
    
    public static boolean IsUnique(char[] x){
    //shaved off a couple ms by not re-calculating x.length more than once.
        int len = x.length;
        for (int j = 0; j < len; j++){
            for (int t =(j+1); t < len; t++ ){
                if (x[j] == x[t]){
                    //If this return happens it breaks the loop == Best Case
                    return false;
                }   
            }
        }
    //If nothing else, return true.
    //Not sure if its O(n+log n) or O(n log n)
        return true;
    }
    
    //All the test-code I had to make (-.-)
    public static void main(String[] args) {
        String throwaway = "1234567890abcdefgh";
        String test = "something bardc";
        String test2 = "something bardic";
        String test3 = "abcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*()";
        String test4 = "something bardcc";
        
        //first test is a throw-away, speed results are in-accurate.
        System.out.print("Pre-test: \n");
        cci_chapter1_ex1.runtest(throwaway);
        
        System.out.print("\n" + "Tests: \n");
        cci_chapter1_ex1.runtest(test);
        cci_chapter1_ex1.runtest(test2);
        cci_chapter1_ex1.runtest(test3);
        cci_chapter1_ex1.runtest(test4);
        
/*               
        Test 1 produces:true	Time Spent: 22 ms
        Test 2 produces:false	Time Spent: 22 ms 
        Test 3 produces:true	Time Spent: 51 ms
        Test 4 produces:false	Time Spent: 20 ms
*/  

    }
    
}
