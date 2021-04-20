public class PAssign02 {
        public static void main(String[] args) {
            //I re-read the word document on the HINT part I realized my old one was incorrect
            Desk[] storage;
            storage = createDesklist();

            storage[0].Deskdata(5,43.50,true,"Birch","Tennessee");
            storage[1].Deskdata(8,29.20,false,"Mahogany","California");
            storage[2].Deskdata(100, 40.10, true,"Pine", "Florida");
            storage[3].Deskdata(0, 500, false, "Maple", "New York");
            storage[4].Deskdata(2,28.10,false,"Hi","Washington");
            printDesk(storage);
            System.out.printf("Total number of desks: %d",Desk.getNumberOfDesk());
                }
        
        public static Desk [] createDesklist() {
        	Desk[] list = new Desk[5];
        for(int i=0; i< list.length;i++) {
        	list[i] = new Desk();
        }
        return list;
        }
        static void printDesk(Desk[] printer) {
        	for(int i=0; i < printer.length; i++){
        		int j=i+1;
        		System.out.printf("Desk %d\n",j);
                System.out.println(printer[i].getInfo());
            	}
		}
}

    class Desk {
        // Implement your Desk class code here
        private int NumbDrawers = 4; // default is 4
        private double SurHeight = 27.0 ; // default is27
        private boolean Stand = false; // default is false(not standing)
        private String Material = "Pine"; //default is Pine
        private String Manfu = "North Carolina"; // default N.C
        private static int numberOfDesk = 0; //counter of desks
        
        
        
        
    	void Deskdata(){
    		numberOfDesk++;
    	}

        void Deskdata(int numbDrawers, double Height, boolean Stand, String Material, String Manfu){
            this.NumbDrawers= setDrawer(numbDrawers);
            this.SurHeight= setSur(Height);
            this.Stand=Stand;
            this.Material=setMat(Material);
            this.Manfu=setManfu(Manfu);
            numberOfDesk++;
        }
        
        public int getNumbDrawers(){return NumbDrawers;}
        private int setDrawer(int draw) {
           return NumbDrawers = ((8 >= draw) && (draw >=0)) ? draw : 4;
        }
	    public double getSurHeight(){return SurHeight; }    
       private double setSur(double height){
            return SurHeight = ((45 >= height) && (height >= 24)) ? height : 27;
        }
        public String getMaterial(){
            return Material;
        }
        private String setMat(String name){
           return Material = (3 >= name.length()) ? "Oak": name;
        }
        public String getManfu() {
            return Manfu;
        }
        private String setManfu(String name) {
          return  Manfu = (4 >= name.length()) ? "Iowa": name;
        }
        public static int getNumberOfDesk() {
            return numberOfDesk;
        }

        String getInfo(){
            return String.format("Desk Information\nNumber Drawers:\t%d\nSurface Height:\t%.2f inches\nStanding:\t\t%b\nMaterial:\t\t%s\nManufactured:\t\t%s\n",this.NumbDrawers,this.SurHeight, this.Stand, this.Material, this.Manfu);
        }
		


/*

Description
Modify the code from your original Desk class to create an improved version.

NOTE:  You will need to comment out your PAssign02 code if it is in the same package as PAssign02.  Otherwise, Java will give a syntax error due to duplicate class names.

Update the Desk class so that all data members have proper visibility as well as accessors(getter) and mutator(setter) methods.  Modify the rest of the class to use the accessors and mutator methods.  Additional requirements should be enforced in mutators:  desks can only have 0-8 drawers, otherwise they should be set to 4; surface height should be in the range of 24-45 inches, resetting to 27 inches if not; if the material being used is not at least 3 characters long, the material should reset to Oak; and if the manufacturing state is not at least 4 characters long, the state should reset to Iowa.

All methods and constructors should be given proper visibility.  You may add constructors, but they must update any static members as necessary.  Make sure there is a way to retrieve any static member values outside of the class.

Draw/sketch the UML diagram for the Desk class and then implement the class in Java.  Submit this UML diagram with your project. 

Write a test program that creates Desk objects with the stated values as specified in the output.  Collect those 5 Desk instances into an array and call the printDesks() method.  The printDesks() method should accept a Desk array as a parameter and prints out the result of each Desk’s getInfo() method as shown in the expected output.  The printDesks() method should work for any length Desk array.  Do not forget to print the total number of desks.

For Desks 3, 4, 5, make sure to trigger the error checking for number of drawers, surface height, and material, respectively.

HINT:  Create the Desk instances first, then use the shortcut initializer to create your array.  Do not attempt to use iteration when creating the array, only where appropriate afterwards.


Expected Output
Desk 1
Desk Information
Number Drawers:	5
Surface Height:	43.50 inches
Standing:		true
Material:		Birch
Manufactured:		Tennessee

Desk 2
Desk Information
Number Drawers:	8
Surface Height:	29.20 inches
Standing:		false
Material:		Mahogany
Manufactured:		California

Desk 3
Desk Information
Number Drawers:	4
Surface Height:	40.10 inches
Standing:		true
Material:		Pine
Manufactured:		Florida

Desk 4
Desk Information
Number Drawers:	0
Surface Height:	27.00 inches
Standing:		false
Material:		Maple
Manufactured:		New York

Desk 5
Desk Information
Number Drawers:	2
Surface Height:	28.10 inches
Standing:		false
Material:		Oak
Manufactured:		Washington

Total number of desks: 5

Code
To simplify submission into a single Java file, use the following template for your class:
public class PAssign02 {
	public static void main(String[] args) {
// Create your Desk instances here
	}
}

class Desk {
	// Implement your Desk class code here
}

*/



    }