package org.ormi.priv.tfa.orderflow.product.registry.aggregate.repository.model;

/**
 * Entity representing a product removal event in the product registry.
 */
public class ProductRemovedEventEntity extends ProductRegistryEventEntity {
  static final String EVENT_TYPE = "ProductRemoved";

  /**
   * Payload for the event, implemented as a record.
   */
  public record Payload(String productId) {}

  /**
   * The payload for the event.
   */
  public Payload payload;

  @Override
  public String getEventType() {
    return EVENT_TYPE;
  }
}