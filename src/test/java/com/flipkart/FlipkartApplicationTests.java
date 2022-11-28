package com.flipkart;

import javax.persistence.GeneratedValue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.flipkart.entities.Flipkart;
import com.flipkart.repositories.FlipkartRepository;

@SpringBootTest
class FlipkartApplicationTests {
@Autowired
private FlipkartRepository flip;
	@Test
	public void saveOneFlip() {
		Flipkart f=new Flipkart();
		f.setName("venkat");
		f.setPassword("12345678");
		flip.save(f);
	}

}
