package lk.himash.swagger.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "mobiles")
public class Mobile implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@ApiModelProperty(value = "Mobile Device No/ID")
	@Column(name = "Mobile_Id")
	private String id;
	
	@ApiModelProperty(value = "Mobile Device Brand")
	@Column(name = "Mobile_Brand")
	private String brand;
	
	@ApiModelProperty(value = "Mobile Device Model")
	@Column(name = "Mobile_Model")
	private String model;
	
	@ApiModelProperty(value = "Mobile Device Cost")
	@Column(name = "Mobile_Cost")
	private String cost;
	
	@ApiModelProperty(value = "Mobile Device Availability")
	@Column(name = "Mobile_Status")
	private String status;
	
}
