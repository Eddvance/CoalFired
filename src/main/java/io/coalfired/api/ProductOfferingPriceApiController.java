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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-05-22T16:36:15.642271455Z[GMT]")
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

    @RequestMapping(value = "/productOfferingPrice",
            produces = {"application/json;charset=utf-8"},
            method = RequestMethod.GET)
    public ResponseEntity<List<ProductOfferingPrice>> listProductOfferingPrice(
            @Parameter(in = ParameterIn.QUERY, description = "Comma-separated properties to be provided in response", schema = @Schema())
            @Valid @RequestParam(value = "fields", required = false) String fields,
            @Parameter(in = ParameterIn.QUERY, description = "Requested index for start of resources to be provided in response", schema = @Schema())
            @Valid @RequestParam(value = "offset", required = false) Integer offset,
            @Parameter(in = ParameterIn.QUERY, description = "Requested number of resources to be provided in response", schema = @Schema())
            @Valid @RequestParam(value = "limit", required = false) Integer limit
    ) {
        try {
            // Pour l'instant, on retourne juste notre tarif block-256
            List<ProductOfferingPrice> prices = new ArrayList<>();

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

            prices.add(price);

            return new ResponseEntity<>(prices, HttpStatus.OK);

        } catch (Exception e) {
            log.error("Error listing ProductOfferingPrice", e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/productOfferingPrice/{id}",
            produces = {"application/json;charset=utf-8"},
            method = RequestMethod.GET)
    public ResponseEntity<ProductOfferingPrice> retrieveProductOfferingPrice(
            @Parameter(in = ParameterIn.PATH, description = "Identifier of the ProductOfferingPrice", required = true, schema = @Schema())
            @PathVariable("id") String id,
            @Parameter(in = ParameterIn.QUERY, description = "Comma-separated properties to provide in response", schema = @Schema())
            @Valid @RequestParam(value = "fields", required = false) String fields
    ) {
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

                log.info("Successfully retrieved ProductOfferingPrice for id: {}", id);
                return new ResponseEntity<>(price, HttpStatus.OK);
            }

            log.warn("ProductOfferingPrice not found for id: {}", id);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        } catch (Exception e) {
            log.error("Error retrieving ProductOfferingPrice for id: " + id, e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}