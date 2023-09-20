package service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import dto.UserDTO;
import model.User;
import repository.UserRepository;

public class UserServiceImpl implements UserService {
	
	@Autowired
	 private UserRepository userRepository;

	@Override
	public User addUser(UserDTO userDTO) {
		// TODO Auto-generated method stub
		User user = UserDTO.convertToEntity(userDTO);
				User savedUser= userRepository.save(user);
				
		return savedUser;
	}

	@Override
	public User getUser(Long id) {
		// TODO Auto-generated method stub
		Optional<User> optional =userRepository.findById(id);
		User result = optional.get();
		return result;
	}
	

	
	}
