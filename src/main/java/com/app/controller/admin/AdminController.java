package com.app.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.dto.room.Room;
import com.app.dto.user.User;
import com.app.service.room.RoomService;
import com.app.service.user.UserService;

@Controller
public class AdminController {

	@Autowired
	RoomService roomService;

	@Autowired
	UserService userService;

	// 객실 등록
	@GetMapping("/admin/registerRoom")
	public String registerRoom() {
		return "admin/registerRoom";
	}

	@PostMapping("/admin/registerRoom")
	public String registerRoomAction(Room room) {

		// 값 넘어온거 확인
		System.out.println(room.toString());
		// 등록
		int result = roomService.saveRoom(room);
		System.out.println(result);

		if (result > 0) {
			return "redirect:/admin/rooms";
		} else {
			return "admin/registerRoom";
		}

	}

	// 관리자 객실 목록 확인
	@GetMapping("/admin/rooms")
	public String rooms(Model model) {
		List<Room> roomList = roomService.findRoomList();
		// service.findRoomList 호출 -> DAO findRoomList -> DB (Mybatos mapper) select
//									<- List<Room>			<- List<Room>
//Controller DB 로 부터 조회 데이터 -> 화면 전달 -> 화면 출력(표시)

		model.addAttribute("roomList", roomList);

		return "admin/rooms";

	}

	// 고객 관리/등록

	@GetMapping("/admin/users/add")
	public String addUser() {
		return "admin/addUser";
	}
	
	@PostMapping("/admin/users/add")
	public String addUserAction(User user) {
		
		//사용자 추가 (관리자X)
		user.setUserType("CUS");
		int result = userService.saveUser(user);
//		int result = userService.saveCustomerUser(user);
		System.out.println("사용자 추가 처리 결과: " + result);
		return "admin/addUser";

	}
}
