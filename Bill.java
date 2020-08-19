/*****************************************
 *  mrm2234
 ****************************************/
 public class Bill implements Comparable<Bill>{
        private double amount;


        public Bill(double x){
            amount = x;
        }

        public double getAmount(){
            return amount;
        }

        public int compareTo(Bill a){
            if (amount == a.amount){
                return 0;
            }
            else if (amount > a.amount){
                return 1;
            }
            else {
                return -1;
            }
        }

        public String toString(){
            String firstName = "";
            if (amount == 5000 || amount == 50){
                firstName = "Fifty";
            }
            else if (amount == 2000 || amount == 20){
                firstName = "Twenty";
            }
            else if (amount == 1000 || amount == 10){
                firstName = "Ten";
            }
            else if (amount == 500 || amount == .5){
                firstName = "Five";
            }
            else if (amount == 200|| amount == 2){
                firstName = "Two";
            }
            else {
                firstName = "One";
            }
            String secondName = "";
            if (amount>100){
               secondName = "Pound";
            }
            else if (amount == 100){
                secondName = "Pounds";
            }
            else {
                secondName = "Pence";
            }
            return firstName + " " + secondName;
        }
    }
