//package com.fullstack2022;
//
//import java.io.FileInputStream;
//
//import com.google.auth.oauth2.GoogleCredentials;
//import com.google.firebase.FirebaseApp;
//import com.google.firebase.FirebaseOptions;
//import com.google.firebase.auth.FirebaseAuth;
//import com.google.firebase.database.FirebaseDatabase;
//
//import lombok.Data;
//
//@Data
//
//public class FirebaseService {
//    static private FirebaseService instance; 
//    
//    private FirebaseAuth defaultAuth = null;
//    private FirebaseDatabase defaultDatabase = null;
//    private FirebaseApp defaultApp = null;
//
//    private FirebaseService() {
//        try {
//            FileInputStream refreshToken = new FileInputStream("/home/minhdang/Documents/TAMK/FULLSTACK/ImageShopFullStack2022/imageshopserver/.firebasekeys/authentication-test-a77a2-1d79c15bc320.json");
//            
//            FirebaseOptions options = FirebaseOptions.builder()
//            .setCredentials(GoogleCredentials.fromStream(refreshToken))
//            .setDatabaseUrl("https://authentication-test-a77a2.firebaseio.com/")
//            .build();
//
//            defaultApp = FirebaseApp.initializeApp(options);
//            defaultAuth = FirebaseAuth.getInstance(defaultApp);
//            defaultDatabase = FirebaseDatabase.getInstance(defaultApp);
//
//            System.out.println(defaultApp.getName());  
//
//        } catch (Exception e) {
//            System.err.println(e.getMessage());
//        }
//    }
//
//    public static FirebaseService getInstance() {
//        if (instance == null) instance = new FirebaseService();
//        return instance;
//    }
//}
