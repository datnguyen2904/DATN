package com.dshop.datn.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="size")
public class Size {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long id;

	@Column
	private String value;

	@Column
	private int total;

	@Column
	private int sold;

	@ManyToOne()
	@JoinColumn(name="color_id")
	private Color color;
}
