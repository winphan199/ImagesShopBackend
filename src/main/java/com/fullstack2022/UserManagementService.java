//package com.fullstack2022;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import com.google.firebase.auth.ExportedUserRecord;
//import com.google.firebase.auth.FirebaseAuth;
//import com.google.firebase.auth.ListUsersPage;
//
//import lombok.NoArgsConstructor;
//
//@NoArgsConstructor
//
//public class UserManagementService {
//
//    static public List<ExportedUserRecord> listAllUser(FirebaseAuth firebaseInstance) {
//        ArrayList<ExportedUserRecord> listUsers = new ArrayList<ExportedUserRecord>();
//        try {
//            ListUsersPage page = firebaseInstance.listUsers(null);
//            while (page != null) {
//                for (ExportedUserRecord user : page.getValues()) {
//                    listUsers.add(user);
//                    System.out.println("User: " + user.getUid());
//                }
//                page = page.getNextPage();
//            }
//            
//        } catch (Exception e) {
//            System.err.println(e.getMessage());
//        }
//        
//        return listUsers;
//    }
//}
