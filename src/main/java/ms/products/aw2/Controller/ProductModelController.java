package ms.products.aw2.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ms.products.aw2.Model.ProductModel;

@RestController
public class ProductModelController {

	@GetMapping("/ProductModelAll")
	public ProductModel GetProduct() {
		ProductModel productModel = new ProductModel(1, "Classic Vest");
		return productModel;

	}

}
