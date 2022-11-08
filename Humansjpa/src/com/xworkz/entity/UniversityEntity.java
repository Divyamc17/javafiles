package com.xworkz.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="university")

public class UniversityEntity {
 
	@Id
	private int id;
	private String name;
	private int since;
	private String founder;
	private String place;
}
