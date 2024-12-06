package org.ormi.priv.tfa.orderflow.product.registry.aggregate.repository.model;

/**
 * Entity representing a product registration event in the product registry.
 */
public class ProductRegisteredEventEntity extends ProductRegistryEventEntity {
  static final String EVENT_TYPE = "ProductRegistered";

  /**
   * Payload for the event, implemented as a record.
   */
  public record Payload(
      String productId,          // The id of the product
      String name,               // The name of the product
      String productDescription  // The description of the product
  ) {}

  /**
   * The payload for the event.
   */
  public Payload payload;

  @Override
  public String getEventType() {
    return EVENT_TYPE;
  }
}