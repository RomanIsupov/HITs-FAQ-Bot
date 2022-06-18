package ru.romanisupov.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "question_with_answers")
@Getter
@Setter
public class QuestionWithAnswer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NonNull
	private String questionText;

	@NonNull
	private String answerText;

	@NonNull
	private String role;
}
