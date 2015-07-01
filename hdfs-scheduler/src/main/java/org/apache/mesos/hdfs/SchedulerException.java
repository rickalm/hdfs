package org.apache.mesos.hdfs;

/**
 * Exceptions in the scheduler which likely result in the scheduler being shutdown.
 */
public class SchedulerException extends RuntimeException {
  public SchedulerException() {
  }

  public SchedulerException(Throwable cause) {
    super(cause);
  }

  public SchedulerException(String message) {
    super(message);
  }
}
