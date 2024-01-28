package _dev;

import dev.jeka.core.tool.JkInjectClasspath;
import dev.jeka.core.tool.JkInjectCompileOption;
import dev.jeka.core.tool.KBean;
import dev.jeka.core.tool.builtins.self.SelfKBean;
import dev.jeka.plugins.springboot.SpringbootKBean;

@JkInjectCompileOption("-parameters")

@JkInjectClasspath("dev.jeka:springboot-plugin")
class Build extends KBean {

    Build() {
        load(SelfKBean.class)
                .setModuleId("my:appli")
                .setVersion("0.0.1");
        load(SpringbootKBean.class);
    }

}