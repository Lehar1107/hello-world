package consumer.enduser.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import consumer.enduser.AppConstants;

@Configuration
public class KafkaConfig {

	@KafkaListener(topics=AppConstants.LOCATION_UPDATE_TOPIC,groupId="AppCosntants.GROUP_ID")
	 public void updatedLocation(String value) {
		 
		System.out.println(value);
		
	 }
	
}
