package com.teamOne.developer.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.teamOne.developer.dao.RoomRepositroy;
import com.teamOne.developer.entity.Room;


@Service
public class RoomService {
	
	@Autowired
	RoomRepositroy repo;
	
	public List<Room> getAllRoomList(){
		return repo.findAll();
	}
}
