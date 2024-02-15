package com.olegmng.springaspects;

import org.springframework.stereotype.Component;
import com.olegmng.springaspects.aspect.Loggable;

@Loggable(level = System.Logger.Level.INFO)
@Component
public class Mario implements Brother {


  public void method1(String arg1, int arg2) {

  }

  public String method2() {
    return "value";
  }

  public String method3() {
    throw new RuntimeException("runtimeexceptionmsg");
  }

}
