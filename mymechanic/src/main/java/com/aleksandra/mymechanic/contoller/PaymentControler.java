package com.aleksandra.mymechanic.contoller;

import com.aleksandra.mymechanic.dto.PaymentDTO;
import com.aleksandra.mymechanic.dto.ResponsePaymentDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentControler {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponsePaymentDTO executePayment ( @RequestBody PaymentDTO paymentDTO){
        logger.info("Message received successfully " + paymentDTO.getName());
        final ResponsePaymentDTO responsePaymentDTO = new ResponsePaymentDTO(true,paymentDTO.getName());
        return responsePaymentDTO;
    }
}
