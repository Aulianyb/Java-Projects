public class MaskPiiss {
    public String maskPhoneNumber_alt(String phoneNumber) {
        StringBuilder cleanPhoneNumber = new StringBuilder();
        for(int i=0;i<phoneNumber.length();i++) {
            char currDigit = phoneNumber.charAt(i);
            if(Character.isDigit(currDigit)) cleanPhoneNumber.append(currDigit);
        }

        StringBuilder maskedPhoneNumber = new StringBuilder();

        int phoneNumberLen = cleanPhoneNumber.length();

        if(phoneNumberLen > 10) maskedPhoneNumber.append('+');
        for(int i=0;i<phoneNumberLen-10;i++) maskedPhoneNumber.append("*");
        if(phoneNumberLen > 10) maskedPhoneNumber.append('-');
        maskedPhoneNumber.append("***-***-");
        maskedPhoneNumber.append(cleanPhoneNumber.substring(phoneNumberLen-4));

        return maskedPhoneNumber.toString();
    }
}
