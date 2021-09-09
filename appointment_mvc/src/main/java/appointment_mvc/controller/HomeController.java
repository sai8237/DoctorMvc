
  package appointment_mvc.controller;
  
  import org.springframework.context.annotation.Bean; import
  org.springframework.stereotype.Controller; import
  org.springframework.web.bind.annotation.GetMapping; import
  org.springframework.web.client.RestTemplate;
  
  @Controller public class HomeController {
  
  @Bean public RestTemplate create() { return new RestTemplate(); }
  
//  @GetMapping("/") public String home() { return "index"; }
  
  
  
  }
  
 