package d13array.arraylist_methotcreation;

public class MethodCreation01 {




    public static void main(String[] args) {

        //Create a method in Java: We can not create a method inside another method.

        /*
        However, If inside a method(ex: in main method), an inner class (nested class) can be defined.
        And inside this inner class we can create methods....
        But this local InnerClass, is accessible inside main method only. Can not be used outside main method..

        in Java; method is created outside of main method...

        AccessModifier + Static(optional) + returnType + methodName + () + {method body}

        Created method are called in main method which is named "Method Call"....

         */

        //Method Call:
      int result=  addition(13, 9); //will return total value of the numbers defined in parameters
        System.out.println(result);


    } //end of main method...




         //Example 1: Create a method to do addition.....
        public static int addition(int a, int b){

               return a + b; //return keyword gives the result back to where the method is called...

        }



}
