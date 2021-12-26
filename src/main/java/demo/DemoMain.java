package demo;

import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;

public class DemoMain {
    @At("/hello")
    @Ok("jsp:jsp.hello")
    public String doHello() {
        return "zw3 Nutz";
    }
}
