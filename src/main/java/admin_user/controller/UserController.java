package admin_user.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import admin_user.dto.UserDto;
import admin_user.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserDetailsService userDetailsService;
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping("/registration")
	public String getRegistrationPage(@ModelAttribute("user") UserDto userDto) {
		return "register";
	}
	
	@PostMapping("/registration")
	public String saveUser(@ModelAttribute("user") UserDto userDto, Model model) {
		userService.save(userDto);
		model.addAttribute("message", "Registered Successfuly! & Now Login");
		return "login";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/home")
	public String home() {
		return "index";
	}
	
	@GetMapping("/")
	public String index() {
		return "land";
	}
	
	@GetMapping("/about")
	public String about() {
		return "about";
	}
	
	@GetMapping("/menu")
	public String menu() {
		return "menu";
	}
	
	@GetMapping("/service")
	public String service() {
		return "service";
	}
	
	@GetMapping("/404")
	public String restaurent() {
		return "404";
	}
	
	@GetMapping("/grid")
	public String grid() {
		return "grid";
	}
	
	@GetMapping("/buttons")
	public String buttons() {
		return "buttons";
	}
	
	@GetMapping("/checkout")
	public String checkout() {
		return "checkout";
	}

	@GetMapping("/restaurant6")
	public String restaurant6() {
		return "restaurant6";
	}

	@GetMapping("/restaurant2")
	public String restaurant2() {
		return "restaurant2";
	}
	
	@GetMapping("/restaurant3")
	public String restaurant3() {
		return "restaurant3";
	}

	@GetMapping("/restaurant5")
	public String restaurant5() {
		return "restaurant5";
	}

	@GetMapping("/restaurant1")
	public String restaurant1() {
		return "restaurant1";
	}

	@GetMapping("/transaction")
	public String transaction() {
		return "transaction";
	}
	
	@GetMapping("/restaurant4")
	public String restaurant4() {
		return "restaurant4";
	}

	@GetMapping("/cart")
	public String cart() {
		return "cart";
	}

	@GetMapping("/check")
	public String check() {
		return "check";
	}
	
	@GetMapping("/event")
	public String event() {
		return "event";
	}
	
	
//	
//	@GetMapping("/about")
//	public String about() {
//		return "about";
//	}
//	
//	@GetMapping("/about")
//	public String about() {
//		return "about";
//	}
	
	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}
	
	
	@GetMapping("user-page")
	public String userPage (Model model, Principal principal) {
		UserDetails userDetails = userDetailsService.loadUserByUsername(principal.getName());
		model.addAttribute("user", userDetails);
		return "index";
	}
	
	@GetMapping("admin-page")
	public String adminPage (Model model, Principal principal) {
		UserDetails userDetails = userDetailsService.loadUserByUsername(principal.getName());
		model.addAttribute("user", userDetails);
		return "admin";
	}

}
