package P3A;

/**
 * ************************************************************
 * Purpose/Description: <The program seaches for the number and returns 
 * the index that it is at>
 * Author’s Panther ID: Certification: I hereby certify that this work
 * is my own and none of it is the work of any other person.
 * ************************************************************
 */
public class Search {
/**
 * terSearch is looking for the index position of the number you are looking for 
 * in the array
 * @param A the array
 * @param l the position of the number
 * @param r the length of array
 * @param x the number you are searching for
 * @return either -1 or the index number
 */
    public static int terSearch(int A[], int l, int r, int x) {

        if (r >= l) { // if length is greater or equal to position of number
            int d1 = l + (r - l) / 3; // terSearch function
            int d2 = d1 + (r - l) / 3; // terSearch function
            
            if (A[d1] == x) { // base case for d1
                return d1;
            } else if (A[d2] == x) { // base case for d2
                return d2;
            } else if (A[d1] > x) { // if d1 index is greater
                return terSearch(A, l, d1 - 1, x);
            } else if (A[d2] < x) { // if d2 index is less
                return terSearch(A, d2 + 1, r, x);
            } else { // if nothing applies then return the following
                return terSearch(A, d1 + 1, d2 - 1, x);
            }
        }

        return -1; // the number isn't in the array
    }
/**
 * print method will print string sentences for the index number it goes into
 * @param x number we are looking for
 * @param ind index position
 * @param A array
 */
    static void print(int x, int ind, int[] A) {
        int length = A.length;

        if (ind == -1) { // if equal to -1 then pring the following
            System.out.print("The number " + x + " doesn't exist in the array: {");
            for (int i = 0; i < A.length - 1; ++i) { // prints array list
                System.out.print(A[i] + ",");
            }
            System.out.println(A[length - 1] + "}");
        }

        if (ind != -1) {// if not equal to -1 then pring the following
            System.out.print("The number " + x + " is in index: " + ind + " {");
            for (int i = 0; i < A.length - 1; ++i) { // prints array list
                System.out.print(A[i] + ",");
            }
            System.out.println(A[length - 1] + "}");
        }
    }
/**
 * The main method will allow for the program to come together and call the
 * needed functions
 * @param args 
 */
    public static void main(String[] args) {
        
        //TEST
        int[] arr = {2, 3, 5, 6, 8, 9, 12, 13, 14};  // array
        int a = terSearch(arr, 0, arr.length-1, 2); // calls the method
        int b = terSearch(arr, 4, arr.length-1, 8);
        int c = terSearch(arr, 1, arr.length-1, 3);
        int d = terSearch(arr, 8, arr.length-1, 14);
        int e = terSearch(arr, 9, arr.length-1, 17);
        print(2, a, arr); // prints
        print(8, b, arr);
        print(3, c, arr);
        print(14, d, arr);
        print(17, e, arr);

    }

}
