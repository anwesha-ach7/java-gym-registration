public class RegularMember extends GymMember{
    private final int attendanceLimit;
    private boolean iseligibleForUpgrade;
    private String removalReason;
    private String referralSource;
    private String plan;
    private int price;

    //Constructor of class RegularMember for inputing the values of GymMember 
    public RegularMember(int id,String name,String location,String phone, String email, String gender, String DOB, String membershipStartDate, String referralSource,double loyaltyPoints, boolean activeStatus){
        super(id,name,location,phone,email,gender,DOB,membershipStartDate,loyaltyPoints,activeStatus);
        this.attendanceLimit=30;
        this.iseligibleForUpgrade=false;
        this.removalReason="";
        this.plan="basic";
        this.price=6500;
        this.referralSource = referralSource;
    }

    /*Returns a formatted string representation of the RegularMember object
    Extends the string representation of the GymMember by adding subclass-specific details*/
    @Override
    public String toString() {
        return super.toString() +
        "\nPlan:                                 " + plan +
        "\nPrice:                               " + price +
        "\nReferral Source:              " + referralSource +
        "\nEligible for Upgrade:        " + iseligibleForUpgrade +
        (removalReason.isEmpty() ? "" : "\nRemoval Reason:           " + removalReason);
    }

    //Implementing getter methods
    public int getAttendanceLimit(){
        return this.attendanceLimit;
    }

    public boolean getIsEligibleForUpgrade(){
        return this.iseligibleForUpgrade;
    }

    public String getRemovalReason(){
        return this.removalReason;
    }

    public String getReferralSource(){
        return this.referralSource;
    }

    public String getPlan(){
        return this.plan;
    }

    public int getPrice(){
        return this.price;
    }

    //Implementing mark attendence (abstract from gym member)
    @Override
    public void markAttendance(){
        attendance++;
        loyaltyPoints +=5;
    }

    //Adding method for price variation
    public int getPlanPrice(String plan){
        switch(plan){
            case "basic" : 
                return 6500;
            case "standard" : 
                return 12500;
            case "deluxe": 
                return 18500;
            default: 
                return -1;
        }
    }

    // To upgrade about user's plan
    public String upgradePlan(String plan) {
        if (getAttendance() >= attendanceLimit) {
            iseligibleForUpgrade = true;
        } else {
            return "Not eligible for upgrade yet. Attendance is below the required limit.";
        }

        if (iseligibleForUpgrade) {
            System.out.println("Attempting to upgrade to plan: " + plan);
            int price = getPlanPrice(plan);
            System.out.println("Price returned: " + price);

            if (this.plan.equals(plan)) {
                return "Same plan as before has been selected.";
            }

            if (price == -1) {
                return "Invalid plan name.";
            }

            // Upgrading to new plan but only assigns if plan is valid and different
            this.plan = plan;
            this.price = price;
            return "Plan upgraded to " + plan + " and price updated to " + price + ".";
        }

        return "Not eligible for upgrade."; 
    }
    //Method for reverting member 
    public void revertRegularMember(String removalReason){
        super.resetMember();
        this.iseligibleForUpgrade = false;
        this.plan = "basic";
        this.price = 6500;
        this.removalReason = removalReason;
    }
    //Adding display method to print all attributes
    @Override
    public void display(){
        super.display();
        System.out.println("Plan: " + plan);
        System.out.println("Price: " + price);
        if(removalReason != null){
            System.out.println("Removal Reason: " + removalReason);
        }
    }
}

