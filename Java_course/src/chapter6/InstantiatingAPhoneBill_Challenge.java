package chapter6;
//Challenge5_contd
//Instantiating a phone bill and printing it.
public class InstantiatingAPhoneBill_Challenge {
    public static void main(String args[]){
        PhoneBillGenerator_Challenge yourPhoneBill= new PhoneBillGenerator_Challenge(1,100,100,120);
        yourPhoneBill.calculateOverage();
        yourPhoneBill.calculateTax();
        yourPhoneBill.calculateTotalBill();
        yourPhoneBill.printItemizedBill();

    }
}
