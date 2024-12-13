package org.ormi.priv.tfa.orderflow.product.registry.aggregate.repository.model;

public class ProductRemovedEventEntity extends ProductRegistryEventEntity {

    static final String EVENT_TYPE = "ProductRemoved";

    /**
     * Payload for the event.
     */
    public static class Payload {
        /**
         * The id of the product.
         */
        private String productId;

        /**
         * Get the product id.
         * 
         * @return the product id
         */
        public String getProductId() {
            return productId;
        }

        /**
         * Set the product id.
         * 
         * @param productId the product id to set
         */
        public void setProductId(String productId) {
            this.productId = productId;
        }
    }

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
