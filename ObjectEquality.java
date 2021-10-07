public class ObjectEquality {
 public static void RelationalOperators() {
 System.out.println();
 System.out.println("RELATIONAL OPERATORS");
 System.out.println("====================");
 System.out.println();
 int m1 = 42;
 int m2 = 42;
 System.out.println(" Compare two built-in types : m1 == m2 = " + (m1
== m2)); // true
 System.out.println(" Compare two built-in types : m1 != m2 = " + (m1
!= m2)); // false
 System.out.println();
 Integer n1 = new Integer(42);
 Integer n2 = new Integer(42);
 System.out.println(" Compare two Integer objects : n1 == n2 = " + (n1
== n2)); // false
 System.out.println(" Compare two Integer objects : n1 != n2 = " + (n1
!= n2)); // true
 System.out.println();
 }
 
 public static void JavaClassLibraryObjects() {
 System.out.println();
 System.out.println("JAVA CLASS LIBRARY OBJECTS");
 System.out.println("==========================");
 System.out.println();
 Integer n1 = new Integer(42);
 Integer n2 = new Integer(42);
 System.out.println("Compare two Integer objects using equals method" + n1.equals(n2)); 
 System.out.println();
 }
 
 public static void NotOverrrideEqualsMethod() {
 System.out.println();
 System.out.println("DO NOT OVERRIDE THE EQUALS METHOD");
 System.out.println("=================================");
 System.out.println();
 EmpValue v1 = new EmpValue(120);
 EmpValue v2 = new EmpValue(120);
 System.out.println("Compare two EmpValue objects using default equals method" + v1.equals(v2));
 System.out.println();
 }
 
 public static void OverrideEqualsMethod() {
 System.out.println();
 System.out.println("OVERRIDE THE EQUALS METHOD");
 System.out.println("=================================");
 System.out.println();

 Employee emp1 = new Employee();
 Employee emp1c = (Employee)emp1;
 Employee emp2 = new Employee("John", "Doe");
 EmployeeFake emp2f = new EmployeeFake("John", "Doe");
 Employee emp3 = new Employee("Ron", "Miller");
 Employee emp4 = new Employee("Ron", "Miller");
 Employee emp5 = new Employee("Jane", "Doe");
 System.out.println(" Print out all objects");
 System.out.println(" ---------------------");
 System.out.println(" Employee (emp1) = " + emp1);
 System.out.println(" Employee (emp1c) = " + emp1c);
 System.out.println(" Employee (emp2) = " + emp2);
 System.out.println(" EmployeeFake (emp2f) = " + emp2f);
 System.out.println(" Employee (emp3) = " + emp3);
 System.out.println(" Employee (emp4) = " + emp4);
 System.out.println(" Employee (emp5) = " + emp5);
 System.out.println();

 System.out.println(" Comparison results");
 System.out.println(" ------------------");
 System.out.println(" Compare (emp1) to (emp1c) : " +
emp1.equals(emp1c)); // true
 System.out.println(" Compare (emp1) to (emp2) : " +
emp1.equals(emp2)); // true
 System.out.println(" Compare (emp2) to (emp1c) : " +
emp2.equals(emp1c)); // true
 System.out.println(" Compare (emp2) to (emp2f) : " +
emp2.equals(emp2f)); // false
 System.out.println(" Compare (emp3) to (emp4) : " +
emp3.equals(emp4)); // true
 System.out.println(" Compare (emp4) to (emp5) : " +
emp4.equals(emp5)); // false
 }

 public static void main(String[] args) {
 RelationalOperators();
 JavaClassLibraryObjects();
 NotOverrrideEqualsMethod();
 OverrideEqualsMethod();
 }
}
class EmpValue {
 int i;
 public EmpValue() {
 this.i = 0;
 }
 public EmpValue(int x) {
 this.i = x;
 }
}
class EmployeeFake {
 private String firstName = null;
 private String lastName = null;
 public EmployeeFake() {
 this.firstName = "John";
 this.lastName = "Doe";
 }
 public EmployeeFake(String fname, String lname) {
 this.firstName = fname;
 this.lastName = lname;
 }
 public String toString() {
 return (lastName + ", " + firstName);
 }
}
class Employee {
 private String firstName = null;
 private String lastName = null;
 public Employee() {
 this.firstName = "John";
 this.lastName = "Doe";
 }
 public Employee(String fname, String lname) {
 this.firstName = fname;
 this.lastName = lname;
 }
 public boolean equals(Object obj) {
 /* is obj reference this object being compared */
 if (obj == this) {
 return true;
 }
 /* is obj reference null */
 if (obj == null) {
 return false;
 }
 /* Make sure references are of same type */
 if (!(this.getClass() == obj.getClass())) {
 return false;
 } else {
 Employee tmp = (Employee)obj;
 if ( (tmp.firstName.equalsIgnoreCase(this.firstName))
 &&
 (tmp.lastName.equalsIgnoreCase(this.lastName)) ) {
 return true;
 } else {
 return false;
 }
 }
 }
 public String toString() {
 return (lastName + ", " + firstName);
 }
}