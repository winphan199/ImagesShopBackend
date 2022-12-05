package com.fullstack2022;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.firebase.auth.ExportedUserRecord;

@Controller
public class MainController {
    
    @RequestMapping("*")
    @ResponseBody
    public String pageNotFound() {
        return "ERROR 404: PAGE NOT FOUND";
    }

    @RequestMapping("/home")
    @ResponseBody
    public List<ExportedUserRecord> homePage() {
        return UserManagementService.listAllUser(FirebaseService.getInstance().getDefaultAuth());
    }

}
