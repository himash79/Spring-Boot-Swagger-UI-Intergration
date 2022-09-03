package lk.himash.swagger.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MobileDto {

	private String id;

	private String brand;

	private String model;

	private String cost;

	private String status;
	
}
