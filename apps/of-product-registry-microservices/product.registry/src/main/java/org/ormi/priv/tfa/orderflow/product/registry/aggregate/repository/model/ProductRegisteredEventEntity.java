package org.ormi.priv.tfa.orderflow.product.registry.aggregate.repository.model;

/**
 * Entity representing a product registration event in the product registry.
 */
public class ProductRegisteredEventEntity extends ProductRegistryEventEntity {

    static final String EVENT_TYPE = "ProductRegistered";

    /**
     * Payload for the event.
     */
    public static record Payload(
        String productId,
        String name,
        String productDescription
    ) {}

    /**
     * The payload for the event.
     */
    private Payload payload;

    /**
     * Get the payload for the event.
     * 
     * @return the payload
     */
    public Payload getPayload() {
        return payload;
    }

    /**
     * Set the payload for the event.
     * 
     * @param payload the payload to set
     */
    public void setPayload(Payload payload) {
        this.payload = payload;
    }

    @Override
    public String getEventType() {
        return EVENT_TYPE;
    }
}
