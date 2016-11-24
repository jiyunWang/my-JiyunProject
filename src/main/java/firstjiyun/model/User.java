package firstjiyun.model;

//들어온 모든 회원정보를 여기서 저장하겠다.
public class User {
	private String userId;
	private String password;
	private String name;
	private String email;

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() { //sysout으로 user를 찍게되면 자동적으로 이 메소드가 콜이 된다. 
		return "User [userId=" + userId + ", password=" + password + ", name=" + name + ", email=" + email + "]";
	}

	
}
