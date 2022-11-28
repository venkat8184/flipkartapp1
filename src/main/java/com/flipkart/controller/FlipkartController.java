package com.flipkart.controller;

import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class FlipkartController {
@RequestMapping("/createViewPage")
public String createViewPage() {
	return "create_lead";
}

}
