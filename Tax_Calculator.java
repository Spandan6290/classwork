public class Tax_Calculator {
    public double calculate_tax(String empName, boolean isIndia, double empSal)throws Country_Valid, Employee_Name_Valid,Tax_Not_Eligible{
        double taxAmount = 0;
        if(isIndia==false){
            throw new Country_Valid("Sorry you are not indian");
        }
        else if (empSal>100000&&isIndia==true){
            taxAmount = empSal*8/100;
        }
        else if (empSal>50000&&empSal<100000&&isIndia==true) {
            taxAmount = empSal*6/100;
        }
        else if (empSal>30000&&empSal<50000&&isIndia==true) {
            taxAmount = empSal*5/100;
        }
        else if (empSal>10000&&empSal<30000&&isIndia==true) {
            taxAmount = empSal*4/100;
        }
        else if (empName==null||empName.isEmpty()) {
            throw new Employee_Name_Valid("Your name is not in the database");
        }
        else if(empSal<=10000) {
            throw new Tax_Not_Eligible("Your salary is not elegible for tax payment");
        }
        return taxAmount;
    }
}
