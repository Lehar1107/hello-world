package deliveryBoy.DeliveryBoy.service;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;
import deliveryBoy.DeliveryBoy.config.AppConstants;

@Service
public class KafkaService {

	@Autowired
	private KafkaTemplate<String,String> kafkaTemplate;

	private Logger logger = (Logger) LoggerFactory.getLogger(KafkaService.class);
	
	public boolean updateLocation(String location) {
	
	   this.kafkaTemplate.send(AppConstants.LOCATION_TOPIC_NAME, location);
	   return true;
	}
	
	
}
