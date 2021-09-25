package com.advatix.hackathon.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.advatix.hackathon.model.*;
import com.advatix.hackathon.repository.*;

@Service
public class routeserviceimpl implements routeService {

 @Autowired
private RouteinfoRepository fcRepository;


@Override
public List<RoutingInfo> findAll() {
	return fcRepository.findAll();
// TODO Auto-generated method stub

}


}