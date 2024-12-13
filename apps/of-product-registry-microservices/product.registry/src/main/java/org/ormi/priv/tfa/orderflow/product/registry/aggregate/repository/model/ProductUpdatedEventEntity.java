package org.ormi.priv.tfa.orderflow.product.registry.aggregate.repository.model;

/**
 * Entity representing a product update event in the product registry.
 */
public class ProductUpdatedEventEntity extends ProductRegistryEventEntity {

    static final String EVENT_TYPE = "ProductUpdated";

    /**
     * Payload for the event, implemented as a record.
     */
    public static record Payload(
        String productId,         // The id of the product
        String name,              // The name of the product
        String productDescription // The description of the product
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
