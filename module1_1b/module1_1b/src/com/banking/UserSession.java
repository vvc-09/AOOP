package com.banking;

public class UserSession {
	 private static UserSession instance;
	    private boolean loggedIn;
	    private String userName;

	    // Private constructor to prevent instantiation
	    private UserSession() {
	        this.loggedIn = false;
	        this.userName = "";
	    }

	    // Public method to provide access to the single instance
	    public static UserSession getInstance() {
	        if (instance == null) {
	            instance = new UserSession();
	        }
	        return instance;
	    }

	    // Method to log in the user
	    public void login(String userName) {
	        if (!loggedIn) {
	            this.userName = userName;
	            this.loggedIn = true;
	            System.out.println("User " + userName + " logged in.");
	        } else {
	            System.out.println("User " + this.userName + " is already logged in.");
	        }
	    }

	    // Method to log out the user
	    public void logout() {
	        if (loggedIn) {
	            System.out.println("User " + this.userName + " logged out.");
	            this.loggedIn = false;
	            this.userName = "";
	        } else {
	            System.out.println("No user is currently logged in.");
	        }
	    }

	    // Method to check if the user is logged in
	    public boolean isLoggedIn() {
	        return loggedIn;
	    }

	    // Method to get the current logged-in user's name
	    public String getUserName() {
	        return userName;
	    }
	    public static void main(String[] args) {
	        // Create an instance of BankingOperations with an initial balance
	        BankingOperations bankOps = new BankingOperations(1000.00);

	        // Get the UserSession instance and log in
	        UserSession session = UserSession.getInstance();
	        session.login("JohnDoe");

	        // Perform banking operations
	        bankOps.viewBalance();   // Should display balance
	        bankOps.deposit(500);    // Should add 500 to balance
	        bankOps.withdraw(300);   // Should subtract 300 from balance
	        bankOps.viewBalance();   // Should display updated balance

	        // Log out the user
	        session.logout();

	        // Attempt to perform operations after logout
	        bankOps.viewBalance();   // Should prompt user to log in
	    }
}
