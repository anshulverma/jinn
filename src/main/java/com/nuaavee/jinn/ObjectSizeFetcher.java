package com.nuaavee.jinn;

import java.lang.instrument.Instrumentation;

public class ObjectSizeFetcher {

  private static Instrumentation instrumentation;

  public static void premain(String args, Instrumentation instrumentation) {
    ObjectSizeFetcher.instrumentation = instrumentation;
  }

  public static long getObjectSize(Object obj) {
    return instrumentation.getObjectSize(obj);
  }
}
