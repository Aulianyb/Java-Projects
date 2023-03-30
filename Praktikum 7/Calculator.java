public class Calculator {
    public Calculator() {
    };

    public double calculate(double a, double b, String operation) throws Exception{
        /**
         * Implementasi
         * Apabila operasi yang diinput pengguna bukan `+`, `-`, `*`, atau `/`, maka
         * kalkulator akan mengembalikan pesan error dari kelas
         * InvalidOperationException.java
         * 
         * Apabila kalkulator menerima input pembagian terhadap 0, maka kalkulator juag
         * akan mengembalikan pesan error dari kelas InvalidDivisionByZero.java
         */ 

        if (!(operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/"))){
            throw new InvalidOperationException(operation);  
        }
        else{
            if (b==0&&operation.equals("/")){
                throw new InvalidDivisionByZero(); 
            }
            else{
                if (operation == "+"){
                    return a + b; 
                }
                else if (operation == "-"){
                    return a-b; 
                }
                else if (operation == "*"){
                    return a*b; 
                }
                else{
                    return a / b; 
                }
            }
        }
    }
}

class InvalidOperationException extends Exception {
    private String operation;

    public InvalidOperationException(String operation) {
        // Implementasi InvalidOperationException
        this.operation = operation;
    }

    public String getMessage() {
        // Implementasi custom message InvalidOperationException
        // Format: "Invalid operation: " + operation
        return "Invalid operation: " + operation; 
    }
}

class InvalidDivisionByZero extends Exception {
    public InvalidDivisionByZero() {
        // Implementasi InvalidDivisionByZero
    }
    
    public String getMessage(){
        return "Tidak dapat melakukan pembagian terhadap 0."; 
    }
}