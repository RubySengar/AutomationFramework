package CognizantAssesment;

import java.util.Date;

public class Shipment {
	
	private String id;
	private String sourcePort;
	private String destinationPort;
	private Date expectedDeliveryDate;
	private String customerName;
	private ShipmentStatus[] shipmentStatus;
	
	Shipment(){
		
	}
	
	public Shipment(String id,  String sourcePort,String destinationPort,Date expectedDeliveryDate,String customerName){
		
		this.id = id;
		this.sourcePort = sourcePort;
		this.destinationPort = destinationPort;
		this.expectedDeliveryDate = expectedDeliveryDate;
		this.customerName = customerName;
		
	}
	


}
