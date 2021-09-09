package appointment_mvc.controller;
import appointment_mvc.entity.DoctorEntity;
import appointment_mvc.model.*;
import ch.qos.logback.core.net.SyslogOutputStream;
import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@Controller
@RequestMapping("/")
public class DoctorController {
	
	static final String DOCTOR_MS_URL="http://localhost:8085/";

	@Autowired
	private RestTemplate restTemplate;
	
	
	
	@GetMapping("/")
	public String HomeLogin()
	{
		return "doctorForm";
	}
	
	
	@GetMapping("/doctor/processlogin")
	public String loginProcess(Model model)
	{	
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String name = auth.getName();
		Doctor doctor=restTemplate.getForObject(DOCTOR_MS_URL+"doctor/"+name,Doctor.class, HttpMethod.GET);
		if(doctor != null)
		{
			List<Appointment> list = restTemplate.getForObject(DOCTOR_MS_URL+"appointment/doctor/"+doctor.getName(),List.class, HttpMethod.GET);
			System.out.println(list);
			System.out.println(doctor);
			model.addAttribute("name", doctor.getName());
			model.addAttribute("list", list);
			return "welcomeDoctor";
			
		}else{
				return "doctorForm";
		}
	}
	

	@GetMapping("/doctor/register")
	public String RegisterForm()
	{
		return "doctorRegistrationForm";
	}
	
	@PostMapping("/doctor/processregister")
	public  String registerDoctor(@ModelAttribute("Doctor") Doctor doctor){
		String postForObject = restTemplate.postForObject(DOCTOR_MS_URL+"doctor/add",doctor, String.class);
		System.out.println(postForObject);
		return "doctorForm";
	}
	
	@GetMapping("/doctor/treating/{bookId}")
	public String treatingProcess(@PathVariable("bookId") int bookId,Model model)
	{	
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		DoctorEntity name = (DoctorEntity) auth.getPrincipal();
		Appointment appointment = restTemplate.getForObject(DOCTOR_MS_URL+"appointment/"+bookId,Appointment.class);
		if(!appointment.getDoctorName().equals(name.getName())) {
			return "unauthorized";
		}
		String postForObject = restTemplate.getForObject(DOCTOR_MS_URL+"appointment/treatAppointment/"+bookId, String.class);
		List<Appointment> list = restTemplate.getForObject(DOCTOR_MS_URL+"appointment/doctor/"+appointment.getDoctorName(),List.class, HttpMethod.GET);
		System.out.println(list);
		model.addAttribute("name", appointment.getDoctorName());
		model.addAttribute("list", list);
		 return "welcomeDoctor";
	}
	
	
//	@PostMapping("/responeding")
//	public void responding(@ModelAttribute("appointment") Appointment appointment)
//	{
//		Long bookId = appointment.getBookId();
//		String postForObject = restTemplate.postForObject(DOCTOR_MS_URL+"appointment/respondAppointment/"+bookId,HttpMethod.GET, String.class);
//		System.out.println(postForObject);
//		
//	}
	
	
}
