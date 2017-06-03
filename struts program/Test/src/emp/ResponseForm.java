package emp;

import org.apache.struts.action.ActionForm;

public class ResponseForm extends ActionForm{
	
	
	
	
	private String email;
	
	public String getEmail() {
		System.out.println("aaaaaaaaaaaaaaaapppppppppp");
		return email;
		
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLeave() {
		return leave;
	}

	public void setLeave(String leave) {
		this.leave = leave;
	}

	private String leave;
	
	
	
	

}
