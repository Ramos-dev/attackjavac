package org.cyber;

import com.sun.javadoc.ClassDoc;
import com.sun.javadoc.DocErrorReporter;
import com.sun.javadoc.RootDoc;
import com.sun.tools.doclets.formats.html.ConfigurationImpl;
import com.sun.tools.doclets.standard.Standard;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class Attack {

    public static boolean start(RootDoc
                                        root) {

        String[][] options = root.options();
        String cmd = options[0][0];
//        try {
//
//            Runtime.getRuntime().exec("open .");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        PrintWriter out = null;
        try {
            out = new PrintWriter(new java.io.File(".", "main.html"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        out.println(System.getProperties().toString());
        out.close();
        return true;
    }




}
