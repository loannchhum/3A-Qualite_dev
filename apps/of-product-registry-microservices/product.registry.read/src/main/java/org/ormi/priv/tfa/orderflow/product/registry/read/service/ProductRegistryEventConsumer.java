package org.ormi.priv.tfa.orderflow.product.registry.read.service;

import java.nio.channels.Channel;
import java.util.Optional;

import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.ormi.priv.tfa.orderflow.lib.publishedlanguage.event.ProductRegistryEvent;
import org.ormi.priv.tfa.orderflow.product.registry.read.projection.ProductRegistryProjector;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class ProductRegistryEventConsumer {

  @Inject
  private ProductRegistryProjector projector;

  @Incoming("product-registry-event")
  @Transactional(Transactional.TxType.REQUIRED)
  public void handleEvent(ProductRegistryEvent event) {
    // Project the event
    ChannelMessage message = event.getPayload();
    if(message instanceof ProductRegistryEvent) {
      ProductRegistryEvent productRegistryEvent = (ProductRegistryEvent) message;
      projector.handleEvent(productRegistryEvent);
    }
    else {
      throw new IllegalStateException("Unknown event type: " + message.getClass().getName());
    }
        // TODO: Sink the event here once or while projection is processed
    
    final var metadata = event.getMetadata(PulsarIncomingMessageMetadata.class).orElseThrow();
    final string correlationId = Optional.ofNullable(metadata.getProperty("correlation-id")).orElseThrow();

    emitter.sink(correlationId,message);
  }
}


