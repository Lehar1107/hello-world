package deliveryBoy.DeliveryBoy.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import deliveryBoy.DeliveryBoy.service.KafkaService;

@RestController
@RequestMapping("/location")
public class LocationController {
@Autowired
	private KafkaService kafkaservice;
	
	@GetMapping("/update")
	public ResponseEntity<?> updateLocation(){
		
		for(int i=1;i<=200000;i++) {
		this.kafkaservice.updateLocation("("+Math.round(Math.random()*100)+","+Math.round(Math.random()*100)+""+ ")");
		}
		return new ResponseEntity<>(Map.of("message","Location Updated"),HttpStatus.OK);
	}
	
}
