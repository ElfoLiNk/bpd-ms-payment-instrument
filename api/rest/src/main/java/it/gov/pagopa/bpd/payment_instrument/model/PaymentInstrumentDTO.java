package it.gov.pagopa.bpd.payment_instrument.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.OffsetDateTime;

@Data
public class PaymentInstrumentDTO {

    @ApiModelProperty(value = "${swagger.paymentInstrument.fiscalCode}", required = true)
    @JsonProperty(required = true)
    @NotBlank
    @Size(max = 16)
    private String fiscalCode;
    //    @FutureOrPresent//FIXME
    @ApiModelProperty(value = "${swagger.paymentInstrument.activationDate}", required = true)
    @JsonProperty(required = true)
    private OffsetDateTime activationDate;

}
