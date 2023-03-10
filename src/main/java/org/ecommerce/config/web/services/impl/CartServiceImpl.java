package org.ecommerce.config.web.services.impl;

import java.util.Iterator;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ecommerce.config.web.models.shop.Cart;
import org.ecommerce.config.web.models.shop.CartItem;
import org.ecommerce.config.web.services.CartService;

/**
 * @author sergio
 */
@Service("cartService")
public class CartServiceImpl implements CartService {

	private static Logger logger = LoggerFactory.getLogger(CartServiceImpl.class);

	@Autowired
	private Cart cart;

	@Override
	public Set<CartItem> getAllItem() {
		return cart.getCartItems();
	}

	@Override
	public void addItem(CartItem item) {
		Double productPrice = item.getProductLine().getProduct().getPrice();
		item.setTotalPrice(productPrice * item.getQuantity());
		cart.addItem(item);
	}

	@Override
	public void updateItem(CartItem item) {
	}

	@Override
	public void updateItems(Set<CartItem> items) {
		Iterator<CartItem> ite = items.iterator();
		while (ite.hasNext()) {
			CartItem item = ite.next();
			if (!item.isRemove()) {
				Double productPrice = item.getProductLine().getProduct().getPrice();
				item.setTotalPrice(productPrice * item.getQuantity());
			} else {
				ite.remove();
			}
		}
		cart.setCartItems(items);
	}

	@Override
	public void removeAllItems() {
		cart.getCartItems().clear();
	}

	@Override
	public Double getSubtotal() {
		Set<CartItem> items = cart.getCartItems();
		Double subTotal = 0.0;
		for (CartItem item : items) {
			subTotal += item.getTotalPrice();
		}
		return subTotal;
	}

	@Override
	public CartItem getCartItemByProductLine(Long id) {
		CartItem cartItemResult = null;
		Set<CartItem> cartItems = cart.getCartItems();
		for (CartItem cartItem : cartItems) {
			if (cartItem.getProductLine().getId().equals(id)) {
				cartItemResult = cartItem;
				break;
			}
		}
		return cartItemResult;
	}

	@Override
	public Cart getCart() {
		return cart;
	}

	@Override
	public boolean isEmpty() {
		return cart.getCartItems().isEmpty();
	}
}
