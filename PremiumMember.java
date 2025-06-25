public class PremiumMember extends GymMember{
    private final double premiumCharge;
    private String personalTrainer;
    private boolean isFullPayment;
    private double paidAmount;
    private double discountAmount;
    //Constructor of the class
    public PremiumMember(int id, String name, String location, String phone, String email, String gender, String DOB, String membershipStartDate, String personalTrainer,double loyaltyPoints, boolean activeStatus){
        super(id, name, location, phone, email, gender, DOB, membershipStartDate,loyaltyPoints,activeStatus);
        this.premiumCharge=50000.0;
        this.personalTrainer = personalTrainer;
        this.isFullPayment = false;
        this.paidAmount = 0.0;
        this.discountAmount = 0.0;
    }

    @Override
    public String toString() {
        double remainingAmount = premiumCharge - paidAmount;

        return super.toString() +
        "\nPersonal Trainer:              " + personalTrainer +
        "\nPaid Amount:                    " + paidAmount +
        "\nFull Payment:                    " + isFullPayment +
        "\nRemaining Amount:          " + remainingAmount +
        (isFullPayment ? "\nDiscount Amount:                " + discountAmount : "");
    }

    //Implementing Getter method for all 
    public double getPremiumCharge(){
        return this.premiumCharge;
    }

    public String getPersonalTrainer(){
        return this.personalTrainer;
    }

    public boolean getIsFullPayment(){
        return this.isFullPayment;
    }

    public double getPaidAmount(){
        return this.paidAmount;
    }

    public double getDiscountAmount(){
        return this.discountAmount;
    }

    //Adding method to pay the due amount
    public String payDueAmount(double paidAmount){
        if(isFullPayment==true){
            return "Payment already completed. No further payment is necessary.";
        }
        if(this.paidAmount+paidAmount>premiumCharge){
            return "Error! Exceeds the limit";
        }
        this.paidAmount = this.paidAmount + paidAmount;
        double remainingAmount = premiumCharge - this.paidAmount;
        if(this.paidAmount==premiumCharge){
            isFullPayment = true;
            return "Your payment has been recorded. Thank you.";
        }
        return "Payment recorded successfully. Remaining amount to be paid: " + remainingAmount;
    }

    //Calculating discount is the payment is full 
    public String calculateDiscount(){
        if(isFullPayment==true){
            discountAmount = 0.1 * premiumCharge;

            return"The discount amount is " +discountAmount;
        }
        else{
            discountAmount = 0.0;
            return"No discount is available for now.";
        }

    }
    // Revert Premium Member
    public void revertPremiumMember(String removalReason){
        super.resetMember();
        this.personalTrainer = "";
        this.isFullPayment = false;
        this.paidAmount = 0.0;
        this.discountAmount = 0.0;
    }
    //Implementing mark attendence (abstract from gym member)
    @Override
    public void markAttendance(){
        attendance++;
        loyaltyPoints +=10;
        System.out.println("Attendance marked for Premium Member: " + getName());
    }
    //Adding display method to print all attributes
    @Override
    public void display(){
        super.display();
        System.out.println("Personal trainer: " + personalTrainer);
        System.out.println("Paid amount: " + paidAmount);
        System.out.println("Full payment status: " + isFullPayment);
        double remainingAmount = premiumCharge - paidAmount;
        System.out.println("Remaining amount to get paid is " + remainingAmount);
        if (isFullPayment==true) {
            System.out.println("Discount amount: " + discountAmount);
        }

    }
}