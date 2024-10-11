package d13array.arraylist_methotcreation;

public class MethodCreation02 {



    public static void main(String[] args) {

        //method call for exmp 1:
       int result = multiplication(4, 2, 5);
        System.out.println(result);

        //method call for exmp 2:
       int r = addAndProduct(6, 11, 25);
        System.out.println(r);

        //method call for exmp 3:
                printText("Hello Java!");
    }


                //Example 1: Create a method to multiply 3 numbers....
                private static int multiplication(int x, int y, int z){


                        int mult = x*y*z;
                       return mult;
                }

                    //Example 2: Create a method with 3 parameter:
                    // multiply first two parameters and add 3rd parameter to the multiplication
                        private static int addAndProduct(int j, int k, int l){

                         int container = j*k+l;
                        return container;
                        }

                        //Example 3: Create a method to print entered text
                            public static void printText(String str){

                                System.out.println(str);
                                //if a method does not create a new data, return type will be "void"
                                //which means dont use return keyword in body
                                //and dont declare any data type in method declaration as return type
                                //argument (data comes through parameter) is taken and just printed....
                            }





}



/*
ACCESS MODIFIERS IN JAVA: i) Public ii) Protected iii)Default iv)Private

1) Public: Everyone can use. No restriction. Accessible from anywhere in project

2) Protected: Provides access to specific groups and subgroup of those groups
                Accessible within its own package
                And accessible from outside the package but only through the inheritance...
      => a subclass is located in a different package can access the protected members of its superclass

3) Default: Allows class members to be accessible within their own package.
            Less restrictive than private, but more restrictive than  protected and public

4) Private: Provide access only to the class members in which methods are created....

 */

















