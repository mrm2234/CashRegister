/*****************************************
 *  mrm2234
 ****************************************/
 import java.io.BufferedReader;
 import java.io.IOException;
 import java.io.InputStreamReader;
 import java.nio.charset.StandardCharsets;
 import java.util.Collections;
 import java.util.Arrays;
 import java.util.ArrayList;
 import java.util.List;



 public class Register {
   /**
    * Iterate through each line of input.
    */
   public static void main(String[] args) throws IOException {
    calculateChange(80, 90.9);
   }
   public static void calculateChange(double purchasePrice, double cash) {
     if (purchasePrice == cash){
         System.out.print("ZERO");
     }
     if (cash < purchasePrice){
         System.out.print("ERROR");
     }
     else {
         ArrayList<Bill> ourBills = new ArrayList<Bill>();
         ourBills.add(new Bill(5000));
         ourBills.add(new Bill(2000));
         ourBills.add(new Bill(1000));
         ourBills.add(new Bill(500));
         ourBills.add(new Bill(200));
         ourBills.add(new Bill(100));
         ourBills.add(new Bill(50));
         ourBills.add(new Bill(20));
         ourBills.add(new Bill(10));
         ourBills.add(new Bill(5));
         ourBills.add(new Bill(2));
         ourBills.add(new Bill(1));
         double z = (cash-purchasePrice)*100;
         int a = (int) Math.round(z);
         ArrayList<Bill> theAnswer = new ArrayList<Bill>();
         for (int i = 0; i<ourBills.size();i++){
             int count = 0;
             while (a - (ourBills.get(i).getAmount()) >=0){
                 count++;
                 a -= (ourBills.get(i).getAmount());
             }
             if (count >0){
                 for (int j = 0; j<count; j++){
                     theAnswer.add(new Bill(ourBills.get(i).getAmount()));
                 }
             }
         }
         for (Bill w : theAnswer){
             System.out.print(w.toString());
         }
     }

   }

 }
