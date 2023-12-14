package com.jpa.springboot.Entity1;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="CRICKET_PLAYER")
public class Player {

	@Id
	@GeneratedValue
	private Integer id;
	private String playerName;
	private String playerAge;
	private String location;
}
