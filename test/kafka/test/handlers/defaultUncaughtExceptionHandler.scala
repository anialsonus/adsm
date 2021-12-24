package kafka.test.handlers

import org.apache.kafka.streams.errors.StreamsUncaughtExceptionHandler
import org.apache.kafka.streams.errors.StreamsUncaughtExceptionHandler.StreamThreadExceptionResponse

class defaultUncaughtExceptionHandler extends StreamsUncaughtExceptionHandler {
  override def handle(exception: Throwable): StreamsUncaughtExceptionHandler.StreamThreadExceptionResponse = StreamThreadExceptionResponse.SHUTDOWN_APPLICATION
}
