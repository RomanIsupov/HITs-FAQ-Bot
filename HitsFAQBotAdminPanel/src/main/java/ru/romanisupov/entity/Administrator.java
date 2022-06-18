package ru.romanisupov.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "administrators")
@Getter
@Setter
public class Administrator {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NonNull
	private String username;

	@NonNull
	private String password;
}
