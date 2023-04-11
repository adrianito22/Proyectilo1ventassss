package utils;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Common {

    public static void initFirebase(JFrame frame) {
        FileInputStream refreshToken = null;
        InputStream imputx=null;
        try {
//            //C:\Users\CAPSULE\Documents\ClaveAdnminFirebase
          //  refreshToken = new FileInputStream("C:\\Users\\adrix\\IdeaProjects\\keyFirebaseAdminSDK\\fir-qsercom-firebase-adminsdk-kn9fn-46feaf5b69.json");

           // refreshToken = new FileInputStream("src/json/fir-qsercom-firebase-adminsdk-kn9fn-46feaf5b69.json");

             imputx = frame.getClass().getResourceAsStream("/main/fir-qsercom-firebase-adminsdk-kn9fn-46feaf5b69.json");



            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(imputx))
                    .setDatabaseUrl("https://fir-qsercom-default-rtdb.firebaseio.com/")
                    .build();
            FirebaseApp.initializeApp(options);

        } catch (FileNotFoundException ex) {

            JOptionPane.showMessageDialog(new JFrame(), "es FileNotFoundException");


            Logger.getLogger(Common.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Common.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(), "es IOException1");

        } finally {
            try {

                imputx.close();
            } catch (IOException ex) {

                JOptionPane.showMessageDialog(new JFrame(), "es IOException2");

                Logger.getLogger(Common.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static String generateUUID() {
        return UUID.randomUUID().toString();
    }

}
