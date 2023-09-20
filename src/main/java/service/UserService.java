package service;

import dto.UserDTO;
import model.User;

public interface UserService {

	public User addUser(UserDTO userDTO);
	
	public User getUser(Long id);
}
