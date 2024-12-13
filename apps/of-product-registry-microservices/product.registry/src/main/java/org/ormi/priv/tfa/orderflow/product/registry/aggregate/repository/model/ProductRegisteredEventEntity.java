package org.ormi.priv.tfa.orderflow.product.registry.aggregate.repository.model;

public class ProductRegisteredEventEntity extends ProductRegistryEventEntity {

    static final String EVENT_TYPE = "ProductRegistered";

    /**
     * Payload for the event.
     */
    public static class Payload {
        /**
         * The id of the product.
         */
        private String productId;
        /**
         * The name of the product.
         */
        private String name;
        /**
         * The description of the product.
         */
        private String productDescription;

        /**
         * Get the product ID.
         * 
         * @return the productId
         */
        public String getProductId() {
            return productId;
        }

        /**
         * Set the product ID.
         * 
         * @param productId the productId to set
         */
        public void setProductId(String productId) {
            this.productId = productId;
        }

        /**
         * Get the name of the product.
         * 
         * @return the name
         */
        public String getName() {
            return name;
        }

        /**
         * Set the name of the product.
         * 
         * @param name the name to set
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * Get the product description.
         * 
         * @return the productDescription
         */
        public String getProductDescription() {
            return productDescription;
        }

        /**
         * Set the product description.
         * 
         * @param productDescription the productDescription to set
         */
        public void setProductDescription(String productDescription) {
            this.productDescription = productDescription;
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
