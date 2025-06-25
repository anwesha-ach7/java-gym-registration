public abstract class GymMember{
    protected int id;
    protected String name;
    protected String location;
    protected String phone;
    protected String email;
    protected String gender;
    protected String DOB;
    protected String membershipStartDate;
    protected int attendance;
    protected double loyaltyPoints;
    protected boolean activeStatus;

    //Creating constructor to ask and asign values 
    public GymMember(int id,String name, String location,String phone, String email, String gender, String DOB, String membershipStartDate,double loyaltyPoints,boolean activeStatus){
        //using this keyword to differentiate between instance variable and constructor parameters(values)
        this.id= id;        
        this.name=name;
        this.location=location;
        this.phone=phone;
        this.email=email;
        this.gender=gender;
        this.DOB=DOB;
        this.membershipStartDate=membershipStartDate;
        this.attendance=0;
        this.loyaltyPoints=0.0;
        this.activeStatus=false;
    }
    //Returns a formatted string representation of the GymMember object
    @Override
    public String toString() {
        return "ID:                                     " + id +
        "\nName:                               " + name +
        "\nLocation:                           " + location +
        "\nPhone:                              " + phone +
        "\nEmail:                               " + email +
        "\nGender:                             " + gender +
        "\nDOB:                                " + DOB +
        "\nMembership Start Date:   " + membershipStartDate +
        "\nLoyalty Points:                  " + loyaltyPoints +
        "\nActive Status:                   " + (activeStatus ? "Active" : "Inactive");
    }

    // Getters for assigning values and all
    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getLocation(){
        return this.location;
    }

    public String getPhone(){
        return this.phone;
    }

    public String getEmail(){
        return this.email;
    }

    public String getDob(){
        return this.DOB;
    }

    public String getMembershipStartDate(){
        return this.membershipStartDate;
    }

    public int getAttendance(){
        return this.attendance;
    }

    public double getloyaltyPoints(){
        return this.loyaltyPoints;
    }

    public boolean getActiveStatus(){
        return this.activeStatus;
    }

    //Creating an abstract method called markattendance
    public abstract void markAttendance();

    //Adding method that sets active status to true
    public void activateMembership(){
        activeStatus=true;
    }

    //Adding a method to deactivate membership (only if it is already active)
    public void deactivateMembership(){
        if(activeStatus){
            activeStatus=false;
        }
    }

    //Adding a method to reset data of the member 
    public void resetMember(){
        activeStatus=false;
        attendance = 0;
        loyaltyPoints=0.0;
    }

    //Adding display method to print all attributes
    public void display(){
        System.out.println("ID:" +id );
        System.out.println("Name:" +name);
        System.out.println("Location:" +location);
        System.out.println("Phone: " +phone);
        System.out.println("Email:" +email);
        System.out.println("Gender:" +gender);
        System.out.println("DOB:" +DOB);
        System.out.println("Membership Start Date:" +membershipStartDate);
        System.out.println("Attendance:"+attendance);
        System.out.println("Loyalty Points:" +loyaltyPoints);
        System.out.println("Active Status" +activeStatus);

    }

}