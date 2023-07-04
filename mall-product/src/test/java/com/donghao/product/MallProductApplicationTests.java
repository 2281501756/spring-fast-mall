package com.donghao.product;

import com.donghao.product.entity.BrandEntity;
import com.donghao.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MallProductApplicationTests {

	@Autowired
	private BrandService brandService;

	@Test
	void contextLoads() {
		BrandEntity b = new BrandEntity();
		b.setName("手机");
		b.setDescript("修饰");
		boolean save = brandService.save(b);
		if(save) {
			System.out.println("保存");
		}

	}

}
