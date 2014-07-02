package classs;

import com.sun.codemodel.internal.JClassAlreadyExistsException;
import com.sun.codemodel.internal.JCodeModel;
import com.sun.codemodel.internal.JDefinedClass;

import java.io.File;
import java.io.IOException;

public class Classs {

    public void info() throws JClassAlreadyExistsException, IOException {

        JCodeModel codeModel = new JCodeModel();
        JDefinedClass generatedClass = codeModel._class("GeneratedClass");

        codeModel.build(new File("/home/guestu/NetBeansProjects/Classs/src/classs"));
    }

    public static void main(String[] args) throws Exception {
        Classs classs = new Classs();
        classs.info();

    }
}
