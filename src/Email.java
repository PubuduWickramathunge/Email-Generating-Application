import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private static final String COMPANY = "isa";
    private String password;
    private String alternateEmail;
    private int defaultPasswordLength = 10;
    private String email;


    // constructor to receive first name and last name

    public Email(String firstName, String lastName){

        this.firstName = firstName;
        this.lastName = lastName;
        //System.out.println("Email created: " + this.firstName + " " + this.lastName);

        this.department = setDepartment();
        //System.out.println("Department: "+ this.department);

        this.password = randomPassword(defaultPasswordLength);
        //System.out.println("your default password: "+this.password);

        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + COMPANY + ".com";
        //System.out.println("Your email: " + email);

    }

    // Ask for the department
    private String setDepartment(){
        System.out.print("Department Codes:\n\t1 for Sales\n\t2 for Development\n\t3 for Accounting\n\t0 for none\n\nEnter Your Department Code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1 ){
            return "sal";
        } else if (depChoice == 2) {
            return "dev";

        } else if (depChoice == 3) {
            return "acc";

        }else return "";
    }

    //Generating random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%&*";
        char[] password = new char[length];
        for (int i=0; i<length; i++ ){
            int rand = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt((rand));
        }
        return new String(password);
    }



    // Alternative email

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    // Change password

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo(){
        return "\n\nName: " + firstName + " " + lastName + "\n" +
                "Company Email: " + email + "\n" +
                "password: " + password + "\n" ;

    }
}
