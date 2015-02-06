package com.nuaavee.jinn;

import java.lang.instrument.Instrumentation;

public class ObjectSizeFetcher {

  private static Instrumentation instrumentation;

  public static long getObjectSize(Object obj) {
    return 1l;
  }
}
