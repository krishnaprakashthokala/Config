package org.ecommerce.config.web.utils;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;

import java.util.List;

import org.ecommerce.config.web.models.search.ProductSortEnum;
import org.ecommerce.persistence.models.Product_;

/**
 * @author sergio
 */
public class ProductUtils {

	public final static Sort getProductOrder(ProductSortEnum productSort) {
		List<Order> order = null;
		switch (productSort) {
		case NAME_ASC:
			order = (List<Order>) new Order(Sort.Direction.ASC, Product_.name.getName());
			break;
		case NAME_DESC:
			order = (List<Order>) new Order(Sort.Direction.DESC, Product_.name.getName());
			break;
		case PRICE_ASC:
			order = (List<Order>) new Order(Sort.Direction.ASC, Product_.price.getName());
			break;
		case PRICE_DESC:
			order = (List<Order>) new Order(Sort.Direction.DESC, Product_.price.getName());
			break;
		default:
			order = (List<Order>) new Order(Sort.Direction.DESC, Product_.createAt.getName());
		}
		return new Sort(order);
	}
}
