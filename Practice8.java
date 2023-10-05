package Java.Practice;

class Employee {
    int salary;
    String Name;
    int id;

    public String GetName() {
        return Name;

    }

    public int Salary() {
        return salary;


    }

    public void SetName(String n) {
        Name = n;
    }

    public void PrintDetails() {
        System.out.println("The name of the customer after changing name is  " + Name);
        System.out.println("The salary of the cutomer is " + salary);
        System.out.println("The Id of the cutomer is " + id);
    }
}

    class CellPhone {
        public void Ringing() {
            System.out.println("Ringing.");
        }

        public void MakeCalls() {
            System.out.println("Calling Saqib...");
        }

        public void Vibrate() {
            System.out.println("Vibrating...");
        }
    }





public class Practice8 {

    public static void main(String[] args) {
        Employee Faizan = new Employee();
        /*These below code lines can be used to write and read the Names of the Objects which are going to be used in the Class
         Just attach the Name of the Object in Front of the Variable*/
//        This Object is used for Faizan.


        Faizan.Name = "Faizan_Zahoor";
        Faizan.salary = 50000;
        Faizan.id = 10102;
        System.out.println("The initial Name of the Object Faizan was " + Faizan.Name);
        String Name = Faizan.GetName();
        Faizan.SetName("Awsome_Faizan_Zahoor");
        Faizan.PrintDetails();


//        System.out.println("The name of the Object is " +Name);


//        Below Object is used for Hashim.


        Employee Hashim = new Employee();
        Hashim.Name = "Hashim_War";
        Hashim.id = 10103;
        Hashim.salary = 11000;
        Hashim.SetName("Cute_Hashim_War");
        Hashim.PrintDetails();


        CellPhone Veer = new CellPhone();
        Veer.Ringing();
        Veer.Vibrate();
        Veer.MakeCalls();


//        System.out.println(Faizan.Name);
//        System.out.println(Faizan.salary);


    }
  }


