package pt.amane.movieflix.dtos;

import java.io.Serializable;

import pt.amane.movieflix.entities.User;

public class UserDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long Id;
	private String name;
	private String email;
	private String password;

	public UserDTO() {
	}

	public UserDTO(Long id, String name, String email, String password) {
		super();
		Id = id;
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public UserDTO(User user) {
		super();
		Id = user.getId();
		name = user.getName();
		email = user.getEmail();
		password = user.getPassword();
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
