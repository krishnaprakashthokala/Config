package org.ecommerce.config.web.frontend.exceptions;

import org.ecommerce.config.web.admin.exceptions.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author sergio
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Product Line not found")
public class ProductLineNotFoundException extends NotFoundException {
}
