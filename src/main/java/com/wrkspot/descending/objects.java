package com.wrkspot.descending;

public class objects {
    private int regNumber;
    private String Name;
    private int mobileNumber;
    private String Department;
    private String bloodGroup;
    private String fathersName;
    private String emailId;
    private String Address;
    private int Batch;
    private int Age;

    public int get_regNumber()
    {
        return regNumber;
    }
    public void set_regNumber(int regNumber)
    {
        this.regNumber=regNumber;
    }
    public String get_Name()
    {
        return Name;
    }
    public void set_Name(String Name)
    {
        this.Name=Name;
    }
    public int get_mobileNumber()
    {
        return mobileNumber;
    }
    public void set_mobileNumber(int mobileNumber)
    {
        this.mobileNumber = mobileNumber;
    }
    public String get_Department() {
        return Department;
    }
    public void set_Department(String Department) {
        this.Department = Department;
    }
    public String get_bloodGroup() {
        return bloodGroup;
    }
    public void set_bloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
    public String get_fathersName() {
        return fathersName;
    }
    public void set_fathersName(String fathersName) {
        this.fathersName = fathersName;
    }
    public String get_emailId() {
        return emailId;
    }
    public void set_emailId(String emailId) {
        this.emailId = emailId;
    }
    public String get_Address() {
        return Address;
    }
    public void set_Address(String address) {
        this.Address = address;
    }
    public int get_Batch() {
        return Batch;
    }
    public void set_Batch(int batch) {
        this.Batch = batch;
    }
    public int get_Age()
    {
        return Age;
    }
    public void set_Age(int age)
    {
        this.Age = age;
    }
    public void displayDetails()
    {
        System.out.print("\n");
        System.out.println("Name         - "+Name);
        System.out.println("RegNumber    - "+regNumber);
        System.out.println("MobileNumber - "+mobileNumber);
        System.out.println("Department   - "+Department);
        System.out.println("BloodGroup   - "+bloodGroup);
        System.out.println("FathersName  - "+fathersName);
        System.out.println("EmailId      - "+emailId);
        System.out.println("Address      - "+Address);
        System.out.println("Batch        - "+Batch);
        System.out.println("Age          - "+Age);
        System.out.print("\n");
    }
    public static void main(String[] args)
    {
        objects student_1=new objects();
        student_1.set_Name("Kevin");
        student_1.set_regNumber(101);
        student_1.set_mobileNumber(123);
        student_1.set_Department("Data Science");
        student_1.set_bloodGroup("O+");
        student_1.set_fathersName("Kennedy");
        student_1.set_emailId("kevinkennedy@gmail.com");
        student_1.set_Address("Pattukottai");
        student_1.set_Batch(1);
        student_1.set_Age(21);


        objects student_2=new objects();
        student_2.set_Name("Saran");
        student_2.set_regNumber(102);
        student_2.set_mobileNumber(1234);
        student_2.set_Department("ECE");
        student_2.set_bloodGroup("A+");
        student_2.set_fathersName("Periyannan");
        student_2.set_emailId("saranperiyannan@gmail.com");
        student_2.set_Address("Manaparai");
        student_2.set_Batch(2);
        student_2.set_Age(20);

        objects student_3=new objects();
        student_3.set_Name("Kavin");
        student_3.set_regNumber(103);
        student_3.set_mobileNumber(12345);
        student_3.set_Department("ECE");
        student_3.set_bloodGroup("B+");
        student_3.set_fathersName("Periyasamy");
        student_3.set_emailId("kavinperiyasamy46@gmail.com");
        student_3.set_Address("Namakkal");
        student_3.set_Batch(3);
        student_3.set_Age(20);

        objects student_4=new objects();
        student_4.set_Name("Kaviya");
        student_4.set_regNumber(104);
        student_4.set_mobileNumber(123456);
        student_4.set_Department("ECE");
        student_4.set_bloodGroup("B+");
        student_4.set_fathersName("Saravanan");
        student_4.set_emailId("kaviyasaravanan@gmail.com");
        student_4.set_Address("Sendhamangalam");
        student_4.set_Batch(4);
        student_4.set_Age(20);

        objects student_5=new objects();
        student_5.set_Name("Anamika");
        student_5.set_regNumber(105);
        student_5.set_mobileNumber(1234567);
        student_5.set_Department("ECE");
        student_5.set_bloodGroup("B+");
        student_5.set_fathersName("Vazhayil");
        student_5.set_emailId("anamikavazhayil@gmail.com");
        student_5.set_Address("Kerala");
        student_5.set_Batch(5);
        student_5.set_Age(21);


        System.out.println(student_1.get_Age());
        student_1.displayDetails();
        student_2.displayDetails();
        student_3.displayDetails();
        student_4.displayDetails();
        student_5.displayDetails();
    }
}
