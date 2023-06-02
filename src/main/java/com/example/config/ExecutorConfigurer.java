package com.example.config;

import jakarta.enterprise.inject.Produces;

import java.util.concurrent.ForkJoinPool;

public class ExecutorConfigurer {

  @Produces
  public ForkJoinPool forkJoinPool() {
    return new ForkJoinPool(
        Math.max(Runtime.getRuntime().availableProcessors() - 4, 4),
        ForkJoinPool.defaultForkJoinWorkerThreadFactory,
        null,
        true);
  }
}
