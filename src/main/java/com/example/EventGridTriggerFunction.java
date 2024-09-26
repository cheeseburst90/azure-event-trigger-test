package com.example;

import com.microsoft.azure.functions.annotation.*;
import com.microsoft.azure.functions.*;
import java.util.*;

/**
 * Azure Functions with Event Hub trigger.
 */
public class EventGridTriggerFunction {
    @FunctionName("EventGridTriggerJava")
    public void run(
            @EventGridTrigger(name = "eventgridEvent") String eventGridEvent,
            final ExecutionContext context) {
        context.getLogger().info("Java Event Grid trigger function executed with: " + eventGridEvent);
    }
}
