package io.coalfired.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.coalfired.model.Money;
import io.coalfired.model.ProductOfferingPrice;
import io.coalfired.model.Quantity;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.IOException;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-05-22T16:36:15.642271455Z[GMT]")
@RestController
public class ProductOfferingPriceApiController implements ProductOfferingPriceApi {

    private static final Logger log = LoggerFactory.getLogger(ProductOfferingPriceApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ProductOfferingPriceApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<ProductOfferingPrice>> listProductOfferingPrice(@Parameter(in = ParameterIn.QUERY, description = "Comma-separated properties to be provided in response", schema = @Schema()) @Valid @RequestParam(value = "fields", required = false) String fields
            , @Parameter(in = ParameterIn.QUERY, description = "Requested index for start of resources to be provided in response", schema = @Schema()) @Valid @RequestParam(value = "offset", required = false) Integer offset
            , @Parameter(in = ParameterIn.QUERY, description = "Requested number of resources to be provided in response", schema = @Schema()) @Valid @RequestParam(value = "limit", required = false) Integer limit
    ) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ProductOfferingPrice>>(objectMapper.readValue("[ {\n  \"isBundle\" : true,\n  \"popRelationship\" : [ {\n    \"relationshipType\" : \"relationshipType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  }, {\n    \"relationshipType\" : \"relationshipType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  } ],\n  \"lifecycleStatus\" : \"lifecycleStatus\",\n  \"@type\" : \"@type\",\n  \"description\" : \"description\",\n  \"recurringChargePeriodType\" : \"recurringChargePeriodType\",\n  \"recurringChargePeriodLength\" : 6,\n  \"@baseType\" : \"@baseType\",\n  \"price\" : {\n    \"unit\" : \"unit\",\n    \"value\" : 1.4658129\n  },\n  \"percentage\" : 0.8008282,\n  \"id\" : \"id\",\n  \"href\" : \"href\",\n  \"place\" : [ {\n    \"@referredType\" : \"@referredType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  }, {\n    \"@referredType\" : \"@referredType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  } ],\n  \"@schemaLocation\" : \"@schemaLocation\",\n  \"bundledPopRelationship\" : [ {\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  }, {\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  } ],\n  \"productOfferingTerm\" : [ {\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"description\" : \"description\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  }, {\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"description\" : \"description\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  } ],\n  \"prodSpecCharValueUse\" : [ {\n    \"minCardinality\" : 2,\n    \"productSpecification\" : {\n      \"@referredType\" : \"@referredType\",\n      \"targetProductSchema\" : {\n        \"@baseType\" : \"@baseType\",\n        \"@type\" : \"@type\",\n        \"@schemaLocation\" : \"@schemaLocation\"\n      },\n      \"@baseType\" : \"@baseType\",\n      \"@type\" : \"@type\",\n      \"name\" : \"name\",\n      \"id\" : \"id\",\n      \"href\" : \"href\",\n      \"@schemaLocation\" : \"http://example.com/aeiou\",\n      \"version\" : \"version\"\n    },\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"valueType\" : \"valueType\",\n    \"name\" : \"name\",\n    \"description\" : \"description\",\n    \"productSpecCharacteristicValue\" : [ {\n      \"rangeInterval\" : \"rangeInterval\",\n      \"isDefault\" : true,\n      \"regex\" : \"regex\",\n      \"valueTo\" : \"valueTo\",\n      \"unitOfMeasure\" : \"unitOfMeasure\",\n      \"@baseType\" : \"@baseType\",\n      \"@type\" : \"@type\",\n      \"valueType\" : \"valueType\",\n      \"@schemaLocation\" : \"http://example.com/aeiou\",\n      \"value\" : { },\n      \"valueFrom\" : \"valueFrom\"\n    }, {\n      \"rangeInterval\" : \"rangeInterval\",\n      \"isDefault\" : true,\n      \"regex\" : \"regex\",\n      \"valueTo\" : \"valueTo\",\n      \"unitOfMeasure\" : \"unitOfMeasure\",\n      \"@baseType\" : \"@baseType\",\n      \"@type\" : \"@type\",\n      \"valueType\" : \"valueType\",\n      \"@schemaLocation\" : \"http://example.com/aeiou\",\n      \"value\" : { },\n      \"valueFrom\" : \"valueFrom\"\n    } ],\n    \"@schemaLocation\" : \"http://example.com/aeiou\",\n    \"maxCardinality\" : 5\n  }, {\n    \"minCardinality\" : 2,\n    \"productSpecification\" : {\n      \"@referredType\" : \"@referredType\",\n      \"targetProductSchema\" : {\n        \"@baseType\" : \"@baseType\",\n        \"@type\" : \"@type\",\n        \"@schemaLocation\" : \"@schemaLocation\"\n      },\n      \"@baseType\" : \"@baseType\",\n      \"@type\" : \"@type\",\n      \"name\" : \"name\",\n      \"id\" : \"id\",\n      \"href\" : \"href\",\n      \"@schemaLocation\" : \"http://example.com/aeiou\",\n      \"version\" : \"version\"\n    },\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"valueType\" : \"valueType\",\n    \"name\" : \"name\",\n    \"description\" : \"description\",\n    \"productSpecCharacteristicValue\" : [ {\n      \"rangeInterval\" : \"rangeInterval\",\n      \"isDefault\" : true,\n      \"regex\" : \"regex\",\n      \"valueTo\" : \"valueTo\",\n      \"unitOfMeasure\" : \"unitOfMeasure\",\n      \"@baseType\" : \"@baseType\",\n      \"@type\" : \"@type\",\n      \"valueType\" : \"valueType\",\n      \"@schemaLocation\" : \"http://example.com/aeiou\",\n      \"value\" : { },\n      \"valueFrom\" : \"valueFrom\"\n    }, {\n      \"rangeInterval\" : \"rangeInterval\",\n      \"isDefault\" : true,\n      \"regex\" : \"regex\",\n      \"valueTo\" : \"valueTo\",\n      \"unitOfMeasure\" : \"unitOfMeasure\",\n      \"@baseType\" : \"@baseType\",\n      \"@type\" : \"@type\",\n      \"valueType\" : \"valueType\",\n      \"@schemaLocation\" : \"http://example.com/aeiou\",\n      \"value\" : { },\n      \"valueFrom\" : \"valueFrom\"\n    } ],\n    \"@schemaLocation\" : \"http://example.com/aeiou\",\n    \"maxCardinality\" : 5\n  } ],\n  \"unitOfMeasure\" : {\n    \"amount\" : 0.8008282,\n    \"units\" : \"units\"\n  },\n  \"priceType\" : \"priceType\",\n  \"tax\" : [ {\n    \"taxRate\" : 5.962134,\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\",\n    \"taxCategory\" : \"taxCategory\"\n  }, {\n    \"taxRate\" : 5.962134,\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\",\n    \"taxCategory\" : \"taxCategory\"\n  } ],\n  \"version\" : \"version\",\n  \"pricingLogicAlgorithm\" : [ {\n    \"@baseType\" : \"@baseType\",\n    \"validFor\" : {\n      \"startDateTime\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"endDateTime\" : \"2000-01-23T04:56:07.000+00:00\"\n    },\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"description\" : \"description\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"plaSpecId\" : \"plaSpecId\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  }, {\n    \"@baseType\" : \"@baseType\",\n    \"validFor\" : {\n      \"startDateTime\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"endDateTime\" : \"2000-01-23T04:56:07.000+00:00\"\n    },\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"description\" : \"description\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"plaSpecId\" : \"plaSpecId\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  } ],\n  \"lastUpdate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"name\" : \"name\",\n  \"constraint\" : [ {\n    \"@referredType\" : \"@referredType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\",\n    \"version\" : \"version\"\n  }, {\n    \"@referredType\" : \"@referredType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\",\n    \"version\" : \"version\"\n  } ]\n}, {\n  \"isBundle\" : true,\n  \"popRelationship\" : [ {\n    \"relationshipType\" : \"relationshipType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  }, {\n    \"relationshipType\" : \"relationshipType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  } ],\n  \"lifecycleStatus\" : \"lifecycleStatus\",\n  \"@type\" : \"@type\",\n  \"description\" : \"description\",\n  \"recurringChargePeriodType\" : \"recurringChargePeriodType\",\n  \"recurringChargePeriodLength\" : 6,\n  \"@baseType\" : \"@baseType\",\n  \"price\" : {\n    \"unit\" : \"unit\",\n    \"value\" : 1.4658129\n  },\n  \"percentage\" : 0.8008282,\n  \"id\" : \"id\",\n  \"href\" : \"href\",\n  \"place\" : [ {\n    \"@referredType\" : \"@referredType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  }, {\n    \"@referredType\" : \"@referredType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  } ],\n  \"@schemaLocation\" : \"@schemaLocation\",\n  \"bundledPopRelationship\" : [ {\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  }, {\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  } ],\n  \"productOfferingTerm\" : [ {\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"description\" : \"description\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  }, {\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"description\" : \"description\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  } ],\n  \"prodSpecCharValueUse\" : [ {\n    \"minCardinality\" : 2,\n    \"productSpecification\" : {\n      \"@referredType\" : \"@referredType\",\n      \"targetProductSchema\" : {\n        \"@baseType\" : \"@baseType\",\n        \"@type\" : \"@type\",\n        \"@schemaLocation\" : \"@schemaLocation\"\n      },\n      \"@baseType\" : \"@baseType\",\n      \"@type\" : \"@type\",\n      \"name\" : \"name\",\n      \"id\" : \"id\",\n      \"href\" : \"href\",\n      \"@schemaLocation\" : \"http://example.com/aeiou\",\n      \"version\" : \"version\"\n    },\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"valueType\" : \"valueType\",\n    \"name\" : \"name\",\n    \"description\" : \"description\",\n    \"productSpecCharacteristicValue\" : [ {\n      \"rangeInterval\" : \"rangeInterval\",\n      \"isDefault\" : true,\n      \"regex\" : \"regex\",\n      \"valueTo\" : \"valueTo\",\n      \"unitOfMeasure\" : \"unitOfMeasure\",\n      \"@baseType\" : \"@baseType\",\n      \"@type\" : \"@type\",\n      \"valueType\" : \"valueType\",\n      \"@schemaLocation\" : \"http://example.com/aeiou\",\n      \"value\" : { },\n      \"valueFrom\" : \"valueFrom\"\n    }, {\n      \"rangeInterval\" : \"rangeInterval\",\n      \"isDefault\" : true,\n      \"regex\" : \"regex\",\n      \"valueTo\" : \"valueTo\",\n      \"unitOfMeasure\" : \"unitOfMeasure\",\n      \"@baseType\" : \"@baseType\",\n      \"@type\" : \"@type\",\n      \"valueType\" : \"valueType\",\n      \"@schemaLocation\" : \"http://example.com/aeiou\",\n      \"value\" : { },\n      \"valueFrom\" : \"valueFrom\"\n    } ],\n    \"@schemaLocation\" : \"http://example.com/aeiou\",\n    \"maxCardinality\" : 5\n  }, {\n    \"minCardinality\" : 2,\n    \"productSpecification\" : {\n      \"@referredType\" : \"@referredType\",\n      \"targetProductSchema\" : {\n        \"@baseType\" : \"@baseType\",\n        \"@type\" : \"@type\",\n        \"@schemaLocation\" : \"@schemaLocation\"\n      },\n      \"@baseType\" : \"@baseType\",\n      \"@type\" : \"@type\",\n      \"name\" : \"name\",\n      \"id\" : \"id\",\n      \"href\" : \"href\",\n      \"@schemaLocation\" : \"http://example.com/aeiou\",\n      \"version\" : \"version\"\n    },\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"valueType\" : \"valueType\",\n    \"name\" : \"name\",\n    \"description\" : \"description\",\n    \"productSpecCharacteristicValue\" : [ {\n      \"rangeInterval\" : \"rangeInterval\",\n      \"isDefault\" : true,\n      \"regex\" : \"regex\",\n      \"valueTo\" : \"valueTo\",\n      \"unitOfMeasure\" : \"unitOfMeasure\",\n      \"@baseType\" : \"@baseType\",\n      \"@type\" : \"@type\",\n      \"valueType\" : \"valueType\",\n      \"@schemaLocation\" : \"http://example.com/aeiou\",\n      \"value\" : { },\n      \"valueFrom\" : \"valueFrom\"\n    }, {\n      \"rangeInterval\" : \"rangeInterval\",\n      \"isDefault\" : true,\n      \"regex\" : \"regex\",\n      \"valueTo\" : \"valueTo\",\n      \"unitOfMeasure\" : \"unitOfMeasure\",\n      \"@baseType\" : \"@baseType\",\n      \"@type\" : \"@type\",\n      \"valueType\" : \"valueType\",\n      \"@schemaLocation\" : \"http://example.com/aeiou\",\n      \"value\" : { },\n      \"valueFrom\" : \"valueFrom\"\n    } ],\n    \"@schemaLocation\" : \"http://example.com/aeiou\",\n    \"maxCardinality\" : 5\n  } ],\n  \"unitOfMeasure\" : {\n    \"amount\" : 0.8008282,\n    \"units\" : \"units\"\n  },\n  \"priceType\" : \"priceType\",\n  \"tax\" : [ {\n    \"taxRate\" : 5.962134,\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\",\n    \"taxCategory\" : \"taxCategory\"\n  }, {\n    \"taxRate\" : 5.962134,\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\",\n    \"taxCategory\" : \"taxCategory\"\n  } ],\n  \"version\" : \"version\",\n  \"pricingLogicAlgorithm\" : [ {\n    \"@baseType\" : \"@baseType\",\n    \"validFor\" : {\n      \"startDateTime\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"endDateTime\" : \"2000-01-23T04:56:07.000+00:00\"\n    },\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"description\" : \"description\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"plaSpecId\" : \"plaSpecId\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  }, {\n    \"@baseType\" : \"@baseType\",\n    \"validFor\" : {\n      \"startDateTime\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"endDateTime\" : \"2000-01-23T04:56:07.000+00:00\"\n    },\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"description\" : \"description\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"plaSpecId\" : \"plaSpecId\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  } ],\n  \"lastUpdate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"name\" : \"name\",\n  \"constraint\" : [ {\n    \"@referredType\" : \"@referredType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\",\n    \"version\" : \"version\"\n  }, {\n    \"@referredType\" : \"@referredType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\",\n    \"version\" : \"version\"\n  } ]\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ProductOfferingPrice>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ProductOfferingPrice>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ProductOfferingPrice> retrieveProductOfferingPrice(
            @Parameter(in = ParameterIn.PATH, description = "Identifier of the ProductOfferingPrice", required = true, schema = @Schema())
            @PathVariable("id") String id,
            @Parameter(in = ParameterIn.QUERY, description = "Comma-separated properties to provide in response", schema = @Schema())
            @Valid @RequestParam(value = "fields", required = false) String fields) {

        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {

            try {
                if ("block-256-offer-price".equals(id)) {
                    ProductOfferingPrice price = new ProductOfferingPrice();

                    Money money = new Money();
                    money.setValue(85.43f);
                    money.setUnit("NZD");
                    price.setPrice(money);

                    Quantity unitOfMeasure = new Quantity();
                    unitOfMeasure.setAmount(256.00f);
                    unitOfMeasure.setUnits("kWh");
                    price.setUnitOfMeasure(unitOfMeasure);

                    price.setId("block-256-offer-price");
                    price.setHref("/platform/productCatalogManagement/v4/productOfferingPrice/block-256-offer-price");
                    price.setName("Prepaid 256kWh block");
                    price.setDescription("One time charge for a 256kWh block of usage");
                    price.setPriceType("otc");
                    price.setLifecycleStatus("Active");
                    price.setVersion("1");

                    return new ResponseEntity<>(price, HttpStatus.OK);
                }

                return new ResponseEntity<ProductOfferingPrice>(
                        objectMapper.readValue("...", ProductOfferingPrice.class),
                        HttpStatus.NOT_IMPLEMENTED
                );

            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ProductOfferingPrice>(HttpStatus.INTERNAL_SERVER_ERROR);
            } catch (Exception e) {
                log.error("Error creating ProductOfferingPrice object", e);
                return new ResponseEntity<ProductOfferingPrice>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ProductOfferingPrice>(HttpStatus.NOT_IMPLEMENTED);
    }
}
