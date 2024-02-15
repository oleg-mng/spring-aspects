package com.olegmng.springaspects;

import com.olegmng.springaspects.aspect.Time;
import org.springframework.stereotype.Component;
import com.olegmng.springaspects.aspect.Loggable;

@Loggable
@Component
public class Mario implements Brother {

@Time
  public void method1(String arg1, int arg2) {

  }

  public String method2() {
    return "value";
  }
@Time
  public String method3() {
    throw new RuntimeException("runtimeexceptionmsg");
  }

}
