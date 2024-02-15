package com.olegmng.springaspects;

import org.springframework.stereotype.Component;
import com.olegmng.springaspects.aspect.Loggable;

@Component
public class Louiggi implements Brother {

  @Loggable(level = Level.WARN)
  public void method1(String arg1, int arg2) {

  }

  @Loggable(level = Level.WARN)
  public String method2() {
    return "value";
  }

  public String method3() {
    throw new RuntimeException("runtimeexceptionmsg");
  }

}
