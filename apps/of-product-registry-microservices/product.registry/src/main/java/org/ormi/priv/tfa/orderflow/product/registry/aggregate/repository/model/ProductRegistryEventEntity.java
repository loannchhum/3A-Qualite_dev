package org.ormi.priv.tfa.orderflow.product.registry.aggregate.repository.model;

import org.bson.types.ObjectId;
import io.quarkus.mongodb.panache.common.MongoEntity;

@MongoEntity(collection = "product_registry_events")
public abstract class ProductRegistryEventEntity {

    private ObjectId id;
    private String eventId;
    private String eventType = getEventType();
    private String aggregateRootId;
    private long version;
    private long timestamp;

    /**
     * Get the unique identifier for the event.
     * 
     * @return the id
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Set the unique identifier for the event.
     * 
     * @param id the id to set
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Get the event ID.
     * 
     * @return the eventId
     */
    public String getEventId() {
        return eventId;
    }

    /**
     * Set the event ID.
     * 
     * @param eventId the eventId to set
     */
    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * Get the event type.
     * 
     * @return the eventType
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * Set the event type.
     * 
     * @param eventType the eventType to set
     */
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * Get the aggregate root ID.
     * 
     * @return the aggregateRootId
     */
    public String getAggregateRootId() {
        return aggregateRootId;
    }

    /**
     * Set the aggregate root ID.
     * 
     * @param aggregateRootId the aggregateRootId to set
     */
    public void setAggregateRootId(String aggregateRootId) {
        this.aggregateRootId = aggregateRootId;
    }

    /**
     * Get the version of the event.
     * 
     * @return the version
     */
    public long getVersion() {
        return version;
    }

    /**
     * Set the version of the event.
     * 
     * @param version the version to set
     */
    public void setVersion(long version) {
        this.version = version;
    }

    /**
     * Get the timestamp of the event.
     * 
     * @return the timestamp
     */
    public long getTimestamp() {
        return timestamp;
    }

    /**
     * Set the timestamp of the event.
     * 
     * @param timestamp the timestamp to set
     */
    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Abstract method to retrieve the event type.
     * 
     * @return the event type
     */
    public abstract String getEventType();
}
