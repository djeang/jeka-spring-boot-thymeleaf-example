package _dev;

import dev.jeka.core.api.java.JkJavaProcess;
import dev.jeka.core.api.system.JkProcHandler;
import dev.jeka.core.api.utils.JkUtilsHttp;
import dev.jeka.core.tool.JkDoc;
import dev.jeka.core.tool.JkInjectClasspath;
import dev.jeka.core.tool.JkInjectCompileOption;
import dev.jeka.core.tool.KBean;
import dev.jeka.core.tool.builtins.self.SelfKBean;
import dev.jeka.plugins.springboot.SpringbootKBean;

import java.awt.*;
import java.io.IOException;
import java.net.URI;

@JkInjectCompileOption("-parameters")

@JkInjectClasspath("dev.jeka:springboot-plugin")
class Build extends KBean {

    public static final String URL = "http://localhost:8080";

    Build() {
        load(SelfKBean.class)
                .setModuleId("my:appli")
                .setVersion("0.0.1");
        load(SpringbootKBean.class);
    }

    @JkDoc("Launch application and wait it is ready prior opening a browser tab pointing on it.")
    public void open() throws Exception {
        JkProcHandler procHandler = load(SelfKBean.class).prepareRunJar().execAsync();
        JkUtilsHttp.checkUntilOk(URL, 20000, 5000);
        Desktop.getDesktop().browse(URI.create(URL));
        procHandler.getProcess().waitFor();
    }


}