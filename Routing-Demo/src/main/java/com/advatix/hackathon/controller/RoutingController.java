package com.advatix.hackathon.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.advatix.hackathon.model.RoutingInfo;
import com.advatix.hackathon.service.inventoryService;
import com.advatix.hackathon.service.routeService;

@RestController
@RequestMapping(path = "/")
public class RoutingController {
	Logger logger = LoggerFactory.getLogger(RoutingController.class);
	@Autowired
	private routeService routeservice;
	
	@Autowired
	private inventoryService invontoryservice;

	@GetMapping("/getWarehouseListing")
	public ResponseEntity<Object> getRoutingInfo(@RequestHeader Map<String, String> recvHeaders) {
		
		routeservice.findAll();
		return new ResponseEntity<Object>(routeservice.findAll(), new HttpHeaders(), HttpStatus.OK);
	}
	
	@GetMapping("/fetchinventory")
	public ResponseEntity<Object> getinventoryInfo(@RequestHeader Map<String, String> recvHeaders) {
		
		//routeservice.findAll();
		return new ResponseEntity<Object>(invontoryservice.findAll(), new HttpHeaders(), HttpStatus.OK);
	}
	
	@PostMapping("/fetchDistance")
	public ResponseEntity<String> getDistanceInfo(){
		return new ResponseEntity<String>("This is will send the distance between destination and various warehouses", new HttpHeaders(), HttpStatus.OK);
	}

	@PostMapping("/createWarehouse")
	public ResponseEntity<String> createWarehouse(){
		return new ResponseEntity<String>("This is will create a warehouse", new HttpHeaders(), HttpStatus.OK);
	}
	
	@PostMapping("/createOrder")
	public ResponseEntity<String> createOrder(){
		return new ResponseEntity<String>("This is will create an Order in the warehouse", new HttpHeaders(), HttpStatus.OK);
	}
	
	
}
