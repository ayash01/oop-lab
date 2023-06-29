import java.util.Scanner;

class authException extends Exception {
    public authException(String message){
        super(message);
    }
}

class User {
    private final String username, password;

    public User(String username, String password){
        this.username = username;
        this.password = password;
        System.out.println("Account created successfully");
    }

    private boolean isValidUser(String username, String password) {
        return (this.username.equals(username) && this.password.equals(password));
    }

    public void Login(String username, String password) throws authException {
        if (!isValidUser(username, password))
            throw new authException("Invalid username or password");
        else
            System.out.println("Logged-in successfully");
    }
}

class authenticationDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter new username: ");
        String username = input.next();
        System.out.print("Enter new password: ");
        String password = input.next();

        User user = new User(username,password);

        System.out.print("Enter username: ");
        username = input.next();
        System.out.print("Enter password: ");
        password = input.next();

        try {
            user.Login(username, password);
        }
        catch(authException authFail) {
            System.out.println(authFail.getMessage());
        }
        catch(Exception exception) {
            System.out.println(exception);
        }
        finally {
            input.close();
        }
    }
}