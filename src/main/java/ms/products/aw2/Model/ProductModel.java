package ms.products.aw2.Model;

import java.util.Date;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
//@Entity
//@Table(name="Product",schema = "Production")
public class ProductModel {
	
	private int ProductModelID;
	private String	Name;
	private String CatalogDescription;
	private String Instructions;
	
	@JsonIgnore  
    public UUID rowguid;
	
	public Date ModifiedDate;

	public ProductModel(int productModelID, String name) {
		super();
		ProductModelID = productModelID;
		Name = name;
	}
	
		
	
	
}
