package com.ing.bank.dto;

import java.io.Serializable;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class LoginDTO implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	private String loginName;
	private String password;
	
}
