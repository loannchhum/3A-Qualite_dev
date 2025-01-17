package org.ormi.priv.tfa.orderflow.lib.publishedlanguage.event;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 

    Base class for all channel messages.*/

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = ProductRegistered.class, name = "ProductRegistered"),
    @JsonSubTypes.Type(value = ProductUpdated.class, name = "ProductUpdated"),
    @JsonSubTypes.Type(value = ProductRemoved.class, name = "ProductRemoved"),
    @JsonSubTypes.Type(value = ProductRegistryError.class, name = "ProductRegistryError")
})
public sealed interface ChannelMessage permits ProductRegistryEvent, ProductRegistryError {
}