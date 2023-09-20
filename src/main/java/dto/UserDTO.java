package dto;

import model.User;

public class UserDTO {

	private Long id;
	private String userName;
	private String name;
	private String email;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", userName=" + userName + ", name=" + name + ", email=" + email + "]";
	}
	
	public static User convertToEntity(UserDTO userDTO) {
		User newUser = new User();
		newUser.setId(userDTO.getId());
		newUser.setEmail(userDTO.getEmail());
		newUser.setName(userDTO.getName());
		newUser.setUsername(userDTO.getUserName());
		return newUser;
		
	}
}
