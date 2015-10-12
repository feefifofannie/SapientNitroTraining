import java.util.List;

import com.sapient.models.Social;


public class Contact {
	private int id;
	private String email;
	private String firstName;
	private String lastName;
	private List<Social> accounts;
	
	public Contact(){
		
	}
	
	public Contact(String email, int id){
		this.email = email;
		this.id = id;
	}
	
	public int getID() {
		return id;
	}
	public void setID(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Social> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Social> accounts) {
		this.accounts = accounts;
	}
	
	
	
}
