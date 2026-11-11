package com.sprint.mission.book_store_project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/hi")
public class HiController {

  @GetMapping
  public String hi(){
    return "hihiㅁㄴㅇㅎㅁㄴㅇㄹㅁㄴㅇㄹㅁㄴㅇㄹ";
  }

  // 아무내용

}
