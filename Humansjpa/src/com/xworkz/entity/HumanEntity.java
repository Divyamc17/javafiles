package com.xworkz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "human")
public class HumanEntity {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "color")
	private String color;
	@Column(name = "gender")
	private String gender;
	@Column(name = "weight")
	private double weight;
	@Column(name = "height")
	private double height;
	@Column(name = "eyecolor")
	private String eyecolor;
	@Column(name = "haircolor")
	private String haircolor;
	@Column(name = "age")
	private int age;
	@Column(name = "marrigestatus")
	private boolean marrigestatus;
	@Column(name = "temparature")
	private double temparature;
	@Column(name = "alive")
	private boolean alive;
	@Column(name = "panCard")
	private String panCardNo;
	@Column(name = "aadharcard")
	private long aadharcardNo;
	@Column(name = "voterid")
	private String voterid;

}
