public class Login {
    public static void main(String[] args) {
        String username = "admin";
        String password = "123";

        if(username.equals("admin") && password.equals("123")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Credentials");
        }
    }
}