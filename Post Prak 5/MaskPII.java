public class MaskPII {
    private String maskEmail(String email) {
        String email2 = email.toLowerCase();
        int idx = email2.indexOf("@");
        StringBuilder sb = new StringBuilder(email2.length());
        sb.append(email2.charAt(0)); 
        sb.append("*****");
        sb.append(email2.substring(idx-1, email2.length()));
        return sb.toString();

    }

    private String maskPhoneNumber(String phoneNumber) {
        StringBuilder cleanNumber = new StringBuilder(phoneNumber.length());
        Character c; 
        for (int i=0;i<phoneNumber.length();i++){
            c = phoneNumber.charAt(i); 
            if (Character.isDigit(c)){
                cleanNumber.append(c); 
            }
        }

        StringBuilder result = new StringBuilder(17); 

        if (cleanNumber.length()>10){
            result.append("+"); 
            for (int j=0;j<cleanNumber.length()-10;j++){
                result.append("*"); 
            }
            result.append("-"); 
        }

        result.append("***-***-");
        result.append(cleanNumber.substring(cleanNumber.length()-4)); 
        return result.toString(); 
    }

    public String maskPII(String pii) {
        // dilakukan pengecekan String pii
        // jika pii merupakan email, panggil method maskEmail
        // jika pii merupakan phone number, panggil method maskPhoneNumber
        if (pii.indexOf("@") == -1){
            return maskPhoneNumber(pii);
        }
        else{
            return maskEmail(pii);
        }
    }
}
