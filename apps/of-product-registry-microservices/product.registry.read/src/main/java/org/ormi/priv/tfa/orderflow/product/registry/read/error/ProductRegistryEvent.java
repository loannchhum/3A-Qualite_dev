/**
 * Base class for product registry events.
 */
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "type"
)
@JsonSubTypes({
  @JsonSubTypes.Type(value = ProductRegistered.class, name = "ProductRegistered"),
  @JsonSubTypes.Type(value = ProductUpdated.class, name = "ProductUpdated"),
  @JsonSubTypes.Type(value = ProductRemoved.class, name = "ProductRemoved")
})
public sealed interface ProductRegistryEvent permits ProductRegistered, ProductRemoved, ProductUpdated {
}