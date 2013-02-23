package beans;

public class User {
	private String email = "";
	private String password = "";
	
	private String message = "";
	
	public String getMessage() {
		return message;
	}

	public User() {
		
	}
	
	public User(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String user) {
		this.email = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean validate() {
		
		if(!email.matches("\\w+@\\w+\\.\\w+")){
			message = "Invalid e-mail address";
			return false;
		}
		
		if(password.length() < 8){
			message = "Password too short!";
			return false;
		}else if(password.matches("\\w*\\s+\\w*")){
			message = "Password cannot consist of only spaces!";
			return false;
		}
		
		return true;
		
	}
	
}
